/**
 * Created by Joel on 12/6/17.
 */

import java.io.FileWriter;
import java.util.Map;

import Classes.Path;
import PreProcessData.*;


public class CleanData {

    public static void main(String[] args) throws Exception {
        // main entrance
        long startTime = System.currentTimeMillis(); //star time of running code
        CleanData hm1 = new CleanData();
        hm1.PreProcess();
        long endTime = System.currentTimeMillis(); //end time of running code
        System.out.println("text corpus running time: " + (endTime - startTime) / 60000.0 + " min");

    }

    public void PreProcess() throws Exception {
        // Loading the collection file and initiate the DocumentCollection class
        DocumentCollection corpus;
        corpus = new TrectextCollection();


        // loading stopword list and initiate the StopWordRemover and WordNormalizer class
        StopWordRemover stopwordRemover = new StopWordRemover();
        WordNormalizer normalizer = new WordNormalizer();

        // initiate the BufferedWriter to output result
        FileWriter wr = new FileWriter(Path.CleanData);

        // initiate a doc object, which can hold document number and document content of a document
        Map<String, String> doc = null;

        // process the corpus, document by document, iteractively
        int count = 0;
        while ((doc = corpus.nextDocument()) != null) {
            // load document number of the document
            String docno = doc.keySet().iterator().next();
            //	System.out.print (docno);
            //String content = (String)doc.get(docno);
            // load document content
            String content = doc.get(docno);
            //char[] key = docno.toCharArray();
            //WordTokenizer tokenizerkey = new WordTokenizer(key);
            // write docno into the result file

            wr.append(docno + "\n");

            // initiate the WordTokenizer class
            WordTokenizer tokenizer = new WordTokenizer(content);

            // initiate a word object, which can hold a word
            String word = null;

            // process the document word by word iteratively
            while ((word = tokenizer.nextWord()) != null) {
                // each word is transformed into lowercase
                word = normalizer.lowercase(word);

                // filter out stopword, and only non-stopword will be written
                // into result file
                if (!stopwordRemover.isStopword(word))
                    wr.append(normalizer.stem(word) + " ");
                //stemmed format of each word is written into result file
            }
            wr.append("\n");// finish processing one document
            count++;
            if (count == 1000) {
                System.out.println (1);
            }
            if(count%10000==0)
                System.out.println("finish "+count+" docs");
        }
        System.out.println("totaly document count:  " + count);
        wr.close();
    }
}

