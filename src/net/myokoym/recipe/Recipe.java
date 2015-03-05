package net.myokoym.recipe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Recipe {

	public static int recipeSize = 3;
	
	String name = null;

	public static void main(String[] args) {
		String dataPath = args[0];
		
		Recipe[] recipes = readLines(dataPath);

		for (Recipe recipe : recipes) {
			System.out.println(recipe.name);
		}
	}
	
	private static Recipe[] readLines(String dataPath) {
		File file = new File(dataPath);
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.err.println("ファイルのオープンに失敗しました: <" + dataPath + ">");
			System.exit(1);		
		}
		
		Recipe[] recipes = new Recipe[recipeSize];
		for (int i = 0; i < recipes.length; i++) {
			recipes[i] = new Recipe();
		}		
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			for (int i = 0; i < recipes.length; i++) {
				recipes[i].name = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.err.println("ファイルの読み込みに失敗しました: <" + dataPath + ">");
			System.exit(1);		
		}
		
		return recipes;
	}
}
