package function;

import information.Contact;
import information.JDBC;
import information.User;

import java.util.*;

/**
 * @ClassName SortServlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 19:51]
 * @Version 1.0
 **/

public class SortServlet extends Servlet {
    @Override
    public void service(Contact contact, Scanner scanner) {
        Comparator comparator=null;
        System.out.println("请选择按照何种方式排序：");
        System.out.println("1:按姓名排序");
        System.out.println("2:按邮政编码排序");
        int line=scanner.nextInt();
        List<User> users= JDBC.showUser();
        switch (line){
            case 1:
                comparator=new SortByName();
                break;
            case 2:
                comparator=new SortByPostal();
                break;
            default:break;
        }
        sortby(users,comparator);
    }
    private static void sortby(List<User> users, Comparator comparator) {
        for(int i=1;i<users.size();i++){
            User user=users.get(i);
            int j=i-1;
            for (; j >=0&&(comparator.compare(users.get(j),user)>0) ; j--) {
                users.set(j+1,users.get(j));
            }
            users.set(j+1,user);
        }
        for(User user:users){
            System.out.println(user);
        }
    }
}
