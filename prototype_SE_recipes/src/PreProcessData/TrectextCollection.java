package PreProcessData;

import Classes.Path;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import org.json.Test;


public class TrectextCollection implements DocumentCollection {
	//you can add essential private methods or variables
	private BufferedReader is = null;
	private Map <String, String> res;
	Test testObj;
	// YOU SHOULD IMPLEMENT THIS METHOD
	public TrectextCollection() throws IOException {
		try {
			is = new BufferedReader(new FileReader(Path.DataText));
		}

		finally {
			if (is == null) {
				throw new IOException();
			}
		}
	}


	public Map<String, String> nextDocument() throws IOException {

		res = new HashMap <>();
		StringBuilder sb = new StringBuilder();
		StringBuilder key = new StringBuilder();
		String line = is.readLine();


		while ( line != null) {

			if (line.contains("title")){
				line = is.readLine();
				//res.put ("title", line.toCharArray());
				while (!line.contains("directions:")){
					key.append(line);
					line = is.readLine();
				}

			}
			if (line.contains("directions:")){
				line = is.readLine();
				while (!line.equals("[end]")){
					// add space to each line to avoid some joint words problem;
					sb.append(line + ' ');
					line = is.readLine();

				}
				String content = new String(sb);
				System.out.println (key);
				res.put (new String(key), content);
			}

			// find the ending and while the line reads to the end, put the info into the map;

			line = is.readLine();
			return res;
		}

		// close the file while reach the end;
		is.close();
		return null;

	}


		public static void main (String[] args) {

			try {
				TrectextCollection test = new TrectextCollection();
				//text.nextDocument();
				Map <String, String> message;
				message = test.nextDocument();
				message = test.nextDocument();
			//	System.out.print (message);

			}
			catch (Exception e) {

			}
		}

	}
	

