package net.myokoym.recipe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Recipe {

	public static void main(String[] args) {
		String fileName = args[0];
		File file = new File(fileName);
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.err.println("ファイルのオープンに失敗しました: <" + fileName + ">");
			System.exit(1);		
		}
		
		String recipes[] = new String[3];
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			recipes[0] = bufferedReader.readLine();
			recipes[1] = bufferedReader.readLine();
			recipes[2] = bufferedReader.readLine();
			bufferedReader.close();
		} catch (IOException e) {
			System.err.println("ファイルの読み込みに失敗しました: <" + fileName + ">");
			System.exit(1);		
		}

		for (String recipe : recipes) {
			System.out.println(recipe);
		}
	}
}
