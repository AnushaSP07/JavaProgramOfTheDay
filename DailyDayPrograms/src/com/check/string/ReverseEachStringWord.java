package com.check.string;

public class ReverseEachStringWord {
	
	public static void reverseEachWord(String input) {
		String[] words = input.split(" ");
		String rWords = "";
			for(int i=0;i<words.length;i++) {
				String word = words[i];
				String rWord = "";
					for(int j=word.length()-1;j>=0;j--) {
						rWord = rWord + word.charAt(j);
					}
					rWords = rWords + rWord +" ";
			}
			System.out.println(""+rWords);
	}

	public static void main(String[] args) {
		reverseEachWord("user has data");

	}

}
