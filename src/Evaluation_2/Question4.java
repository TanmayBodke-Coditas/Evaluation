package Evaluation_2;

class Que4{
    void printPattern(){
        for(int i =0; i<=4; i++){
            for(int j=i; j<4; j++){
                System.out.print(" ");
            }
            for(int k =0; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
public class Question4 {
    public static void main(String[] args) {
            Que4 que4 = new Que4();
            System.out.println("----------------------OUTPUT OF QUE4----------------------");
            que4.printPattern();
    }
}

/*
----------------------OUTPUT OF QUE4----------------------


   *
  * *
 * * *
* * * *

 */