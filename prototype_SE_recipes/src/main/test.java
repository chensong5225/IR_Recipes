package main;

import java.util.ArrayList;

public class test {
    public static void main (String[] args) throws Exception  {
        String query = "chicken";
        QueryMain q = new QueryMain();
        ArrayList<String> results =(ArrayList<String>) q.show(query);
        for (String i : results) {
            System.out.println (i);
        }

    }
}
