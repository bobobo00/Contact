package function;


import information.Contact;
import information.JDBC;
import information.User;

import java.util.Scanner;

/**
 * @ClassName SearchServlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 16:16]
 * @Version 1.0
 **/

public class SearchServlet extends Servlet {
    @Override
    public void service(Contact contact, Scanner scanner) {
        System.out.println("请输入查询联系人姓名");
        String name=scanner.nextLine();
        User person=contact.searchPerson(name);
        if(person!=null) {
            System.out.println(person);
            //System.out.println("查询成功！");
        }else {
            User user=JDBC.searchUser(name);
            if(user==null){
                System.out.println("该联系人不存在！");
            }else{
                System.out.println(user);
                System.out.println("查询成功！");
            }
        }
    }
}
