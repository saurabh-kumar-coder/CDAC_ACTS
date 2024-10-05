package com.saurabh.impl;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
	
	private static Map<String, Books> addBook(Map<String, Books> bookData, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter Book Name (A)");
		String bookTitle = sc.nextLine();
		System.out.println("Enter Book Type (HORROR)");
		String bookTyp = sc.nextLine();
		EnumBookType bookType = EnumBookType.valueOf(bookTyp.toUpperCase());
		System.out.println("Enter Book Published Date ('2024-09-11')");
		String localDate = sc.nextLine();
		LocalDate bookPublishedDate = LocalDate.parse(localDate);
		System.out.println("Enter Book Author Name (A)");
		String bookAuthorName = sc.nextLine();
		System.out.println("Enter Book Quantity (5)");
		Integer bookQuantity = sc.nextInt();
		bookData.put(bookTitle, new Books(bookTitle, bookType,bookPublishedDate,bookAuthorName,bookQuantity));
		return bookData;
	}
	
	public static void printBooks(Map<String, Books> bookData) {
		Set<Map.Entry<String, Books>> entries = bookData.entrySet();
		for(Map.Entry<String, Books> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
	
	public static void main(String[]args) {
		try(Scanner sc = new Scanner(System.in))
		{
			Map<String, Books> bookData = new HashMap<>();
			bookData = BookData.getBookData();
			char ch = 0;
			do {
				showMenu();
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case 1:{
						System.out.println("Case 1 called");
						bookData = addBook(bookData, sc);
						System.out.println(bookData.size());
					}
					break;
					case 2:{
						System.out.println("Printing all the element in the Map : ");
						printBooks(bookData);
					}
					break;
					case 3: {
						System.out.println("enter the book title choosed by student: ");
						String bookTitle = sc.nextLine();
						Books book = bookData.get(bookTitle);
						boolean isFound = false;
						if(book != null) {
							isFound = bookData.containsKey(bookTitle);
							System.out.println(isFound);
							bookData.get(bookTitle).setBookQuantity(bookData.get(bookTitle).getBookQuantity() - 1);
						} else {
							System.out.println(isFound);
						}
					}
					break;
					default : {
						System.out.println("You entered wrong input");
					}
				}
				System.out.println("Do you want to continue : Press Y/y");
				ch = sc.next().charAt(0);
			} while(ch == 'y' || ch == 'Y');
		}
	}


	
}