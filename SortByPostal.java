package function;

import java.util.Comparator;
import information.*;
/**
 * @ClassName SortByPoatal
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/4 19:58]
 * @Version 1.0
 **/

public class SortByPostal implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return (o1.getPostal().compareTo(o2.getPostal()));
    }
}
