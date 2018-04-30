package main;

import Classes.Document;
import Classes.Path;
import IndexingLucene.MyIndexReader;
import RerankHealth.ReadCSV;
import RerankHealth.Recipe;
import SearchLucene.ExtractQuery;
import SearchLucene.QueryRetrievalModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class QueryMain {
    public List<String> show(String query) throws Exception {
        final double medianRRR = 0.27746013395493785;
        MyIndexReader ixreader = new MyIndexReader();
        QueryRetrievalModel model = new QueryRetrievalModel(ixreader);
        ReadCSV readcsv = new ReadCSV(Path.Recipecsv);
        ArrayList<Recipe> rrr = readcsv.read();
        List<String> list = new ArrayList<>();
        String input = query;
        ExtractQuery queries = new ExtractQuery(input);
        HashMap<Integer, String> map = new HashMap<>();
        while (queries.hasNext()) {
            Classes.Query aQuery = queries.next();
            System.out.println(aQuery.GetTopicId() + "\t" + aQuery.GetQueryContent());
            List<Document> results = model.retrieveQuery(aQuery, 20);

            if (results != null && results.size() != 0) {
                int rank = 1;
                for (Classes.Document d : results) {
                    String title = d.docno();
                    Recipe temp = new Recipe(title);
                    if (rrr.contains(temp)) {
                        int idx = rrr.indexOf(temp);
                        Recipe r = rrr.get(idx);
                        //System.out.println(aQuery.GetTopicId() + " Q0 " + d.docno() + " " + rank + " " + d.score() + " MYRUN" + t);
                        d.setScore(r.getRRR());
                        //System.out.println(aQuery.GetTopicId() + " Q0 " + d.docno() + " " + rank + " " + d.score() + " MYRUN");
                    } else {
                        d.setScore(medianRRR);
                    }
                    rank++;
                }
                //resort the list
                System.out.println();
                Collections.sort(results);
                for (int i = 0; i <= 10; i++) {
                    Classes.Document d = results.get(i);
                    //System.out.println(aQuery.GetTopicId() + " Q0 " + d.docno() + " " + d.score() + " MYRUN");
                    list.add(aQuery.GetTopicId() + " Q0 " + d.docno() + " " + rank + " " + d.score() + " MYRUN");
                }
            }
        }



            ixreader.close();
            if (list != null) {
                return list;
            }
            return null;

    }
}
