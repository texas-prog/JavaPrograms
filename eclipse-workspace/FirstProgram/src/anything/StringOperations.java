package anything;

public class StringOperations {
	public static void main(String args[]) {
		String sentence = "Learning Java is both fun and rewarding";
		String[] words = sentence.split("");
		System.out.println("Number of words: " + words.length);
		String replacedSentence = sentence.replace("fun", "challenging");
		System.out.println("Modified sentence: " + replacedSentence);
		String uppercaseSentence = sentence.toUpperCase();
		System.out.println("Uppercase Sentence: " + uppercaseSentence);
	}
}
