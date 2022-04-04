public class PuzzleTest {
    public static void main(String[] args) {
        System.out.println("====== Starting PuzzleTest ======");
        System.out.println("");
        System.out.println("--- PuzzleTest Main ---");
        System.out.println("");

        Puzzle puzzleUtil = new Puzzle();

        // starting test....
        puzzleUtil.Starter();

        // @ testing.....
        // simple random number 25 times
        // puzzleUtil.RandomNumber();
        // @ testing.....
        // for (int i = 0; i < 25; i++) {
        // System.out.println(puzzleUtil.RandomNumber());
        // }

        // add a bound to set the end so... from 0 to <bound> (exclusive so add 1 if you
        // need to)
        // @ testing.....
        // for (int i = 0; i < 10; i++) {
        // System.out.println(puzzleUtil.RandomNumber(20));
        // }

        // Get ten rolls ----
        // puzzleUtil.getTenRolls();
        System.out.println(puzzleUtil.getTenRolls());
        System.out.println("");

        // Get Random Letter
        System.out.println(puzzleUtil.getRandomLetter());
        System.out.println("");

        // Get Random Letter uppercase
        System.out.println(puzzleUtil.getRandomLetter("U"));
        System.out.println("");

        // get generated password
        System.out.println(puzzleUtil.generatePassword());
        System.out.println("");

        // get generated password set
        System.out.println(puzzleUtil.getNewPasswordSet(6));
        System.out.println("");

        System.out.println("");
        System.out.println("====== End PuzzleTest ======");
    }
}