import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Classes.*;
import IndexingLucene.*;
import SearchLucene.ExtractQuery;
import SearchLucene.QueryRetrievalModel;
import RerankHealth.*;

public class Rerank {
	
	public static void main(String[] args) throws Exception{
		
		final double medianRRR = 0.27746013395493785;
		
		ReadCSV readcsv = new ReadCSV("data/RRR.csv");
		ArrayList<Recipe> rrr = readcsv.read();
		
		MyIndexReader ixreader = new MyIndexReader();
		QueryRetrievalModel model = new QueryRetrievalModel(ixreader);
		ExtractQuery queries = new ExtractQuery();
		
		long startTime = System.currentTimeMillis();
		while (queries.hasNext()){
			Query aQuery = queries.next();
			System.out.println(aQuery.GetTopicId() + "\t" + aQuery.GetQueryContent());
			List<Document> results = model.retrieveQuery(aQuery, 100);

			//if the list is not empty
			if (results != null && results.size()!=0){
				int rank = 1;
				for (Document d : results) {
					String title = d.docno();
					Recipe temp = new Recipe(title);
					if(rrr.contains(temp)){
						int idx = rrr.indexOf(temp);
						Recipe r = rrr.get(idx);
						//System.out.println(aQuery.GetTopicId() + " Q0 " + d.docno() + " " + rank + " " + d.score() + " MYRUN" + t);
						d.setScore(r.getRRR());
						System.out.println(aQuery.GetTopicId() + " Q0 " + d.docno() + " " + rank + " " + d.score() + " MYRUN");
					}
					else{
						d.setScore(medianRRR);
					}
					rank++;
				}
				//resort the list
				System.out.println();
				Collections.sort(results);
				for (int i=0; i<=10; i++) {
					Document d = results.get(i);
					System.out.println(aQuery.GetTopicId() + " Q0 " + d.docno() + " " + d.score() + " MYRUN");
				}
			}
			//if return empty list
			if (results.size()==0){
				System.out.println("There is no match. Try these healthy recipes:");
				//give top 10 healthy recipe
				List<Recipe> rrrCopy = (ArrayList<Recipe>) rrr.clone();
				Collections.sort(rrrCopy);
				for (int i=0; i<=10; i++) {
					System.out.println(rrrCopy.get(i));
				}
			}
		}
		long endTime = System.currentTimeMillis(); // end time of running code
		System.out.println("\n\nqueries search time: " + (endTime - startTime) / 60000.0 + " min");
		ixreader.close();
	}

}
