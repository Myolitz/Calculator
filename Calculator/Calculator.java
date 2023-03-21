package Projects.Calculator;

import java.util.Scanner;
import java.util.Arrays;

public class Calculator {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        //Variables 
        int outBuffer;
        String userIn = input.nextLine();
        String[] numIns = userIn.split("\\D");

        //TODO: RECOGNIZE ARITHMETIC OPERATORS + OUTBUFFER FOR
        //TODO: KEEPING RESULT
        
        for (int j = 0; j < numIns.length; j++) {
            System.out.print(numIns[j]);
        }

        System.out.println();

        System.out.println(numIns.length);



        input.close();
    }
}
