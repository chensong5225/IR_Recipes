package Classes;

public class Document implements Comparable<Document>{
	
	protected String docid;
	protected String docno;
	protected double score;
	
	public Document( String string, String docno, double score ) {
		this.docid = string;
		this.docno = docno;
		this.score = score;
	}
	
    public int compareTo(Document d) {
    	if(score() > d.score()) return -1;
    	else if(score() == d.score()) return 0;
    	else return 1;
    }
	
	public String docid() {
		return docid;
	}
	
	public String docno() {
		return docno;
	}
	
	public double score() {
		return score;
	}
	
	public void setDocid( String docid ) {
		this.docid = docid;
	}
	
	public void setDocno( String docno ) {
		this.docno = docno;
	}
	
	public void setScore( double score ) {
		this.score = score;
	}
	
}
