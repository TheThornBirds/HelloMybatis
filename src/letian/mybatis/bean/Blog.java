package letian.mybatis.bean;

/**
 * Created by wuchen on 2017/7/28.
 */
public class Blog {
    private int id;
    private int ownerId;
    private String title;
    private String content;

    public Blog(int id, int ownerId, String title, String content) {
        this.id = id;
        this.ownerId = ownerId;
        this.title = title;
        this.content = content;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", ownerId=" + ownerId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
