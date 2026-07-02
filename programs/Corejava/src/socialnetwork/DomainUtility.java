package socialnetwork;

public class DomainUtility {

    void createUsers(){

        User user = new User();
        user.setValues("Mounika","UK","London",4445,"hghh@77");

    }

    public static float convertCelsiusToFarhenhite( float tempInCelsius) {

        float farhenhite = (9/5)* tempInCelsius +32;

        return farhenhite;
    }


}

// class has attributes/properties and method