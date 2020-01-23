package function;

import information.Contact;

import java.util.Scanner;
import Exception.*;
import information.JDBC;
import information.User;

/**
 * @ClassName AddServlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 19:32]
 * @Version 1.0
 **/

public class AddServlet extends Servlet {
    @Override
    public void service(Contact contact, Scanner scanner) {
        boolean flag=true;
        System.out.println("请输入联系人姓名");
        String name=scanner.nextLine();
        System.out.println("请输入联系人移动电话");
        String telephone=scanner.next();
        System.out.println("请输入联系人邮政编码");
        String postal=scanner.next();
        System.out.println("请输入联系人地址");
        String address=scanner.next();
        try {
            System.out.println("是否存储该联系人：");
            while(flag){
                String line=scanner.nextLine();
                switch (line){
                    case "是":
                        JDBC.save(new User(name,telephone,postal,address));
                        System.out.println("联系人存储成功！");
                        flag=false;
                        break;
                    case "否":
                        contact.addPerson(name,telephone,postal,address);
                        System.out.println("添加联系人成功");
                        flag=false;
                        break;
                }
            }
        } catch (NameExistException e) {
            System.out.println("添加联系人失败，联系人已存在！");
        }
    }
}
