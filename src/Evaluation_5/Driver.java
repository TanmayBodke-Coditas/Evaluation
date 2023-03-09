package Evaluation_5;

import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int choice=100;

        NewConnection newConnection = new NewConnection();
        Prepaid prepaid = new Prepaid();
        ViewAll viewAll = new ViewAll();

        while(choice !=0){
            System.out.println("1 : Prepaid");
            System.out.println("2 : New Connection");
            System.out.println("3 : view all users");
            System.out.println("0 : exit");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice){
                case 1:
                    //Prepaid User



                    break;
                case 2:
                   newConnection.addConnection();

                    break;
                    //new connection
                case 3:
                    viewAll.viewAllUsers();
                    break;
                    //view all users
                case 0:
                    choice =0;
                    break;
            }

        }
    }
}
