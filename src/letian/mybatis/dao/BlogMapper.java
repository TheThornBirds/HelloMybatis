package letian.mybatis.dao;

import letian.mybatis.bean.Blog;

/**
 * Created by wuchen on 2017/7/31.
 */
public interface BlogMapper {
    Blog findById(int id);
}
