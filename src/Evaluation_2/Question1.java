package Evaluation_2;

class Que1 {
    int id;
    String firstName;
    String lastName;
    String education;
    int marks;

    void displayRemarks() {
        if (marks >= 70) {
            System.out.println("Remark is Distinction");
        } else if (marks < 70 && marks >= 60) {
            System.out.println("Remark is First Class");
        } else if (marks < 55 && marks >= 50) {
            System.out.println("Remark is Second Class");
        } else if (marks < 50 && marks >= 35) {
            System.out.println("Remark is Pass Class");
        } else if (marks < 35) {
            System.out.println("Remark is Fail");
        }
    }
}

public class Question1{
    public static void main(String[] args) {
        Que1 que1 = new Que1();
        que1.marks = 79;
        System.out.println("----------------------OUTPUT OF QUE1----------------------");
        que1.displayRemarks();
    }
}


/*
----------------------OUTPUT OF QUE1----------------------
Remark is Distinction
 */