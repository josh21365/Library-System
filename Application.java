package com.joshua.library_app;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	User current_user = login_menu(scanner);
    	main_menu(scanner, current_user);
    	scanner.close();
    }
    static void main_menu(Scanner scanner, User current_user) {
    	do {
    	System.out.println("1. Checkout");
    	System.out.println("2. Browse Selection");
    	System.out.println("3. Quit");
    	System.out.print("Pick a number for your choice (1-3): ");
    	
    		try {
    		int user_choice = scanner.nextInt();
        	scanner.nextLine();
    		switch(user_choice) {
    		case 1: {
    			// #TODO
    			break;
    		}
    		case 2:{
    			// #TODO
    			break;
    		}
    		case 3:{
    			return;
    		}

    		default: {
    			System.out.println("\nInvalid choice, please pick a number between 1-3.");
    			continue;
    		} 
    	}
    		} catch (InputMismatchException e) {
    			System.out.println("\nPlease enter a number between 1-3.");
    			scanner.nextLine();
    		}
    	
    	}while(continue_browsing(scanner));
    
    }
    static void checkout(Scanner scanner) {
    	System.out.println("Which book would you like to checkout?");
		String book_checkout = scanner.nextLine();
		// #TODO add them taking from the arrayList
		
    }
    static void browse_books() {
    	// # TODO add a selection of books
    }
   static boolean continue_browsing(Scanner scanner) {
    	System.out.print("Do you want to continue browsing our selection? (yes/no): ");
    	String user_choice = scanner.nextLine();
    	System.out.println();
    	
    	if(!user_choice.equalsIgnoreCase("yes")) {
    		return false;
    	}
		return true;
    }
   static User login_menu(Scanner scanner) {
	   String role;
	   String password;
	   String email;
	   
	   System.out.println("Welcome to Joshua's Online Library");

	   while(true) {
		   System.out.print("Enter your email: ");
		    email = scanner.nextLine();
		   
		    if(!email.contains("@")) {
				   System.out.println("This email is invalid");
				   continue;
			   }
		   System.out.print("What is your password: ");
		   password = scanner.nextLine();
		    if(password.length() <= 10) {
				   System.out.println("This password is too weak");
				   continue;
			   }
		   
		   if(email.equalsIgnoreCase("joshua@gmail.com") && password.equals("Cherrycake#21")) {
			    role = "admin";
		   }
		   else {
			    role = "user";
		   }
			   return new User(email,password,role);

	   }
   }
}