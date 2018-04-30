package main;

import Classes.Recipe;

import java.util.ArrayList;

public class testDaily {
    public static void main (String[] args) throws Exception  {
        String query = "chicken";
        DetailMain q = new DetailMain();
        ArrayList<Recipe> results =(ArrayList<Recipe>) q.shows(query);
        for (Recipe i : results) {
            System.out.println (i);
        }

    }
}
