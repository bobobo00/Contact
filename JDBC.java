package information; /**
 * @ClassName SaveData
 * @Description TODO
 * @Auther danni
 * @Date 2020/1/4 20:55]
 * @Version 1.0
 **/


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    static Connection inital(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu?useSSl=false&characterEncoding=UTF8",
                    "root",
                    "0813");
            // System.out.println(connection);
        }catch (Exception e) {
            System.err.println("数据库连接异常");
        }
        return connection;
    }
    public static void  save(User user) {
        //连接数据库
        Connection connection=inital();

        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO contact VALUES  (?,?,?,?)")) {
            statement.setString(1,user.getName());
            statement.setString(2,user.getMobliephone());
            statement.setString(3,user.getPostal());
            statement.setString(4,user.getAddress());
            statement.execute();
        }catch (SQLException e) {
            System.err.println("该联系人已存在！");;
        }
    }
    public static User searchUser(String name){
        //连接数据库
        Connection connection=inital();

        try(PreparedStatement statement =connection.prepareStatement("select * from contact where name=?")){
            String uname="";
            String uphone="";
            String upostal="";
            String address="";
            statement.setString(1,name);
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                uname=resultSet.getString(1);

                uphone=resultSet.getString(2);

                upostal=resultSet.getString(3);

                address=resultSet.getString(4);

               // System.out.println(line);
                return new User(uname,uphone,upostal,address);
            }
        }catch (Exception e){
            System.err.println("数据库异常");
        }
       return null;
    }
    public static List<User> showUser(){
        List<User> users=new ArrayList<>();
        //连接数据库
        Connection connection=inital();
        try(PreparedStatement statement =connection.prepareStatement("select * from contact")){
            String uname="";
            String uphone="";
            String upostal="";
            String address="";
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                uname=resultSet.getString(1);

                uphone=resultSet.getString(2);

                upostal=resultSet.getString(3);

                address=resultSet.getString(4);
                users.add(new User(uname,uphone,upostal,address));
            }
        }catch (Exception e){
            System.err.println("数据库异常");
        }
        return users;
    }
    public static void deletUser(String name){
        //连接数据库
        Connection connection=inital();
        try(PreparedStatement statement =connection.prepareStatement("delete from contact where name=?")){
            statement.setString(1,name);
            statement.execute();

        }catch (Exception e){
            System.err.println("数据库异常");
        }
    }
}



