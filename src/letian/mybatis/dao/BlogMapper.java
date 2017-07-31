package letian.mybatis.dao;

import letian.mybatis.bean.Blog;

import java.util.HashMap;
import java.util.List;

/**
 * Created by wuchen on 2017/7/31.
 */
public interface BlogMapper {
    Blog findById(int id);
    List<Blog> findAll();
    List<Blog> findAll2(HashMap<String, Integer> offsetLimit);
}
