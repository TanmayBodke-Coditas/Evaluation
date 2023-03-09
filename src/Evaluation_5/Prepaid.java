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
            for (Connections connections: connectionsList){
                if(connections.mobileNo!=mobileNo){
                    try{
                        choice =0 ;
                        throw new UserDoesNotExistsException();
                    }catch (UserDoesNotExistsException u){

                    }
                }
            }

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
                    if(rechargeAmt<=0){
                        try{
                            throw new RechargeAmountTooLowException();
                        }catch (RechargeAmountTooLowException r){

                        }
                    }
                    for (Connections connections: connectionsList) {
                        if(mobileNo == connections.mobileNo){
                            connections.balance = connections.balance + rechargeAmt;
                            connections.Validity =  connections.Validity.plusMonths(1);
                        }else{
                            try {
                                throw new UserDoesNotExistsException();
                            }catch (UserDoesNotExistsException u){

                            }
                        }
                    }
                    break;


            }

        }


        }
    }

