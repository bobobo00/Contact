package function;

import java.util.Comparator;
import information.*;
/**
 * @ClassName SortByName
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/4 19:49]
 * @Version 1.0
 **/

public class SortByName implements Comparator<User> {


    @Override
    public int compare(User o1, User o2) {
        return (o1.getName().compareTo(o2.getName()));
    }
}
