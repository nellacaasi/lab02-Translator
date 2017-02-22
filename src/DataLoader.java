

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.introcs.*;

public class DataLoader{
	public List<Term> loadTerms(String filename) throws Exception{
		File termFile = new File(filename);
		In inTerms = new In(termFile);

		String delims = "[|]";
		List<Term> terms = new ArrayList<Term>();
		while (!inTerms.isEmpty()){
			String termDetails = inTerms.readLine();
			String[] termTokens = termDetails.split(delims);
			if (termTokens.length >= 6){
				String spanish = termTokens[0];
				String english = termTokens[1];
				terms.add(new Term(spanish, english));
			}
			
			else{
				throw new Exception("Invalid member length: " + termTokens.length);
			}
		}
		return terms;
	}
}