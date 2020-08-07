package com.bansari.algorithm;
import java.util.HashMap;
import java.util.Map;

public class EnglishDictionary {

	private static Map<String, String> dictionary;

	public EnglishDictionary() {
		EnglishDictionary.dictionary = new HashMap<>();
	}

	public static void main(String[] args) {

		EnglishDictionary englishDictionary = new EnglishDictionary();

		System.out.println(englishDictionary.save("fast", "quick"));
		System.out.println(englishDictionary.save("good", "superb"));
		System.out.println(englishDictionary.update("good", "awesome"));
		System.out.println(englishDictionary.remove("fast"));
		System.out.println(englishDictionary.find("good"));
	}

	public String find(String word) {

		if (!dictionary.isEmpty())
			return dictionary.get(word);
		else
			return "Dictionary is empty";
	}

	public String save(String word, String meaning) {

		if (dictionary.containsKey(word)) {
			return word + " already exists in the dictionary";
		} else {
			dictionary.put(word, meaning);
			return word + " is saved";
		}
	}

	public String remove(String word) {

		if (!dictionary.isEmpty()) {
			dictionary.remove(word);
			return word + " is removed from the dictionary";
		} else
			return "Dictionary is empty";
	}

	public String update(String word, String meaning) {

		if (!dictionary.containsKey(word)) {
			return word + "does not exist in the dictionary";
		} else {
			dictionary.replace(word, meaning);
			return word + "is updated";
		}
	}
}