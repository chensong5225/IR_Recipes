package RerankHealth;

import Classes.Document;

public class RecipeRRR implements Comparable<RecipeRRR>{
	
	String title;
	double rating;
	double calories;
	double protein;
	double fat;
	double sodium;
	double RRR;
	
	public RecipeRRR(String t, double r, double c, double p, double f, double s, 
			double RRR){
		title = t;
		rating = r;
		calories = c;
		protein = p;
		fat = f;
		sodium = s;
		this.RRR = RRR;
	}
	
	public RecipeRRR(String t){
		title = t;
		rating = 1;
		calories = 1;
		protein = 1;
		fat = 1;
		sodium = 1;
		this.RRR = 1;
	}
	
    public int compareTo(RecipeRRR r) {
    	if(RRR > r.RRR) return -1;
    	else if(RRR == r.RRR) return 0;
    	else return 1;
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
	    RecipeRRR other = (RecipeRRR) obj;
	    if (!title.equals(other.title))
	        return false;
	    return true;
	}
	
//	@Override
//	public String toString() {
//		return (title + " rating: " + rating + " calories: " + calories + " protein: " + protein
//				+ " fat: " + fat + " sodium: " + sodium + " RRR: " + RRR);
//	}
	
	@Override
	public String toString() {
		return (title + " RRR: " + RRR);
	}
	
	public String getTitle() {
		return title;
	}
	public double getRating() {
		return rating;
	}
	public double getCalories() {
		return calories;
	}
	public double getProtein() {
		return protein;
	}
	public double getFat() {
		return fat;
	}
	public double getSodium() {
		return sodium;
	}
	public double getRRR() {
		return RRR;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	public void setSodium(double sodium) {
		this.sodium = sodium;
	}
	public void setRRR(double fast) {
		this.RRR = fast;
	}

}
