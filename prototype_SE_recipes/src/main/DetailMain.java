package main;

import Classes.Document;
import Classes.Path;
import Classes.Query;
import IndexingLucene.MyIndexReader;
import RerankHealth.ReadCSV;
import RerankHealth.Recipe;
import SearchLucene.ExtractQuery;
import SearchLucene.QueryRetrievalModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DetailMain {
    public static ArrayList<Classes.Recipe> database = DatabaseHandler.JSONHandler.readJson(Path.DataRECIPEDir);

    public ArrayList<Classes.Recipe> shows(String query) throws Exception {
        //call rerank
        long startTime = System.currentTimeMillis();
        //ArrayList<Recipe> database = DatabaseHandler.JSONHandler.readJson();
        ArrayList<String> titles = RerankHealth.Rerank.findTitles(query,20);


        //System.out.println(titles.size());

        //matched results
        ArrayList<Classes.Recipe> result = DatabaseHandler.JSONHandler.findJson(titles, database);
        //System.out.println(result.size());
     /*   DatabaseHandler.JSONHandler.writeJson(result);
//		for(int i=0; i<result.size(); i++){
//			System.out.println(i + " " + result.get(i));
//		}
        long endTime = System.currentTimeMillis(); // end time of running code
        System.out.println("\n\nSearch time: " + (endTime - startTime) / 60000.0 + " min");*/

        return result;

    }
}
