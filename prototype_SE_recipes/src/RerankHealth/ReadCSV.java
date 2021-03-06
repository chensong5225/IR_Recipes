package RerankHealth;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;



public class ReadCSV {

	String filename;
	ArrayList<Recipe> rrr;
	
	public ReadCSV(String filename) {
		this.filename = filename;
		rrr = new ArrayList<Recipe>();	
	}
	
	public ArrayList<Recipe> read(){
		
		CSVReader csvReader = null;
		try{
            csvReader = new CSVReader(new FileReader(filename));
            String[] temp = null;
            csvReader.readNext();//skip the first line
            while((temp = csvReader.readNext())!=null){
            	try{
                	String title = temp[1];
                	double rating = Double.parseDouble(temp[2]);
                	double calories = Double.parseDouble(temp[3]);
                	double protein = Double.parseDouble(temp[4]);
                	double fat = Double.parseDouble(temp[5]);
                	double sodium = Double.parseDouble(temp[6]);
                	double RRR = Double.parseDouble(temp[7]);
                	
                	rrr.add(new Recipe(title, rating, calories, protein, fat, sodium, RRR));         	
            	
            	}catch(Exception e){
            		//System.out.println(temp[0] + " Empty String");
            	}
            }
		}catch(Exception ee){
			ee.printStackTrace();
		}finally{
			try{
				csvReader.close();
			}catch(Exception ee){
				ee.printStackTrace();
			}
		}
		
		return rrr;
	}
}
