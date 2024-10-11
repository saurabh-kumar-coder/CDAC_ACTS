package com.printer.impl;
/*
Store the printers objects in file using ObjectOutputStream.On program
startup read all printers from file and store them in HashMap where
serialNo will be key and printer object will be value.
4.Display printers sorted by Prices (user comparing method of Comparator)
5.Filter by printerType ( use filter method of Stream API)
6.Remove a book
7. Show printer by PrinterType ( use goupingBy of Stream)
0.Save in file and Exit
*/
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.printer.enums.PrinterType;
import com.printer.io.IOOperations;
import com.printer.pojos.Printer;

public class Impl {
	public static void showMenu() {
		System.out.println("******* MENU ******");
		System.out.println("0. Print all printers");
		System.out.println("1. write into file");
		System.out.println("2. read from the file");
		System.out.println("3. update price");
		System.out.println("4. natural sorting");
		System.out.println("5. reversed sorting");
		System.out.println("6. show printer by printer type");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Printer> map = new HashMap<>();
		map.put("1", new Printer("1", "1", 2000.0, PrinterType.valueOf("LAZER"), LocalDate.now()));
		map.put("9", new Printer("9", "90", 1200.0, PrinterType.valueOf("INKJET"), LocalDate.now()));
		map.put("7", new Printer("7", "5", 3001.0, PrinterType.valueOf("DOTMATRIX"), LocalDate.now()));
		map.put("2", new Printer("2", "2", 2500.0, PrinterType.valueOf("LAZER"), LocalDate.now()));
		map.put("8", new Printer("8", "85", 1500.0, PrinterType.valueOf("INKJET"), LocalDate.now()));
		char ch = 0;
		do {
			showMenu();
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 0: {
					map.entrySet().forEach(System.out::println);
				}
				break;
				case 1: {
					Printer printer = enterData(sc);
					IOOperations.writeIntoFile(map);
					map.put(printer.getSerialNo(), printer);
				}
				break;
				case 2: {
					map = IOOperations.readFromTheFile();
				} 
				break;
				case 3: {
					System.out.println("enter serial number");
					String str = sc.nextLine();
					System.out.println("enter amount to be updated");
					Double newPrice = sc.nextDouble();
					map.entrySet().stream()
						.filter(t -> t.getKey().equalsIgnoreCase(str))
						.forEach(t -> {
							t.getValue().setPrice(newPrice);
						});
					map.entrySet().forEach(System.out::println);
				} 
				break;
				case 4: {
					System.out.println("Sort using price");
					map.entrySet().stream()
						.sorted(Comparator.comparingDouble(printer -> printer.getValue().getPrice()))
						.forEach(System.out::println);
				}
				break;
				case 5: {
					System.out.println("Sort using price reversed");
					map.entrySet().stream()
						.sorted(Map.Entry.<String, Printer>comparingByValue(Comparator.comparingDouble(Printer::getPrice).reversed()))
						.forEach(System.out::println);
				}
				break;
				case 6: {
					System.out.println("show printer by printer group type");
					Map<PrinterType,List<Printer>> collect = map.values().stream()
						.collect(Collectors.groupingBy(Printer::getPrinterType));
						collect.forEach((t,v)->{
							System.out.println(t + " " + v);
						});
				}
			}
			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

	public static Printer enterData(Scanner sc) {
		System.out.println("enter serialNo");
		String serialNo = sc.next();
		System.out.println("enter ModelNo");
		String modelNo = sc.next();
		System.out.println("enter price");
		Double price = sc.nextDouble();
		System.out.println("printer Type");
		PrinterType type = PrinterType.valueOf(sc.next());
		System.out.println("Manufacturing Date");
		LocalDate date = LocalDate.parse("2013-12-26");
		Printer printer = new Printer(serialNo, modelNo, price, type, date);
		return printer;
	}
}
