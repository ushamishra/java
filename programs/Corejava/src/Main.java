import socialnetwork.User;
import socialnetwork.DomainUtility;
import socialnetwork.blog.Blog;
public class Main extends User {
    public static void main(String[] args) {
        User user1 = new User("usha","india","Bhubaneswar",8778,"heopp@77");
       

        User user2 = new User("Mounika","UK","London",4445,"hghh@77");



        System.out.println("User1 name: " + user1.getName());

        System.out.println("User2 name : " + user2.getName() + "User2 counry : "+user2.getName());

        DomainUtility domainUtility = new DomainUtility();
        float farhenhiteTemp = domainUtility.convertCelsiusToFarhenhite(23);
        System.out.println(farhenhiteTemp);
        float changedTemp = DomainUtility.convertCelsiusToFarhenhite(45);
        System.out.println(changedTemp);

    }
}
