import java.util.ArrayList;

import Classes.Recipe;

public class FinalSearch {
	
	public static ArrayList<Recipe> database = DatabaseHandler.JSONHandler.readJson("data/full_format_recipes.json");

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//call rerank
		long startTime = System.currentTimeMillis();
		//ArrayList<Recipe> database = DatabaseHandler.JSONHandler.readJson();
		ArrayList<String> titles = RerankHealth.Rerank.findTitles(50);
		//System.out.println(titles.size());
		
		//matched results
		ArrayList<Recipe> result = DatabaseHandler.JSONHandler.findJson(titles, database);		
		//System.out.println(result.size());
		DatabaseHandler.JSONHandler.writeJson(result);
//		for(int i=0; i<result.size(); i++){
//			System.out.println(i + " " + result.get(i));
//		}
		long endTime = System.currentTimeMillis(); // end time of running code
		System.out.println("\n\nSearch time: " + (endTime - startTime) / 60000.0 + " min");

	}

}
