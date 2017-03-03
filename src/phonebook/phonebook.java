package phonebook;

import java.util.Scanner;
import java.util.List;

public class phonebook {
	public static boolean DEBUG = false;
	public static void main(String[] args) {
		phonehomemenu();
		System.out.println("quitting from main");
		if (DEBUG == true){
			System.out.println("exited with DEBUG = "+DEBUG);
		}
	}

	public static void phonehomemenu() {
		Scanner menuScan = new Scanner(System.in);
		int full = 1;
		int homemenuChoice = -1;
		while (full == 1) {
			showMenu();
			homemenuChoice = menuScan.nextInt();
			System.out.println();

			switch (homemenuChoice) {

			case 0:
				changeDebugMode();
				break;
			case 1:
				addEntry();
				break;
			case 2:
				removeEntry();
				break;
			case 3:
				displayEntry();
				break;
			case 4:
				displayAll();
				break;
			case 5:
				full = 0;
				break;

			}

		}
		menuScan.close();
	}

	public static void showMenu() {
		if (DEBUG == true){
			System.out.println("entered showMenu");
		}
		System.out.println("0. Change Debug Mode");
		System.out.println("1. Add Entry");
		System.out.println("2. Remove Entry");
		System.out.println("3. Display Entry");
		System.out.println("4. Display All Entries");
		System.out.println("5. Quit");
		//System.out.print("Choice: ");
		if (DEBUG == true){
			System.out.println("exiting showMenu");
			System.out.print("Choice: ");
		}else System.out.print("Choice: ");
	}

	public static void changeDebugMode() {
		if (DEBUG == true){
			System.out.println("entered changeDebugMode");
		}
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//boolean debug = false;
		char runDch;
		String runAsk = "r";
		System.out.print("Enter runmode [r],d: ");

		runAsk = sc.nextLine();
		runAsk = runAsk.toLowerCase();
		runDch = runAsk.charAt(0);

		if (runDch == 'd') {
			System.out.println("DEBUG mode ENABLED\n");
			DEBUG = true;
		} else if (runDch == 'r') {
			System.out.println("DEBUG mode DISABLED\n");
			DEBUG = false;
		} else {
			DEBUG = false;
			System.out.println("incorrect value input. use r or d. defaulting to r");
			System.out.println("DEBUG mode DISABLED\n");
		}
		// sc.close();
		if (DEBUG == true){
			System.out.println("exiting showMenu");
		}
		
	}

	public static void addEntry() {
		System.out.println("no code");
	}

	public static void removeEntry() {
		System.out.println("no code");
	}

	public static void displayEntry() {
		/*
		 * do we search? request specific? if we search, do we have a separate
		 * search case plus have a case for display an entry you know the name
		 * of? what if I only know one attribute? -> can still show the value
		 */
		System.out.println("no code");
	}

	public static void displayAll() {
		System.out.println("no code");
	}
}
