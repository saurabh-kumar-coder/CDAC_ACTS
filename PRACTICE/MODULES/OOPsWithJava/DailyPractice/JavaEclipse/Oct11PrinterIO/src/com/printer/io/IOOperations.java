package com.printer.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Map;

import com.printer.enums.PrinterType;
import com.printer.pojos.Printer;

public class IOOperations {
	public static void writeIntoFile(Map<String, Printer> mapData) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("Hello.ser"))){
			for(Map.Entry<String, Printer> map : mapData.entrySet()) {
				dos.writeUTF(map.getValue().getModelNo());
				dos.writeUTF(map.getValue().getSerialNo());
				dos.writeDouble(map.getValue().getPrice());
				dos.writeUTF(map.getValue().getPrinterType().getValue());
				dos.writeUTF(map.getValue().getManufacturingDate().toString());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static Map<String, Printer> readFromTheFile() {
		try(DataInputStream dis = new DataInputStream(new FileInputStream("Hello.ser"))){
			Map<String, Printer> map = null;
			while(dis.available() > 0) {
				String modelNo = dis.readUTF();
                String serialNo = dis.readUTF();
                Double price = dis.readDouble();
                String printerTypeValue = dis.readUTF();
                String manufacturingDate = dis.readUTF();
                Printer printer = new Printer(serialNo, modelNo, price, PrinterType.valueOf(printerTypeValue), LocalDate.parse(manufacturingDate));
                System.out.println(modelNo);
                System.out.println(serialNo);
                System.out.println(price);
                System.out.println(printerTypeValue);
                System.out.println(manufacturingDate);
                map.put(serialNo, printer);
                return map;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
