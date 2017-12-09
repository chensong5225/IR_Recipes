import java.util.List;

import Classes.*;
import IndexingLucene.*;
import SearchLucene.ExtractQuery;
import SearchLucene.QueryRetrievalModel;

public class SearchIndex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Open index
		MyIndexReader ixreader = new MyIndexReader();
		// Initialize the MyRetrievalModel
		QueryRetrievalModel model = new QueryRetrievalModel(ixreader);
		// Extract the queries
		ExtractQuery queries = new ExtractQuery();
		
		long startTime = System.currentTimeMillis();
		while (queries.hasNext()) {
			Query aQuery = queries.next();
			System.out.println(aQuery.GetTopicId() + "\t" + aQuery.GetQueryContent());
			// conduct retrieval on the index for each topic, and return top 25 documents
			List<Document> results = model.retrieveQuery(aQuery, 10);
			if (results != null) {
				int rank = 1;
				for (Document result : results) {
					System.out.println(aQuery.GetTopicId() + " Q0 " + result.docno() + " " + rank + " " + result.score() + " MYRUN");
					rank++;
				}
			}
		}
		long endTime = System.currentTimeMillis(); // end time of running code
		System.out.println("\n\nqueries search time: " + (endTime - startTime) / 60000.0 + " min");
		ixreader.close();

	}

}
