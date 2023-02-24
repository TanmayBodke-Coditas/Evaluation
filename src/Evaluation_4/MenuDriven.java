package Evaluation_4;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Please give question number :: ");
            String Menu = input.next();
            switch (Menu){
                case "Question1":
                    StringQue1_1 stringQue11 = new StringQue1_1();
                    stringQue11.count();
                    break;
                case "Question2" :
                    VowelsAndConsonents vowelsAndConsonents = new VowelsAndConsonents();
                    vowelsAndConsonents.countAndPrintVowels();
                    break;
                case "Question3" :
                    ReplaceLetter replaceLetter = new ReplaceLetter();
                    replaceLetter.replaceVowel();
            }
        }


    }
}
