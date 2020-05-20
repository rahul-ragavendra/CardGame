package com.cardgame.Util;

import java.util.Scanner;

public class KeyboardUtil {

	public static String getString() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getString(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

	public static int getint(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
