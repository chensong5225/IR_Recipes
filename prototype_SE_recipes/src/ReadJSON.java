
import Classes.Path;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;


public class ReadJSON {

    public static void main(String args[]) {

        JsonParser parser = new JsonParser();


        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(Path.DataText)));

            Object obj = parser.parse(new FileReader(Path.DataRECIPEDir));
            JsonArray jsonArray = (JsonArray) obj;

            int no = 0;
            for (JsonElement element : jsonArray) {
                no = no + 1;
                JsonObject recipe = element.getAsJsonObject();
                //System.out.println();
                //System.out.println("recipe " + no);

                if (recipe.get("title") != null && !recipe.get("title").isJsonNull()) {
                    String title = recipe.get("title").getAsString();
                    writer.write("title: " + "\n" + title + "\n");
                    //System.out.println(title);
                }

                if (recipe.get("directions") != null && !recipe.get("directions").isJsonNull()) {
                    JsonArray directionsJson = (JsonArray) recipe.get("directions");
                    writer.write("directions: " + "\n");
                    for (int a = 0; a < directionsJson.size(); a++) {
                        String direction = directionsJson.get(a).getAsString();
                        writer.write(direction + "\n");
                        //System.out.println(direction);
                    }
                }

                if (recipe.get("fat") != null && !recipe.get("fat").isJsonNull()) {
                    float directions = recipe.get("fat").getAsFloat();
                    //System.out.println(directions);
                }

                if (recipe.get("date") != null && !recipe.get("date").isJsonNull()) {
                    String date = recipe.get("date").getAsString();
                    //System.out.println(date);
                }

                JsonArray categoriesJson = (JsonArray) recipe.get("categories");
                if (categoriesJson != null && !recipe.isJsonNull()) {
                    //JsonArray categoriesJson = (JsonArray) recipe.get("categories");
                    for (int b = 0; b < categoriesJson.size(); b++) {
                        String ingredient = categoriesJson.get(b).getAsString();
                        //System.out.println(ingredient);
                    }
                }

                if (recipe.get("calories") != null && !recipe.get("calories").isJsonNull()) {
                    float categories = recipe.get("calories").getAsFloat();
                    //System.out.println(categories);
                }

                if (recipe.get("desc") != null && !recipe.get("desc").isJsonNull()) {
                    String desc = recipe.get("desc").getAsString();
                    //System.out.println(desc);
                }

                if (recipe.get("protein") != null && !recipe.get("protein").isJsonNull()) {
                    float protein = recipe.get("protein").getAsFloat();
                    //System.out.println(protein);
                }

                if (recipe.get("rating") != null && !recipe.get("rating").isJsonNull()) {
                    float rating = recipe.get("rating").getAsFloat();
                    //System.out.println(rating);
                }


                if (recipe.get("ingredients") != null && !recipe.get("ingredients").isJsonNull()) {
                    JsonArray ingredientsJson = (JsonArray) recipe.get("ingredients");
                    writer.write("ingredients: ");
                    for (int c = 0; c < ingredientsJson.size(); c++) {
                        String ingredient = ingredientsJson.get(c).getAsString();
                        writer.write(ingredient + ", ");
                        //System.out.println(ingredient);
                    }
                    writer.write("\n");
                }

                if (recipe.get("sodium") != null && !recipe.get("sodium").isJsonNull()) {
                    float sodium = recipe.get("sodium").getAsFloat();
                    //System.out.println(sodium);
                }
                if (recipe.get("title") == null  &&
                        recipe.get("directions") == null &&
                        recipe.get("ingredients") == null ) {
                    continue;
                }

                writer.write("[end]" + "\n");
                writer.write("\n");


            }
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}