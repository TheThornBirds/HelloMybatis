package letian.mybatis.dao;

import letian.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
/**
 * Created by 吴晨 on 2017/7/26.
 */

/**
 * UserMapper是一个接口，
 * 其接口名称以及定义的方法名称findById是
 * 能与letian/mybatis/mapper/UserMapper.xml中的配置对应起来的
 */
public interface UserMapper {

    //查询用户ID为1的用户
    User findById(int id);

    //查询密码为123的所有用户
    List<User> findByPassword(String password);

    //有name和password这两个信息，只获得对应的id、name和email
    User findByNameAndPassword(HashMap<String,String> userInfo);

    //新增两个添加用户的方法
    void insertUser1(User user);
    void insertUser2(User user);

    //更新用户的方法
    void updateUserPassword(User user);

    //根据ID删除用户
    void delete(User user);

    //删除ID大于某ID的所有用户
    void deleteByGreaterThanId(int id);

    //动态sql查询ID为1的用户
    User findById2(HashMap<String, Integer> id);

    User findById3(@Param("id") int id);

}
