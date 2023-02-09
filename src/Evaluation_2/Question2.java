package Evaluation_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

class Que2{
    LocalDate currentDate = LocalDate.now();
    DayOfWeek dow = currentDate.getDayOfWeek();

    String day =  dow.toString().toLowerCase();

    String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public void displayToday(){
        switch(day){
            case "monday":
                System.out.println("It's a start of week");
                break;
            case "tuesday":
                System.out.println("It's a second day of week");
                break;
            case "wednesday":
                System.out.println("It's a third day of week");
                break;
            case "thursday":
                System.out.println("It's a fourth day of week");
                break;
            case "friday":
                System.out.println("yay!!! its a last day of week.. enjoy your weekend");
                break;
            case "saturday":
                System.out.println("Its a Weekend!!! majjani life :)");
                break;
            case "sunday":
                System.out.println("Last day of weekend :(");

        }

        }

    public void removeToday(){
        for(int i = 0; i< days.length; i++){
            if(days[i].toLowerCase().equals(day)){
                continue;
            }
            System.out.println(days[i]);
        }
    }
    
}
public class Question2 {
    public static void main(String[] args) {
        Que2 que2 = new Que2();
        System.out.println("----------------------OUTPUT OF QUE2_1----------------------");
        que2.displayToday();
        System.out.println("----------------------OUTPUT OF QUE2_2----------------------");
        que2.removeToday();
    }
}


/*
----------------------OUTPUT OF QUE2_1----------------------
It's a fourth day of week
----------------------OUTPUT OF QUE2_2----------------------
Monday
Tuesday
Wednesday
Friday
Saturday
Sunday

 */