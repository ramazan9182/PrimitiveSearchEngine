package main;

import java.util.Scanner;

import core.SearchEngine;
import core.SearchResult;
import util.UserConsoleInteractionMessages;

public class Driver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UserConsoleInteractionMessages.displayWelcomeMessage();
		UserConsoleInteractionMessages.askSearchInput();
		String key = input.nextLine();
		SearchResult searchResult = new SearchEngine().search(key);
		System.out.println(searchResult.getResults());
		// TODO : UserConsoleInteractionMessages.diplayFormattedResults(searchResult)
		input.close();
	}
}
