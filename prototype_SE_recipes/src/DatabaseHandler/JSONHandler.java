package DatabaseHandler;

import java.util.ArrayList;
import java.io.*;

import Classes.Recipe;
import Classes.Path;

import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONHandler {

	public static ArrayList<Recipe> readJson(String filename){
		
		ArrayList<Recipe> results = new ArrayList<Recipe>();

        JsonParser parser = new JsonParser();
        try {

            //BufferedWriter writer = new BufferedWriter(new FileWriter(new File(Path.DataText)));

            Object obj = parser.parse(new FileReader(filename));
            JsonArray jsonArray = (JsonArray) obj;

            int no = 0;
            for (JsonElement element : jsonArray) {
       
            	
                no = no + 1;
                JsonObject recipe = element.getAsJsonObject();
                //System.out.println();
                //System.out.println("recipe " + no);
                
                if (recipe.get("title") == null  &&
                        recipe.get("directions") == null &&
                        recipe.get("ingredients") == null ) {
                    continue;
                }
                
            	String title = "";
            	ArrayList<String> directions = new ArrayList<String>();
            	double fat = 1;
            	String date = "";
            	ArrayList<String> categories = new ArrayList<String>();
            	double calories = 1;
            	String desc = "";
            	double protein = 1;
            	double rating = 1;
            	ArrayList<String> ingredients = new ArrayList<String>();
            	double sodium = 1;

                if (recipe.get("title") != null && !recipe.get("title").isJsonNull()) {
                    title = recipe.get("title").getAsString().trim();
                    //writer.write("title: " + "\n" + title + "\n");
                    //System.out.println(title);
                }

//                if (recipe.get("directions") != null && !recipe.get("directions").isJsonNull()) {
//                    JsonArray directionsJson = (JsonArray) recipe.get("directions");
//                    //writer.write("directions: " + "\n");
//                    for (int a = 0; a < directionsJson.size(); a++) {
//                        directions.add(directionsJson.get(a).getAsString());
//                        //writer.write(direction + "\n");
//                        System.out.println(directions.size());
//                    }
//                }
                JsonArray directionsJson = (JsonArray) recipe.get("directions");
                if (directionsJson != null && !recipe.isJsonNull()) {
                    //JsonArray categoriesJson = (JsonArray) recipe.get("categories");
                    for (int b = 0; b < directionsJson.size(); b++) {
                    	directions.add(directionsJson.get(b).getAsString());
                        //System.out.println(directionsJson.get(b).getAsString());
                    }
                }

                if (recipe.get("fat") != null && !recipe.get("fat").isJsonNull()) {
                    fat = recipe.get("fat").getAsFloat();
                    //System.out.println(fat);
                }

                if (recipe.get("date") != null && !recipe.get("date").isJsonNull()) {
                    date = recipe.get("date").getAsString();
                    //System.out.println(date);
                }

                JsonArray categoriesJson = (JsonArray) recipe.get("categories");
                if (categoriesJson != null && !recipe.isJsonNull()) {
                    //JsonArray categoriesJson = (JsonArray) recipe.get("categories");
                    for (int b = 0; b < categoriesJson.size(); b++) {
                    	categories.add(categoriesJson.get(b).getAsString());
                        //System.out.println(categoriesJson.get(b).getAsString());
                    }
                }

                if (recipe.get("calories") != null && !recipe.get("calories").isJsonNull()) {
                	calories = recipe.get("calories").getAsFloat();
                    //System.out.println(calories);
                }

                if (recipe.get("desc") != null && !recipe.get("desc").isJsonNull()) {
                    desc = recipe.get("desc").getAsString();
                    //System.out.println(desc);
                }

                if (recipe.get("protein") != null && !recipe.get("protein").isJsonNull()) {
                    protein = recipe.get("protein").getAsFloat();
                    //System.out.println(protein);
                }

                if (recipe.get("rating") != null && !recipe.get("rating").isJsonNull()) {
                    rating = recipe.get("rating").getAsFloat();
                    //System.out.println(rating);
                }

//                if (recipe.get("ingredients") != null && !recipe.get("ingredients").isJsonNull()) {
//                    JsonArray ingredientsJson = (JsonArray) recipe.get("ingredients");
//                    writer.write("ingredients: ");
//                    for (int c = 0; c < ingredientsJson.size(); c++) {
//                        String ingredient = ingredientsJson.get(c).getAsString();
//                        writer.write(ingredient + ", ");
//                        //System.out.println(ingredient);
//                    }
//                    writer.write("\n");
//                }
                JsonArray ingredientsJson = (JsonArray) recipe.get("ingredients");
                if (ingredientsJson != null && !recipe.isJsonNull()) {
                    //JsonArray categoriesJson = (JsonArray) recipe.get("categories");
                    for (int b = 0; b < ingredientsJson.size(); b++) {
                        ingredients.add(ingredientsJson.get(b).getAsString());
                        //System.out.println(ingredientsJson.get(b).getAsString());
                    }
                }

                if (recipe.get("sodium") != null && !recipe.get("sodium").isJsonNull()) {
                    sodium = recipe.get("sodium").getAsFloat();
                    //System.out.println(sodium);
                }


                //writer.write("[end]" + "\n");
                //writer.write("\n");
//            	String title;
//            	ArrayList<String> directions = null;
//            	double fat = 1;
//            	String date = "";
//            	ArrayList<String> categories = null;
//            	double calories = 1;
//            	String desc = "";
//            	double protein = 1;
//            	double rating = 1;
//            	ArrayList<String> ingredients = null;
//            	double sodium = 1;
                Recipe temp = new Recipe(title, directions, fat, date, categories, 
                		calories, desc, protein, rating, ingredients, sodium);
                
                results.add(temp);


            }
            //writer.flush();
            //writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //System.out.println(results.size());
		
		return results;
	}
	
	public static ArrayList<Recipe> findJson(ArrayList<String> titles,
			ArrayList<Recipe> database){
		ArrayList<Recipe> results = new ArrayList<Recipe>();
		if(titles.isEmpty() || titles==null) return null;
		for(String t:titles){
			if(t.equals("")) continue;
			Recipe temp = new Recipe(t);
			if(database.contains(temp)){
				int idx = database.indexOf(temp);
				Recipe temp2 = database.get(idx);
				results.add(temp2);
			}
		}
		return results;
	}
	
	public static void writeJson(ArrayList<Recipe> results) throws IOException{
		Gson gson = new Gson();
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(Path.FinalResult)));

		for(Recipe r:results){
			String line = gson.toJson(r);
			writer.write(line + "\n");
			//System.out.println();
		}
		
	}

}
