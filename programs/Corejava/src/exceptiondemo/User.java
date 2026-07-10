package exceptiondemo;

public class User {

    private int id;
    private String birthDay;
    private String name;

    public User(int id, String birthDay, String name) {
        this.id = id;
        this.birthDay = birthDay;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
