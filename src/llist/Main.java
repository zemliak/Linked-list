package llist;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Library library = new Library();
		String decision = "";
		Scanner k = new Scanner(System.in);
		while(true){
			System.out.println("Please select what you need to do:\nAdd, Delete, Find, List or Quit.");
			decision = k.next();
			if(decision.equals("Quit"))
				break;
			switch (decision){
				case "Add" : 
					library.add();
					break;
				case "Delete" :
					library.delete();
					break;
				case "Find" :
					library.find();
					break;
				case "List" :
					library.list();
					break;
				case "Quit" :
					System.out.println("Session ended.");
					break;			
				default :
					System.out.println("Error. Please try again.");
					break;
			}
		}
			
	}
}
