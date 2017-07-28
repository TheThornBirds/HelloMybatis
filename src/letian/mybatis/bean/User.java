package letian.mybatis.bean;

/**
 * Created by wuchen on 2017/7/26.
 */

import java.util.List;

/**
 * 修改，将password删掉
 */
public class User {
    private int id;
    private String password;
    private String name;
    private String email;
    private List<Blog> blogs;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", blogs=" + blogs +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public User(int id, String password, String name, String email, List<Blog> blogs) {
    
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.blogs = blogs;
    }
}
