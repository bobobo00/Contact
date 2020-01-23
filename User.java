package information;

/**
 * @ClassName User
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/24 21:25]
 * @Version 1.0
 **/

public  class User {
    private String name;
    private String mobliephone;
    private String postal;
    private String address;

    public User(String name, String mobliephone, String postal,String address) {
        this.name = name;
        this.mobliephone = mobliephone;
        this.postal = postal;
        this.address=address;
    }

    public User() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobliephone(String mobliephone) {
        this.mobliephone = mobliephone;
    }



    public String getName() {
        return name;
    }

    public String getMobliephone() {
        return mobliephone;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return String.format("|姓名：%s|移动电话：%s|邮政编码：%s|地址：%s|",name,mobliephone,postal,address);
    }
}
