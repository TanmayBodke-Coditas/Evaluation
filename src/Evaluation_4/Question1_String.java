package Evaluation_4;

import java.util.Scanner;
import java.util.StringTokenizer;

class StringQue1_1{

    public void count() {

        String input = "Hii, This is Tanmay!!";
        int count = 0;

        StringTokenizer str = new StringTokenizer(input , ", !", true);
        while (str.hasMoreTokens()) {
            str.nextElement();
            count++;
        }

        System.out.println("Number of tokens are  :: " + count);
    }
}
public class Question1_String {
    public static void main(String[] args) {
        StringQue1_1 stringQue11 = new StringQue1_1();
        stringQue11.count();
    }
}
