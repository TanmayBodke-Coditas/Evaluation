package Evaluation_5;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class NewConnection extends Connections{

    NewConnection(){
        super();

    }

    NewConnection newConnection;
    public void addConnection(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter details below ::");
        System.out.println("Enter Name ::");
        name = input.nextLine();
        //input.nextLine();

        System.out.println("Enter Email ::");
        email = input.nextLine();
        //input.nextLine();

        System.out.println("Enter Adhar ::");
        adharNo = input.nextInt();

        System.out.println("Enter sim type ::");
        type = input.next();
        input.nextLine();



        System.out.println("Enter Balance ::");
        balance = input.nextInt();

        Random random = new Random();
        int mobileNo = random.nextInt(900000000) + 1000000000;


        connectionsList.add(new Connections(name, email, adharNo, type , balance, mobileNo , Validity));

        System.out.println("Mobile No :: " + mobileNo);

    }
}
