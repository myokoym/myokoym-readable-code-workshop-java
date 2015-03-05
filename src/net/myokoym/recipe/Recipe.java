package net.myokoym.recipe;

public class Recipe {

	int id = 0;
	String name = null;

	public Recipe(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;
	}
}
