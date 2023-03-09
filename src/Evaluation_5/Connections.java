package Evaluation_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Connections {
    String name;
    String email;
    String address;
    int adharNo;
    String type;

    int balance;
    long mobileNo;

    LocalDate today = LocalDate.now();
    LocalDate Validity;


    Connections(){

    }
    public static ArrayList<Connections> connectionsList = new ArrayList<>();


    public Connections(String name, String email, int adharNo, String type , int balance ,long mobileNo, LocalDate Validity  ) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.adharNo = adharNo;
        this.type = type;
        this.balance = balance;
        this.mobileNo = mobileNo;
        this.Validity = today.plusMonths(1);
    }
}
