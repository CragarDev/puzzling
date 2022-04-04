import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puzzle {
    // just a starter for testing startup
    public void Starter() {
        System.out.println("====== Starting Puzzle ======");
        System.out.println("");
        System.out.println("--- Puzzle ---");
        System.out.println("");

        System.out.println("");
        System.out.println("====== End Puzzle ======");
    }

    // Random number generator ---
    public Integer RandomNumber() {

        // Random integer Generator
        Random randGenerator = new Random();
        // Random number plus one
        int randNumb = randGenerator.nextInt() + 1;
        // System.out.println(randNumb);
        return randNumb;

    }

    // Random number generator with from 0 to <bound> ----
    public Integer RandomNumber(int bound) {

        // Random integer
        Random randGenerator = new Random();
        int randNumb = randGenerator.nextInt(bound) + 1;
        // System.out.println(randNumb);
        return randNumb;
    }

    // Generates a list of 10 numbers from 1 - 20 ---
    public ArrayList<Integer> getTenRolls() {
        // Generate a list of 10 random numbers between 1 and 20 inclusive

        // new ArrayList
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        // System.out.println("");

        // get random number and add to ArrayList
        for (int i = 1; i <= 10; i++) {
            int rndNum = this.RandomNumber(20) + 1;
            myArray.add(rndNum);
        }
        // System.out.println("");

        // @ testing - print array values
        // for (int num : myArray) {
        // System.out.println(num);
        // }
        // System.out.println("");
        return myArray;
    }

    // returns a random lowerCase letter from the alphabet
    public String getRandomLetter() {
        // return a random letter from an array of 26 letters
        // Create the array to pull from ---
        String[] myArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", };

        // get a random number from 0-25 (subtract 1 form the random number as it is
        // adding 1 to start at 1)
        int randNumb = this.RandomNumber(25);

        // use random number to select from array and return that number
        return myArray[randNumb];
    }

    // returns a random letter from the alphabet either L lowercase or U uppercase
    public String getRandomLetter(String LorU) {
        // return a random letter from an array of 26 letters
        // Create the array to pull from ---
        String[] myArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", };

        // get a random number from 0-25 (subtract 1 form the random number as it is
        // adding 1 to start at 1)
        int randNumb = this.RandomNumber(25);

        // random letter selected
        String randLetter = myArray[randNumb];

        // process a check to make it either L lowercase or U uppercase
        if (LorU.equals("U") == true) {
            return randLetter.toUpperCase();
        } else {
            return randLetter.toLowerCase();
        }
    }

    // generate a random set of 8 letters randomly between Upper and Lower case
    public String generatePassword() {
        // start with a String variable to put the letters into
        String newPassword = "";

        // run a loop for 8 times to get the random letter
        for (int i = 0; i < 8; i++) {
            // get a random number be between 1 and 2 to select upper for 1 and lower for 2
            int upOrLowNumber = this.RandomNumber(2);

            if (upOrLowNumber == 1) {
                // if number is 1 then get Uppercase
                String randLetter = this.getRandomLetter("U");
                newPassword += randLetter;
            } else {
                // else get lower case
                String randLetter = this.getRandomLetter();
                newPassword += randLetter;
            }
        }
        return newPassword;
    }

    // generates an array with 8 random letter words to the length of the arg
    public ArrayList<String> getNewPasswordSet(int length) {
        // return an array of n length with 8 random letter words
        // start by setting up the Array to the length parameter
        ArrayList<String> myArray = new ArrayList<String>();

        // Loop through as many times as the length
        for (int i = 0; i < length; i++) {
            // set up string variable to hold new word
            String newWord = "";

            // get the first letter as Uppercase
            String randUpperLetter = this.getRandomLetter("U");
            newWord += randUpperLetter;

            // get the next 7 letter lowercase
            for (int j = 0; j < 7; j++) {
                String randLowerLetter = this.getRandomLetter();
                newWord += randLowerLetter;
            }
            myArray.add(newWord);
        }
        return myArray;

    }

    //
    // public ArrayList shuffleArray(Array arr) {

    // }
    //
    // end----
}