import java.util.Random;
import java.util.Scanner;

public class MainHangman {
	
	public static String randomWord() {
		//select a word at random
		String[] wordList = new String[] {"", "1", "2"};
		int min = 0;
		int max = 9;
		Random Random = new Random();
		int randomWord = Random.nextInt(max - min + 1) + min;
		String output = wordList[randomWord];
		return output;
	}
	
	public static int prepareHangman(String word) {
		//do some stuff to prepare for the game
		return word.length();
	}
	
	public static String askLetter(String word) {
		Scanner keybrd = new Scanner(System.in);
 		String question = "Letter?";
 		System.out.println(question);
 		String letter = keybrd.nextLine();
		return letter.toLowerCase();
	}
	
	public static boolean isCorrect(String word, String letter) {
		for(int i = 0; i < word.length(); i++) {
			if(word.substring(i, i+1) == letter) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
