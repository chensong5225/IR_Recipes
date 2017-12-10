import java.util.ArrayList;

import Classes.Recipe;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Recipe> x = DatabaseHandler.JSONHandler.readJson("data/finalresult.json");
		System.out.println(x.size());

	}

}
