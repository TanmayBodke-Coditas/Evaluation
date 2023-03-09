package Evaluation_5;

public class RechargeAmountTooLowException extends Throwable {
    RechargeAmountTooLowException(){
        System.out.println("Please enter valid recharge amount...");
    }
}
