package ru.gb.jcore.io;

import java.util.Scanner;

/**
 * Обработка пользовательского ввода
 **/
public class UserInput {

	/**
	 * простейший обработчик ввода
	 **/
	public static Scanner userIn() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}

	/**
	 * Ввод строки от пользователя
	 * и отправка этой строки на
	 * запись в файл
	 **/
	public static void userInputData() {
		System.out.print("Введите заметку: ");
		String str = userIn().nextLine();
		int wrt = FileInOut.write(str);
		if (wrt == -1) {
			System.out.println("Запись в файл не удалась!");
		} else {
			System.out.println("Запись в файл выполнена успешно!");
		}
	}
}

