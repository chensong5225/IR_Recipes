package Classes;

import java.util.ArrayList;

public class Recipe{
	
	String title;
	ArrayList<String> directions = null;
	double fat = 1;
	String date = "";
	ArrayList<String> categories = null;
	double calories = 1;
	String desc = "";
	double protein = 1;
	double rating = 1;
	ArrayList<String> ingredients = null;
	double sodium = 1;
	
	public Recipe(String title, ArrayList<String> directions, double fat, String date, ArrayList<String> categories,
			double calories, String desc, double protein, double rating, ArrayList<String> ingredients, 
			double sodium){
		this.title = title;
		this.directions = directions;
		this.fat = fat;
		this.date = date;
		this.categories = categories;
		this.calories = calories;
		this.desc = desc;
		this.protein = protein;
		this.rating = rating;
		this.ingredients = ingredients;
		this.sodium = sodium;
	}
	
	public Recipe(String t){
		title = t;
	}
	
	@Override
	public int hashCode() {
	    return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    Recipe other = (Recipe) obj;
	    if (!title.equals(other.title))
	        return false;
	    return true;
	}
	
	@Override
	public String toString() {
		String s = title + ", directions: " + directions + ", calories: " + calories; 
		return s;
	}
	
//	@Override
//	public String toString() {
//		return (title + " RRR: " + RRR);
//	}


}
