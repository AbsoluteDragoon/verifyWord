package verifiyWord;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class verifiyWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String possWord = "";
		System.out.println("ENTER ANY NUMBER OF WORDS AND ENTER 0 TO STOP"); 
		possWord = s.next();
		while(possWord.compareTo("0") != 0) {
			boolean result = testWord(possWord.toLowerCase());
			System.out.println(possWord + "\t::\t" + result);
			possWord = s.next();
		}
//		while(possWord != "0") {
//			possWord = s.nextLine();
//		}
		
		s.close();
		
	}
	
	public static boolean testWord(String word) {
		if(exception(word)) {
			return true;
		}
		if(rule1(word) && rule2(word) && rule3(word)) {
			return true;
		}
		return false;
	}
	
	public static boolean exception(String word){
		List<String> except = Arrays.asList("qatar","hi", "i");
		return except.contains(word);
	}
	
	public static boolean rule1(String word) {
		//This will test to see if at least one vowel exist
		if(word.indexOf('a') != -1)
			return true;
		if(word.indexOf('u') != -1)
			return true;
		if(word.indexOf('o') != -1)
			return true;
		if(word.indexOf('i') != -1)
			return true;
		if(word.indexOf('e') != -1)
			return true;
		return false;
	}
	
	public static boolean rule2(String word) {
		//This will test to see if a q is followed by an u 
		if(word.indexOf('q') != -1) {
			int i = word.indexOf('q');
			if(word.charAt(i+1) == 'u') {
				return true;
			}
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean rule3(String word) {
		//This will test to see if i,u,v,j is at the end of the word
		if(word.charAt(word.length()-1) == 'i') {
			return false;
		}
		if(word.charAt(word.length()-1) == 'u') {
			return false;
		}
		if(word.charAt(word.length()-1) == 'v') {
			return false;
		}
		if(word.charAt(word.length()-1) == 'j') {
			return false;
		}
		
		return true;
	}
}
