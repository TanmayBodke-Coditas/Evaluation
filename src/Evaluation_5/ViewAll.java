package Evaluation_5;

public class ViewAll extends Connections{
    public void viewAllUsers(){
        for (Connections connections: connectionsList) {
            System.out.println("Name : " + connections.name);
            //System.out.println("address : " + connections.address);
            System.out.println("Adhar No. ::"  + connections.adharNo);
            System.out.println("Type :: " + connections.type);
            System.out.println("balance :: " + connections.balance);
            System.out.println("Mobile No :: " + connections.mobileNo);
            System.out.println("Validity ::" + connections.Validity);

        }
    }
}


