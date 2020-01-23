package function;

import information.Contact;
import information.JDBC;
import information.User;

import java.util.Scanner;

/**
 * @ClassName UpdateServlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 20:22]
 * @Version 1.0
 **/

public class UpdateServlet extends Servlet {
    @Override
    public void service(Contact contact, Scanner scanner) {
        System.out.println("请输入需要修改联系人的姓名");
        String name=scanner.nextLine();
        User user=JDBC.searchUser(name);
        if(user==null){
            System.err.println("该联系人不存在！");
            return;
        }
        System.out.println("请选择需要修改的信息：");
        System.out.println("电话：");
        String phone=scanner.nextLine();
        System.out.println("邮政编码：");
        String postal=scanner.nextLine();
        System.out.println("家庭住址：");
        String  address=scanner.nextLine();
        JDBC.deletUser(name);
        JDBC.save(new User(name,phone,postal,address));
        System.out.println("修改成功！");
    }
}
