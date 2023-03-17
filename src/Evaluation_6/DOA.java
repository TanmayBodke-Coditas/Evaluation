package Evaluation_6;

import java.sql.*;
import java.util.Scanner;

public class DOA {


    public static void insertStudent(Student student) {


        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "insert into student values(?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //int id, int t_id, String name, String city, String subject, int marks
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getCity());
            preparedStatement.setString(4, student.getSubject());
            preparedStatement.setInt(5, student.getMarks());
            preparedStatement.executeUpdate();
            System.out.println("Student added sucessfully...");
        } catch (Exception e) {
            System.out.println("Exception");
        }


    }

    public static void insertTeacher(Teacher teacher) {


        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "insert into teacher values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //int tid, String name, String city, String subject, int salary, int experience , int sid
            preparedStatement.setInt(1, teacher.getTid());
            preparedStatement.setString(2, teacher.getName());
            preparedStatement.setString(3, teacher.getCity());
            preparedStatement.setString(4, teacher.getSubject());
            preparedStatement.setInt(5, teacher.getSalary());
            preparedStatement.setInt(6, teacher.getExperience());
            preparedStatement.setInt(7, teacher.getSid());
            preparedStatement.executeUpdate();
            System.out.println("Teacher added sucessfully...");
        } catch (Exception e) {
            System.out.println("Exception");
        }


    }

    public static void showStudent() {
        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                //int id,  String name, String city, String subject, int marks
                System.out.println("ID ::" + resultSet.getInt(1));
                System.out.println("Name ::" + resultSet.getString(2));
                System.out.println("City :: " + resultSet.getString(3));
                System.out.println("Subject ::" + resultSet.getString(4));
                System.out.println("Marks :: " + resultSet.getInt(5));

            }

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void showTeacher() {
        try {
            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from teacher";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                //int tid, String name, String city, String subject, int salary, int experience , int sid
                System.out.println("ID ::" + resultSet.getInt(1));
                System.out.println("Name ::" + resultSet.getString(2));
                System.out.println("City :: " + resultSet.getString(3));
                System.out.println("Subject ::" + resultSet.getString(4));
                System.out.println("Salary :: " + resultSet.getInt(5));
                System.out.println("Exp :: " + resultSet.getInt(6));
                System.out.println("Sid :: " + resultSet.getInt(7));

            }

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}




/*
  break;
            case 2:
                try {
                    Connection connection = ConnectionProvider.createConnection();
                    String query = "a";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.executeUpdate();
                    System.out.println("Student added sucessfully...");
                } catch (Exception e) {
                    System.out.println("Exception");
                }

 */
