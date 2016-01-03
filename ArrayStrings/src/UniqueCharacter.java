
public class UniqueCharacter {
	
	public Boolean uniqueCharacter(String toBeTested){
		Boolean[] checkForUniqueString = new Boolean[256];
		
		for (int j = 0;j<checkForUniqueString.length ; j++){
			checkForUniqueString[j] = false;
		}
		
		for(int i= 0; i < toBeTested.length();i++){
			int temp = Character.getNumericValue(toBeTested.charAt(i));
			
			if(checkForUniqueString[temp] == false){
		     	checkForUniqueString[temp] = true;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
