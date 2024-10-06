package com.saurabh.impl;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.saurabh.pojo.Books;
import com.saurabh.utility.EnumBookType;
import com.saurabh.exceptions.BookNotFoundException;
import com.saurabh.exceptions.DuplicateBookEntryException;
import com.saurabh.data.BookData;

public class Impl {
	public static void showMenu() {
		System.out.println("========== MENU ==========");
		System.out.println("1. Add Book");
		System.out.println("2. Display All Book");
		System.out.println("3. Allot book to Students. Find by book title");
		System.out.println("4. Take book return ( quantity +1) Find by book title");
		System.out.println("5. Remove book");
	}

	private static Map<String, Books> addBook(Map<String, Books> bookData, Scanner sc)
			throws DuplicateBookEntryException {
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
		if (bookData.containsKey(bookTitle)) {
			throw new DuplicateBookEntryException("Book Already Present in Library");
		}
		bookData.put(bookTitle, new Books(bookTitle, bookType, bookPublishedDate, bookAuthorName, bookQuantity));
		return bookData;
	}

	// whole implementation of comparator in TreeMap
	public static void printBooks(Map<String, Books> bookData) {
		List<Map.Entry<String, Books>> entries = new ArrayList<>(bookData.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String, Books>>() {
			@Override
			public int compare(Map.Entry<String, Books> b1, Map.Entry<String, Books> b2) {
				return b1.getKey().compareTo(b2.getKey());
			}
			// public int compare(Map.Entry<String, Books> b1, Map.Entry<String, Books> b2)
			// {
			// return b2.getKey().compareTo(b1.getKey());
			// }
		});
		for (Map.Entry<String, Books> entry : entries) {
			System.out.println(entry.getKey() + " -> "); // + entry.getValue());
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Books> bookData = new TreeMap<>(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o2.compareTo(o1);
				}
			});
			// Map<String, Books> bookData = new TreeMap<>();
			bookData = BookData.getBookData();
			char ch = 0;
			do {
				showMenu();
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
					case 1: {
						System.out.println("Case 1 called");
						try {
							bookData = addBook(bookData, sc);
						} catch (DuplicateBookEntryException e) {
							System.out.println(e.getMessage());
						}
						System.out.println(bookData.size());
					}
						break;
					case 2: {
						System.out.println("Printing all the element in the Map : ");
						printBooks(bookData);
					}
						break;
					case 3: {
						try {
							bookIssuedByStudent(bookData, sc);
						} catch (BookNotFoundException e) {
							System.out.println(e.getMessage());
						}

					}
						break;
					case 4: {
						try {
							bookReturnByStudent(bookData, sc);
						} catch (BookNotFoundException e) {
							System.out.println(e.getMessage());
						}
					}
						break;
					case 5: {
						try {
							removeBook(bookData, sc);
						} catch (BookNotFoundException e) {
							System.out.println(e.getMessage());
						}
					}
						break;
					default: {
						System.out.println("You entered wrong input");
					}
				}
				System.out.println("Do you want to continue : Press Y/y");
				ch = sc.next().charAt(0);
			} while (ch == 'y' || ch == 'Y');
		}
	}

	private static void removeBook(Map<String, Books> bookData, Scanner sc) throws BookNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("enter the book you want to remove.");
		String bookTitle = sc.nextLine();
		if (!bookData.containsKey(bookTitle)) {
			throw new BookNotFoundException("Book not found. So, can't be removed");
		}
		bookData.remove(bookTitle);
	}

	private static void bookReturnByStudent(Map<String, Books> bookData, Scanner sc) throws BookNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Enter the book returned by the student");
		String bookTitle = sc.nextLine();
		if (!bookData.containsKey(bookTitle)) {
			throw new BookNotFoundException("Student is returning a wrong book");
		}
		bookData.get(bookTitle).setBookQuantity(bookData.get(bookTitle).getBookQuantity() + 1);
	}

	private static void bookIssuedByStudent(Map<String, Books> bookData, Scanner sc) throws BookNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("enter the book title choosed by student: ");
		String bookTitle = sc.nextLine();
		Books book = bookData.get(bookTitle);
		boolean isFound = false;
		if (book == null) {
			throw new BookNotFoundException("Book not present in the Library");
		}
		if (bookData.get(bookTitle).getBookQuantity() <= 0) {
			throw new BookNotFoundException("Book is not present at the moment.");
		}

		isFound = bookData.containsKey(bookTitle);
		bookData.get(bookTitle).setBookQuantity(bookData.get(bookTitle).getBookQuantity() - 1);
	}

}