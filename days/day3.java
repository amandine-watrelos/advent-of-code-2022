package days;

import java.io.BufferedReader;
import java.io.FileReader;

public class day3 {

    static final String FILE_PATH = ".\\inputs\\day3.txt";
    static final int LOWER_CASE_ASCII_DIFF = 96;
    static final int UPPER_CASE_ASCII_DIFF = 38;

    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));

        String currentLine;
        int prioritiesSum = 0;

        while ((currentLine = reader.readLine()) != null) {
            String firstCompartment = currentLine.substring(0, currentLine.length()/2);
            String secondCompartment = currentLine.substring(currentLine.length()/2);

            for (int i = 0; i < firstCompartment.length(); i++) {
                char commonItemType = firstCompartment.charAt(i);
                if (secondCompartment.contains(String.valueOf(commonItemType))) {
                    if (Character.isLowerCase(commonItemType)) {
                        prioritiesSum += (int) commonItemType - LOWER_CASE_ASCII_DIFF;
                    } else {
                        prioritiesSum += (int) commonItemType - UPPER_CASE_ASCII_DIFF;
                    }
                    break;
                }

            }
        }
        System.out.println(prioritiesSum);
        reader.close();
    }

}
