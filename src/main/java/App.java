import models.Scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("I'm a scrabble scorer application!");
            System.out.println("Enter a word:");
            try {
                String userWord = bufferedReader.readLine();

                Scrabble scrabble = new Scrabble();
                Integer scrabbleResult = scrabble.calculateScore(userWord);
                System.out.println(scrabbleResult);
                System.out.println("____________________");
                System.out.println("Would you like to check another word? - yes or no");
                String userContinue = bufferedReader.readLine();
                if (userContinue.equals("no")) {
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
