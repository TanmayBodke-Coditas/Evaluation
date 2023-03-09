package Evaluation_5;

import java.util.Scanner;

public class Prepaid extends Connections{

    int mobileNo;
    public void Recharge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mobile No. :: ");
        mobileNo = input.nextInt();
        int choice = 100;
        while (choice !=0){
            System.out.println("0 : Check balance and Validity ");
            System.out.println("1 : Recharge");
            choice = input.nextInt();
            switch (choice){
                case 0:
                    for (Connections connections: connectionsList) {
                        if(mobileNo == connections.mobileNo){
                            System.out.println("Name :: " + connections.name);
                            System.out.println("Balance :: " + connections.balance);
                            System.out.println("Validity :: " + connections.Validity);
                        }
                    }
                    break;

                case 1:
                    System.out.println("please enter recharge amount :: ");
                    int rechargeAmt = input.nextInt();
                    for (Connections connections: connectionsList) {
                        if(mobileNo == connections.mobileNo){
                            connections.balance = connections.balance + rechargeAmt;
                            connections.Validity =  today.plusMonths(1);
                        }
                    }
                    break;


            }

        }


        }
    }

