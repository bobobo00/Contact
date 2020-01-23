package function;

import information.Contact;
import information.JDBC;
import information.User;

import java.util.List;
import java.util.Scanner;

/**
 * @ClassName ShowServlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 19:35]
 * @Version 1.0
 **/

public class ShowServlet extends Servlet {
    @Override
    public void service(Contact contact, Scanner scanner) {
       List<User> users=JDBC.showUser();
       if(users.size()!=0){
           for(User user:users){
               System.out.println(user);
           }
       }
    }
}
