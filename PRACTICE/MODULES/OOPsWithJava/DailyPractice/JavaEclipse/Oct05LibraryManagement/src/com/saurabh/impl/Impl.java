package com.saurabh.impl;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Map;
import com.saurabh.pojo.Books;
import com.saurabh.utility.EnumBookType;
import com.saurabh.data.BookData;
public class Impl {
	public static void showMenu() {
		System.out.println("========== MENU ==========");
		System.out.println("1. Add Book");
		System.out.println("2. Display All Book");
		System.out.println("3. Allot book to Students. Find by book title");
		System.out.println("Take book return ( quantity +1) Find by book title");
		System.out.println("Remove book");
	}
	
	private static void addBook(Map<String, Books> bookData, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter Book Name");
		String bookTitle = sc.nextLine();
		System.out.println("Enter Book Name");
		String bookTyp = sc.nextLine();
		EnumBookType bookType = EnumBookType.valueOf(bookTyp.toUpperCase());
		System.out.println("Enter Book Name");
		String localDate = sc.nextLine();
		LocalDate bookPublishedDate = LocalDate.parse(localDate);
		System.out.println("Enter Book Name");
		String bookAuthorName = sc.nextLine();
		System.out.println("Enter Book Name");
		Integer bookQuantity = sc.nextInt();
		Books book = new Books(bookTitle, bookType,bookPublishedDate,bookAuthorName,bookQuantity);
		
	}
	
	public static void main(String[]args) {
		try(Scanner sc = new Scanner(System.in))
		{
			char ch = 0;
			do {
				showMenu();
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				switch(choice) {
					case 1:{
						Map<String, Books> bookData = BookData.getBookData();
						addBook(bookData, sc);
					} 
				}
				System.out.println("Do you want to continue : Press Y/y");
				ch = sc.next().charAt(0);
			} while(ch == 'y' || ch == 'Y');
		}
	}


	
}