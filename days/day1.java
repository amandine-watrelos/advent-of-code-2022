package days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class day1 {

    static final String FILE_PATH = ".\\inputs\\day1.txt";

    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        String currentLine;
        int maxCalories = 0;
        int tmpCalories = 0;
        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.isBlank()) {
                if (tmpCalories > maxCalories) {
                    maxCalories = tmpCalories;
                }
                tmpCalories = 0;
            } else {
                tmpCalories += Integer.parseInt(currentLine);
            }
        }
        System.out.print(maxCalories);
        reader.close();
    }



}
