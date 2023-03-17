package Evaluation_6;

import javax.imageio.ImageReader;
import java.util.Scanner;

public class Driver {

    //1. 1 Teacher Many Students
    //2. Find all students whose name start with 'z'
    //3. Find all teachers whose experience is greater than or = 5, salary >=50000
    //4. update marks based on id
    //5. find all students are from pune and teacher name ends with 'a'
    public static void main(String[] args) {
        System.out.println("Welcome");

        ConnectionProvider.createConnection();
        while(true){
            System.out.println("Press 1 :: Enter Details");
            System.out.println("Press 2 :: ");
            System.out.println("Press 3 :: ");
            System.out.println("Press 4 :: ");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("1. Add student");
                    System.out.println("2. Add teacher");
                    int choice1 = input.nextInt();
                    switch (choice1){
                        case 1:
                            System.out.println("Enter Id ::");
                            int id = input.nextInt();

                            System.out.println("Enter Name ::");
                            String name = input.next();
                            input.nextLine();
                            System.out.println("Enter City ::");
                            String city = input.nextLine();

                            System.out.println("Enter Subject ::");
                            String subject = input.nextLine();

                            System.out.println("Enter marks");
                            int marks = input.nextInt();
                            Student student = new Student(id, name, city, subject, marks);
                            DOA.insertStudent(student);
                            break;
                        case 2:
                            //int tid, String name, String city, String subject, int salary, int experience
                            System.out.println("Enter Id ::");
                            int tid = input.nextInt();
                            System.out.println("Enter Name ::");
                            String tname = input.next();
                            input.nextLine();
                            System.out.println("Enter City ::");
                            String tcity = input.nextLine();
                            System.out.println("Enter Subject ::");
                            String tsubject = input.nextLine();
                            System.out.println("Enter Salary ::");
                            int salary = input.nextInt();
                            System.out.println("Enter Experience ::");
                            int experience = input.nextInt();
                            System.out.println("Enter student id::");
                            int sid = input.nextInt();

                            Teacher teacher = new Teacher(tid, tname, tcity,tsubject, salary, experience, sid);
                            DOA.insertTeacher(teacher);

                    }

                case 2 :
                    System.out.println("1. Show student details" );
                    System.out.println("2. Show teacher details");
                    int choice2 = input.nextInt();
                    switch (choice2){
                        case 1:
                            DOA.showStudent();
                        case 2:
                            DOA.showTeacher();

                    }
                    break;
                case 3 :
                    System.out.println("");
                    break;
                case 0:
                    break;
            }
        }
    }
}
