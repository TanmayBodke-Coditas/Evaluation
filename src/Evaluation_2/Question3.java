package Evaluation_2;

class Que3{
  int arr[] = { 1, 2,3, 4,5,6,7};

  public void add(){
      int result = 0;
      for(int i = 0 ; i< arr.length; i+=2){
          result = result + arr[i];
      }
      System.out.println( "addition of even index elements :: " + result);
  }
    public void multiply(){
        int result = 1;
        for(int i = 1 ; i< arr.length; i+=2){
            result = result * arr[i];
        }
        System.out.println( "multiplication of odd index elements :: " + result);
    }
}
public class Question3 {
    public static void main(String[] args) {
     Que3 que3 = new Que3();
     System.out.println("----------------------OUTPUT OF QUE3_Add----------------------");
     que3.add();
     System.out.println("----------------------OUTPUT OF QUE3_Multiply----------------------");
     que3.multiply();
    }
}

/*
----------------------OUTPUT OF QUE3_Add----------------------
addition of even index elements :: 16
----------------------OUTPUT OF QUE3_Multiply----------------------
multiplication of odd index elements :: 48

 */