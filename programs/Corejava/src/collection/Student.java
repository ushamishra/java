package collection;


public class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private String standard;
    private char section ;
    private double percentage;

    public Student(int rollNo, String name, String standard, char section,double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
        this.section = section;
        this.percentage = percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", section=" + section +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public  int compareTo(Student o) {

        Double mark1 = this.percentage;
        Double mark2 = o.percentage;
        return mark1.compareTo(mark2);

    }
}
