

package ru.gb.jcore.io;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Чтение и запись из/в файл(а)
 **/
public class FileInOut {
	/**
	 * Запись в файл
	 * Принимает строку на вход
	 * Возвращает 1 в случае удачного сохранения
	 * и -1 в случае неудачной записи
	 **/
	public static int write(String data) {
		try (FileWriter fw = new FileWriter("data.txt", true);) {
			String dateTime = LocalDateTime.now().toString();
			StringBuilder sb = new StringBuilder(dateTime);
			sb.append(" --> ");
			sb.append(data);
			sb.append("\n");
			fw.write(sb.toString());
			return 1;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	/**
	 * Чтение из файла
	 * Возвращает массив строк
	 * в случае неудачи возвращает null
	 **/
	public static String[] read() {

		try {
			List<String> listOfStrings = new ArrayList<>();
			BufferedReader br = new BufferedReader(
					new FileReader("data.txt"));
			String line = br.readLine();
			while (line != null) {
				listOfStrings.add(line);
				line = br.readLine();
			}
			return listOfStrings.toArray(new String[0]);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}

