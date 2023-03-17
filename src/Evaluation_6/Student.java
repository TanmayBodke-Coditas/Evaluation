package Evaluation_6;

public class Student {
    private int id;


    private String name;
    private String city;
    private String subject;
    private int marks;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public Student(int id,  String name, String city, String subject, int marks) {
        this.id = id;

        this.name = name;
        this.city = city;
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student_Details{" +
                "id=" + id +

                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
