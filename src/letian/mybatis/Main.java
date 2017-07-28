package letian.mybatis;

import letian.mybatis.bean.User;
import letian.mybatis.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by wuchen on 2017/7/26.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sessionFactory;
        sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = userMapper.findById(1);
        //源码OK查询成功
//        System.out.println(user);

        //源码OK查询成功

        //虽然能查询出来，但是username的值为null。因为字段名和属性名不一致

        //改过之后即可正常查询出username
//        List<User> list = userMapper.findByPassword("123");
//        for (User user: list ) {
//            System.out.println(user);
//        }

        //知道name和password，只查询三个字段
        //源码OK，查询正确
//        HashMap<String, String> userInfo = new HashMap<String, String>();
//        userInfo.put("name", "letian");
//        userInfo.put("password", "123");
//        user = userMapper.findByNameAndPassword(userInfo);
//        System.out.println(user);

        //添加一个用户，源码OK，添加正确 (user1方法)
//        User user1 = new User();
//        user1.setUsername("xiaowy");
//        user1.setEmail("xiaowei@111.com");
//        user1.setPassword("456");
//
//        userMapper.insertUser1(user1);
//        sqlSession.commit();
//        System.out.println(user1);

        //添加一个用户(user2方法)源码OK，查询正确
//        User user2 = new User(0,"1234","mengmeng","haha@qq.com");
//        userMapper.insertUser2(user2);
//        sqlSession.commit();
//        System.out.println(user2);

        //修改一个用户密码 源码OK，测试正确
//        User user = userMapper.findById(1);
//        user.setPassword("4567");
//        userMapper.updateUserPassword(user);
//        System.out.println(userMapper.findById(1).getPassword());
        User user = userMapper.findById(6);
        System.out.println(user);
        userMapper.delete(user);
        user = userMapper.findById(6);
        System.out.println("user2------"+user);

        sqlSession.commit();
        sqlSession.close();


    }
}
