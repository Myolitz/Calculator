package Projects.Calculator;

import java.util.Scanner;
// import java.util.Arrays; //Try to see if useful

public class Calculator {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        //Program Initialization
        System.out.println("Enter a formula (no spaces) or type done to exit");

        //Variables 
        int outBuffer;
        int tempVal = 0;
        String userIn = input.nextLine();
        String[] numsIn = userIn.split("\\D");
        String[] opsIn = userIn.split("\\d");

        //TODO: RECOGNIZE ARITHMETIC OPERATORS + OUTBUFFER FOR
        //TODO: KEEPING RESULT

        while (!(userIn.equals("done"))) {
            int val1 = 0;
            for (int i = 1; i < opsIn.length; i++) {

            val1 = Integer.parseInt(userIn.substring(userIn.indexOf(opsIn[1]), userIn.indexOf(opsIn[2])));
            System.out.println("val1 = " + val1);

                if (opsIn[i] == "*" || opsIn[i] == "/" || opsIn[i] == "%") {

                    //TODO: Don't assume */% will be second
                    //FIXME: ACTUALLY MAKE IT WORK

                    switch (opsIn[i]) {
                        case "*":
                            tempVal = val1 * Integer.parseInt(userIn.substring(userIn.indexOf(opsIn[i])));
                            break;
                        case "/":
                            tempVal = val1 / Integer.parseInt(userIn.substring(userIn.indexOf(opsIn[i])));
                            break;
                        case "%":
                            tempVal = val1 % Integer.parseInt(userIn.substring(userIn.indexOf(opsIn[i])));
                            break;
                        default:
                            break;
                    }
                    
                }

            }

            System.out.println("index of opsIn[2] and its value: " + userIn.indexOf(opsIn[2]) + " " + opsIn[2]);

            System.out.println("tempVal value: "  + tempVal);

            System.out.println("Number from opsIn[1] to opsIn[2]: " + Integer.parseInt(userIn.substring(userIn.indexOf(opsIn[1]), userIn.indexOf(opsIn[2]))));

            // System.out.println(Integer.parseInt(userIn.substring(userIn.indexOf(opsIn[2]), userIn.length() - 1)));

            System.out.println("Next Formula (start with an operator if you want to keep editing the result) or enter done to quit");
            userIn = input.nextLine();

        }

        for (int i = 0; i < numsIn.length; i++) {
            System.out.println(numsIn[i]);
        }

        for (int i = 0; i < opsIn.length; i++) {
            System.out.println(opsIn[i]);
        }
        

        input.close();
    }
}
