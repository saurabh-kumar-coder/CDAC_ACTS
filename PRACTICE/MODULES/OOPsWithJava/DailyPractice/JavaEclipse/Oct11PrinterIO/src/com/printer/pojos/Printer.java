package com.printer.pojos;

import java.io.Serializable;
import java.time.LocalDate;

import com.printer.enums.PrinterType;

public class Printer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9126829557546350917L;
	private String serialNo;
	private String modelNo;
	private Double price;
	private PrinterType printerType;
	private LocalDate manufacturingDate;
	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Printer(String serialNo, String modelNo, Double price, PrinterType printerType,
			LocalDate manufacturingDate) {
		super();
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.printerType = printerType;
		this.manufacturingDate = manufacturingDate;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public PrinterType getPrinterType() {
		return printerType;
	}
	public void setPrinterType(PrinterType printerType) {
		this.printerType = printerType;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	@Override
	public String toString() {
		return "Printer [serialNo=" + serialNo + ", modelNo=" + modelNo + ", price=" + price + ", printerType="
				+ printerType + ", manufacturingDate=" + manufacturingDate + "]";
	}
}