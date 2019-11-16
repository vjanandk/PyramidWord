package com.fr.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class PyramidWordService {

	public boolean checkForPyramidWord(String inputString) {

		char[] charArray = inputString.toCharArray();

		return checkForDuplicate(createCountMap(charArray));
	}

	private HashMap<Character, Integer> createCountMap(char[] charArray) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char ch : charArray) {
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		return charCountMap;
	}

	private boolean checkForDuplicate(HashMap<Character, Integer> charCountMap) {

		Integer[] intArray = charCountMap.values().toArray(new Integer[0]);
		int prev = 0;
		for (int curr : intArray) {
			if (curr == prev) {
				return false;
			}
			prev = curr;
		}
		return true;
	}
}
