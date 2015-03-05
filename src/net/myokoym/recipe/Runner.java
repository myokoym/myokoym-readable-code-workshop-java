package net.myokoym.recipe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runner {

	public static final int recipeSize = 3;

	public static void main(String[] args) {
		String dataPath = args[0];
		int targetId = 0;
		if (args.length > 1) {
			targetId = Integer.parseInt(args[1]);
		}
		
		String[] lines = readLines(dataPath);
		Recipe[] recipes = createRecipes(lines);

		for (Recipe recipe : recipes) {
			if (targetId != 0 && targetId != recipe.id) {
				continue;
			}
			System.out.println(recipe);
		}
	}

	private static String[] readLines(String dataPath) {
		File file = new File(dataPath);
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.err.println("ファイルのオープンに失敗しました: <" + dataPath + ">");
			System.exit(1);		
		}
		
		String[] lines = new String[recipeSize];
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			for (int i = 0; i < lines.length; i++) {
				lines[i] = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.err.println("ファイルの読み込みに失敗しました: <" + dataPath + ">");
			System.exit(1);		
		}
		
		return lines;
	}
	
	private static Recipe[] createRecipes(String[] lines) {
		Recipe[] recipes = new Recipe[lines.length];
		for (int i = 0; i < lines.length; i++) {
			recipes[i] = new Recipe(i + 1, lines[i]);
		}
		return recipes;
	}
}
