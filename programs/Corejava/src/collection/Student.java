package collection;

public class Student {

    private int rollNo;
    private String name;
    private String standard;
    private char section ;

    public Student(int rollNo, String name, String standard, char section) {
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
        this.section = section;
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

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", section=" + section +
                '}';
    }
}
