import java.util.ArrayList;


public class ArrayString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Merge Two Strings
		String stringArrayOne[] = {"Hello","my","name"};
		String stringArrayTwo[] = {"is","Ajay","!"};
        
		//create a object of merge class an use it's method merge to merge the two string array
		MergeStrings merge = new MergeStrings();
		ArrayList<String> mergedArrayString =  merge.merge(stringArrayOne, stringArrayTwo);
		System.out.println(mergedArrayString);
		
		
		//Check for Unique String
		String checkString = "abcd";
		UniqueCharacter unique = new UniqueCharacter();
		System.out.println(unique.uniqueCharacter(checkString));
		
		//Check for permutation
		String permutation1 = "asfbfc";
		String permutation2 = "asfbfcasff";

		
		
	}

	
	
	
	
	
	
}
