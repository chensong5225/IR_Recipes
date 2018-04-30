package SearchLucene;

import java.util.ArrayList;
import java.util.Scanner;

import Classes.Query;

public class ExtractQuery {

	ArrayList<Query> queries;
	String q; 

	int idx = 0;

	public ExtractQuery(String keywords) {
		// you should extract the 4 queries from the Path.TopicDir
		// NT: the query content of each topic should be 1) tokenized, 2) to
		// lowercase, 3) remove stop words, 4) stemming
		// NT: you can simply pick up title only for query, or you can also use
		// title + description + narrative for the query content.
		System.out.println("Please enter the key words:");

		q = keywords;

		queries = new ArrayList<>();
		Query aQuery = new Query();
		aQuery.SetTopicId("901");
		aQuery.SetQueryContent(q);
		queries.add(aQuery);
//		aQuery = new Query();
//		aQuery.SetTopicId("902");
//		aQuery.SetQueryContent("milk butter");
//		queries.add(aQuery);
//		aQuery = new Query();
//		aQuery.SetTopicId("903");
//		aQuery.SetQueryContent("slowcooker");
//		queries.add(aQuery);
//		aQuery = new Query();
//		aQuery.SetTopicId("904");
//		aQuery.SetQueryContent("slow cooker");
//		queries.add(aQuery);
	}

	public boolean hasNext() {
		if (idx == queries.size()) {
			return false;
		} else {
			return true;
		}
	}

	public Query next() {
		return queries.get(idx++);
	}

}
