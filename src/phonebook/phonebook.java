package phonebook;

import java.util.Scanner;

public class phonebook {

	public static void main(String[] args) {
		boolean DEBUG = false;
		phonehomemenu(DEBUG);
		System.out.println("quitting from main");
	}

	public static void phonehomemenu(boolean debug) {
		Scanner menuScan = new Scanner(System.in);
		int full = 1;
		int homemenuChoice = -1;
		while (full == 1) {
			System.out.println("0. Change Debug Mode");
			System.out.println("1. Add Entry");
			System.out.println("2. Remove Entry");
			System.out.println("3. Display Entry");
			System.out.println("4. Display All Entries");
			System.out.println("5. Quit");
			System.out.print("Choice: ");
			homemenuChoice = menuScan.nextInt();
			System.out.println();

			switch (homemenuChoice) {

			case 0:
				debug = changeDebugMode();
				break;
			case 1:
				addEntry();
				break;
			case 2:
				removeEntry();
				break;
			case 3:
				/*
				 * do we search? request specific? if we search, do we have a
				 * separate search case plus have a case for display an entry
				 * you know the name of? what if I only know one attribute? ->
				 * can still show the value
				 */
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
	
	public static void showMenu(){
		
	}

	public static boolean changeDebugMode() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean debug = false;
		char runDch;
		String runAsk = "r";
		System.out.print("Enter runmode [r],d: ");

		runAsk = sc.nextLine();
		runAsk = runAsk.toLowerCase();
		runDch = runAsk.charAt(0);

		if (runDch == 'd') {
			System.out.println("DEBUG mode ENABLED\n");
			debug = true;
		} else if (runDch == 'r') {
			System.out.println("DEBUG mode DISABLED\n");
			debug = false;
		} else {
			debug = false;
			System.out.println("incorrect value input. use r or d. defaulting to r");
		}
		// sc.close();
		return debug;
	}

	public static void addEntry() {

	}

	public static void removeEntry() {

	}

	public static void displayEntry() {

	}

	public static void displayAll() {

	}
}
