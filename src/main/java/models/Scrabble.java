package models;

import java.util.Map;
import java.util.HashMap;

public class Scrabble {
    Map<Character, Integer> characterValues = new HashMap<Character, Integer>();

    public Scrabble() {
        characterValues.put('a', 1);
        characterValues.put('b', 3);
        characterValues.put('c', 3);
        characterValues.put('d', 2);
        characterValues.put('e', 1);
        characterValues.put('f', 4);
        characterValues.put('g', 2);
        characterValues.put('h', 4);
        characterValues.put('i', 1);
        characterValues.put('j', 8);
        characterValues.put('k', 5);
        characterValues.put('l', 1);
        characterValues.put('m', 3);
        characterValues.put('n', 1);
        characterValues.put('o', 1);
        characterValues.put('p', 3);
        characterValues.put('q', 1);
        characterValues.put('r', 1);
        characterValues.put('s', 1);
        characterValues.put('t', 1);
        characterValues.put('u', 1);
        characterValues.put('v', 4);
        characterValues.put('w', 4);
        characterValues.put('x', 8);
        characterValues.put('y', 4);
        characterValues.put('z', 10);
    }

    public Integer calculateScore(String wordToTest) {
        char[] wordToCharArray = wordToTest.toCharArray();
        Integer total = 0;
        for (char individualChar : wordToCharArray) {
            Character charToCharacter = individualChar;
            total += characterValues.get(charToCharacter);
        }
        return total;
    }
}
