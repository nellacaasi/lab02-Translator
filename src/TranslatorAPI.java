import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.User;

public class TranslatorAPI {

	 public void load() throws Exception{
		 DataLoader loader = new DataLoader();
		  List <Term> terms = loader.loadTerms("SpanishWords.txt");
		  
	 }
}
