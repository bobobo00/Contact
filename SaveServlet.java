package function;

import information.Contact;
import information.JDBC;
import information.User;

import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName SaveServlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 16:06]
 * @Version 1.0
 **/

public class SaveServlet extends Servlet {
    @Override
    public void service(Contact contact, Scanner scanner) {
        Map<String, User> map=contact.map;
        if(!map.isEmpty()){
            for(Map.Entry<String,User> entry:map.entrySet()){
                 JDBC.save(entry.getValue());
            }
        }


    }
}
