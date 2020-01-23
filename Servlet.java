package function;

import java.util.Scanner;
import information.Contact;
/**
 * @ClassName servlet
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/5 15:54]
 * @Version 1.0
 **/

public abstract class Servlet {

    public abstract void service(Contact contact, Scanner scanner);
}
