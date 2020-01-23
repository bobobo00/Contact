package function;

import information.Contact;

import java.util.Scanner;
import Exception.*;
import information.JDBC;

/**
 * @ClassName DeletServlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 19:41]
 * @Version 1.0
 **/

public class DeletServlet extends Servlet {
    @Override
    public void service(Contact contact, Scanner scanner) {
        System.out.println("请输入删除联系人姓名");
        String name = scanner.nextLine();
        try {
            if(contact.map.containsKey(name)){
                contact.deletPerson(name);
                System.out.println("删除联系人成功");
            }else{
                JDBC.deletUser(name);
                System.out.println("联系人已删除！");
            }
        } catch (NullPointerPersonException e) {
            System.out.println("删除联系人失败，该联系不存在！");
        }
    }
}
