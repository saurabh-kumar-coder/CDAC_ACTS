package com.saurabh.pojo;

import com.saurabh.utility.EnumBookType;
import java.time.LocalDate;
public class Books {
	private String bookTitle;
	private EnumBookType bookType;
	private LocalDate bookPublishedDate;
	private String bookAuthorName;
	private Integer bookQuantity;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(String bookTitle, EnumBookType bookType, LocalDate bookPublishedDate,
			String bookAuthorName, Integer bookQuantity) {
		super();
		this.bookTitle = bookTitle;
		this.bookType = bookType;
		this.bookPublishedDate = bookPublishedDate;
		this.bookAuthorName = bookAuthorName;
		this.bookQuantity = bookQuantity;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public EnumBookType getBookType() {
		return bookType;
	}
	public void setBookType(EnumBookType bookType) {
		this.bookType = bookType;
	}
	public LocalDate getBookPublishedDate() {
		return bookPublishedDate;
	}
	public void setBookPublishedDate(LocalDate bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}
	public String getBookAuthorName() {
		return bookAuthorName;
	}
	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}
	public Integer getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	@Override
	public String toString() {
		return "Books [bookTitle=" + bookTitle + ", bookType="
				+ bookType + ", bookPublishedDate=" + bookPublishedDate + ", bookAuthorName=" + bookAuthorName
				+ ", bookQuantity=" + bookQuantity + "]";
	}
	
}