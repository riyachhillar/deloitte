package com.deloitte.library.main;

import java.util.*;

import com.deloitte.library.model.Books;
import com.deloitte.library.services.BookInterfaceImplementation;





public class DemoBooks extends BookInterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 ArrayList<Books> books = new ArrayList<Books>();
		 BookInterfaceImplementation mainObj = new BookInterfaceImplementation();
			while (true) {
				System.out.println("Please select an option");
				System.out.println("option 1 to add books ");
				System.out.println("option 2 to display books");
				System.out.println("option 3 to exit the application");
				
				String option = sc.next();
			

				switch (option) {
				case "1":
					String bname, author;
					int bprice;
                System.out.println("Enter book details");
                
				System.out.println("Enter book name");
				bname =sc.next();
				System.out.println("Enter book price");
				bprice = Integer.parseInt(sc.next());
				System.out.println("Enter book author");
				author = sc.next();
				
               mainObj.insertBook(bname, author, bprice);
				break;
				
				case "2" : 
					for(Books x : books) {
						System.out.println(x);
					}
					break;
				
				case "3" :
					System.out.println("Application ended");
					System.exit(0);
					break;

	}

}
}
}