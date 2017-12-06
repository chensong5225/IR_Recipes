package PreProcessData;

import java.io.IOException;
import java.util.Map;


public interface DocumentCollection {


	public abstract Map<String,String> nextDocument() throws IOException;

}
