package com.coderscampus;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		int number = 1 + (int)(100 * Math.random());
			
		int j = 5;
		int i, guess = 0;
		System.out.println("Pick a number between 1 and 100");
		
		for (i = 0; i < j; i++) {
			
			guess = scanner.nextInt();
			
			if (number == guess) {
				System.out.println("You win!");
				break;
			}
			
			if (guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
			else if (guess < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
			else if (number > guess && i != j - 1) {
				System.out.println("Please pick a higher number");
			}
			else if (number < guess && i != j - 1) {
				System.out.println("Please pick a lower number");
			}
		}
		if(i == j) {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + number);
		}
		scanner.close();
	}
}
