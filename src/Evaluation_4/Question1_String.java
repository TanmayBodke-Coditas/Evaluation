package Evaluation_4;

import java.util.Scanner;
import java.util.StringTokenizer;

class StringQue1_1{

    public void count() {

        String input = "Hii, This is Tanmay!!";
        int count = 0;

        StringTokenizer str = new StringTokenizer(input , ", !");
        while (str.hasMoreTokens()) {
            str.nextElement();
            count++;
        }

        System.out.println("Number of tokens are  :: " + count);
    }
}

