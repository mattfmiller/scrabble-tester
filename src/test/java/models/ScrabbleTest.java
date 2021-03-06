package models;
import org.junit.*;
import static org.junit.Assert.*;


public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForA_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleLetter_8() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 8;
        assertEquals(expected, testScrabble.calculateScore("j"));
    }

    @Test
    public void calculateScore_returnsScoreForMultipleLetter_5() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 5 ;
        assertEquals(expected, testScrabble.calculateScore("dog"));
    }
}