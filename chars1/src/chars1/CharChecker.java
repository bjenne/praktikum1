package chars1;

public class CharChecker {

	
//void iterate (String s){
		//for (int i = 0; i < s.length(); i++ ){
			
			//char current = s.charAt(i);
			//System.out.println(current + "\t" + isLowerCase(current) + "\t" + decValue (current));
	//}
//}

		boolean isLowerCase(char current){
		if (current >= 'a' && current <= 'z'){
		return true;
	}	else {
		return false;
	}
	}
		
		int decValue (char current){
			int i = current;
			return i;
		}
		
		char [] toArray(String s){
	 char [] charArray = new char[s.length()];
	
	 for (int i = 0; i<s.length();){
	
		 charArray[i] = s.charAt(i);
	 }
	 	return charArray;
		}
}
		//char[] toArray(String s)
		//add every char of a String into a char array
		//use a for loop

//void printArray(char [] toPrint) 
//length of Array
	//iterate over every element of the array while printing its position in the array and its value
	//use a while loop


