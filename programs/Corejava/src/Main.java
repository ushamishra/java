import socialnetwork.*;
import socialnetwork.blog.Blog;
public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setValues("usha","india","Bhubaneswar",8778,"heopp@77");


        User user2 = new User();
        user2.setValues("Mounika","UK","London",4445,"hghh@77");


        System.out.println("User1 name: " + user1.name);

        System.out.println("User2 name : " + user2.name);
    }
}
