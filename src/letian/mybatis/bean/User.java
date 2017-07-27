package letian.mybatis.bean;

/**
 * Created by wuchen on 2017/7/26.
 */

/**
 * 修改，将password删掉
 */
public class User {
    private int id;
    private String username;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.username = name;
        this.email = email;
    }
}
