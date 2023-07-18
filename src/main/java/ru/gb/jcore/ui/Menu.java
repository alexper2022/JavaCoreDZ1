package ru.gb.jcore.ui;


import ru.gb.jcore.AppRuner.AppRun;
import ru.gb.jcore.io.FileInOut;
import ru.gb.jcore.io.UserInput;

/**
 * Класс для вывода меню пользователя
 **/
public class Menu {

	/**
	 * непосредственный вывод меню
	 **/
	public static void menu() {
		System.out.printf("%n%nМеню:%n");
		System.out.println("1) Записать заметку в файл");
		System.out.println("2) Прочитать заметки из файла");
		System.out.println("0) Выйти из программы");
		int mn = UserInput.userIn().nextInt();
		switch (mn) {
			case (1): {
				UserInput.userInputData();
				AppRun.runApp();
			}
			case (2): {
				String[] str = null;
				str = FileInOut.read();
				for (String string : str) {
					System.out.println(string);
				}
				AppRun.runApp();
			}
			case (0): {
				System.exit(0);
			}
			default: {
				AppRun.runApp();
			}
		}
	}


}
