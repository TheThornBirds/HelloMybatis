package letian.mybatis.dao;

import letian.mybatis.bean.User;
//
/**
 * Created by 吴晨 on 2017/7/26.
 */

/**
 * UserMapper是一个接口，
 * 其接口名称以及定义的方法名称findById是
 * 能与letian/mybatis/mapper/UserMapper.xml中的配置对应起来的
 */
public interface UserMapper {
    User findById(int id);
}
