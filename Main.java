package run;


import information.Contact;

import java.util.*;
import  Exception.*;
import  function.*;
import information.User;

/**
 * @ClassName Main
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/24 21:25]
 * @Version 1.0
 **/

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Contact contact=new Contact();
        boolean flag=true;
        while(flag) {
            Servlet servlet=null;
            menu();
            int select=scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    //添加联系人
                    servlet=new AddServlet();
                    servlet.service(contact,scanner);
                    break;
                case 2:
                    //查找联系人
                    servlet=new SearchServlet();
                    servlet.service(contact,scanner);
                    break;
                case 3:
                    //显示联系人
                    servlet=new ShowServlet();
                    servlet.service(contact,scanner);
                    break;
                case 4:
                    //删除联系人
                    servlet=new DeletServlet();
                    servlet.service(contact,scanner);
                    break;
                case 5:
                    //排序
                    servlet=new SortServlet();
                    servlet.service(contact,scanner);break;
                case 6:
                    //修改联系人
                    servlet=new UpdateServlet();
                    servlet.service(contact,scanner);
                    break;
                case 0:
                    System.out.println("退出通讯录！");
                    flag=false;
                    break;
                default:
                    System.out.println("请正确输入指令");
            }
        }
    }

    public static void menu(){
        System.out.println(" |    通讯录  | ");
        System.out.println(" |1：添加联系人| ");
        System.out.println(" |2：查看联系人| ");
        System.out.println(" |3：显示联系人| ");
        System.out.println(" |4：删除联系人| ");
        System.out.println(" |5：排序联系人| ");
        System.out.println(" |6：修改联系人| ");
        System.out.println(" |0：  退出   | ");
        System.out.println("请输入正确的指令：");
    }
}

