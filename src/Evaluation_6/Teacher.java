package Evaluation_6;

public class Teacher {
    private int tid;


    private String name;
    private String city;

    private String subject;
   private int salary;
  private int experience;

  private  int sid;


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Teacher(int tid, String name, String city, String subject, int salary, int experience , int sid) {
        this.tid = tid;
        this.name = name;
        this.city = city;
        this.subject = subject;
        this.salary = salary;
        this.experience = experience;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Teacher_Details{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
