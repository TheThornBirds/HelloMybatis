package letian.mybatis;

import letian.mybatis.bean.User;
import letian.mybatis.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
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
        List<User> list = userMapper.findByPassword("123");
        for (User user: list ) {
            System.out.println(user);
        }

    }
}
