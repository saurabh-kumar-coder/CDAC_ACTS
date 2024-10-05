package com.saurabh.data;

import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
import com.saurabh.pojo.Books;
import com.saurabh.utility.EnumBookType;
public class BookData {
	public static Map<String, Books> getBookData() {
		Map<String, Books> bookData = new HashMap<String,Books>();
		bookData.put("To Kill a Mockingbird", new Books("To Kill a Mockingbird", EnumBookType.valueOf("MYSTERY"), LocalDate.parse("1960-07-11"), "Harper Lee", 12));
		bookData.put("Nineteen Eighty-Four", new Books("Nineteen Eighty-Four", EnumBookType.valueOf("FANTASY"), LocalDate.parse("1949-06-08"), "George Orwell", 8));
		bookData.put("A Brief History of Time", new Books("A Brief History of Time", EnumBookType.valueOf("FICTION"), LocalDate.parse("1988-04-01"), "Stephen Hawking", 5));
//		bookData.put("The Art of War", new Books("The Art of War", EnumBookType.valueOf("HORROR"), LocalDate.parse("2000-01-01"), "Sun Tzu", 10));
//		bookData.put("Harry Potter and the Sorcerer's Stone", new Books("Harry Potter and the Sorcerer's Stone", EnumBookType.valueOf("MYSTERY"), LocalDate.parse("1997-06-26"), "J.K. Rowling", 15));
//		bookData.put("The Diary of a Young Girl", new Books("The Diary of a Young Girl", EnumBookType.valueOf("FANTASY"), LocalDate.parse("1947-06-25"), "Anne Frank", 7));
//		bookData.put("Sapiens", new Books("Sapiens", EnumBookType.valueOf("MYSTERY"), LocalDate.parse("2011-01-01"), "Yuval Noah Harari", 9));
//		bookData.put("The Catcher in the Rye", new Books("The Catcher in the Rye", EnumBookType.valueOf("FICTION"), LocalDate.parse("1951-07-16"), "J.D. Salinger", 6));
//		bookData.put("Educated", new Books("Educated", EnumBookType.valueOf("THRILLER"), LocalDate.parse("2018-02-20"), "Tara Westover", 11));
//		bookData.put("The Great Gatsby", new Books("The Great Gatsby", EnumBookType.valueOf("FANTASY"), LocalDate.parse("1925-04-10"), "F. Scott Fitzgerald", 4));
		bookData.put("A", new Books("A", EnumBookType.valueOf("FANTASY"), LocalDate.parse("1925-04-10"), "A", 5));
		return bookData;
	}
}
