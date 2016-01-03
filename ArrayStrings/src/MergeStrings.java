import java.util.ArrayList;

public class MergeStrings {

	 public ArrayList<String> merge(String[] words, String[] more) {
	     ArrayList<String> sentence = new ArrayList<String>();
		 for (String w : words) sentence.add(w);
		 for (String w : more) sentence.add(w);
		 return sentence;
   }
}
