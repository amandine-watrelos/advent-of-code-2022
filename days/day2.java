package days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

public class day2 {

    static final String FILE_PATH = ".\\inputs\\day2.txt";

    static final int WIN_PTS = 6;
    static final int DRAW_PTS = 3;

    static final int ASCII_DIFF = 23;

    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        Map<Character, Integer> movePoints = Map.of('X', 1, 'Y', 2, 'Z', 3);
        String currentLine;
        char elfMove;
        char myMove;
        int roundResult;
        int totalScore = 0;

        while ((currentLine = reader.readLine()) != null) {
            roundResult = 0;
            elfMove = currentLine.charAt(0);
            myMove = currentLine.charAt(2);
            if (isSameMove(myMove, elfMove)) {
                roundResult = DRAW_PTS;
            } else if ((myMove == 'Z' && elfMove == 'B')
            || (myMove == 'Y' && elfMove == 'A')
            || (myMove == 'X' && elfMove == 'C')) {
                roundResult = WIN_PTS;
            }
            totalScore += roundResult + movePoints.get(myMove);
        }
        System.out.println(totalScore);
        reader.close();
    }

    public static boolean isSameMove(char move1, char move2) {
        return ((int) move1 - (int) move2) == ASCII_DIFF;
    }

}
