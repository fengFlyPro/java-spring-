import com.zhf6.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {

    @Test
    public void test1() throws IOException {
        //读配置
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        //通过SqlSessionFactortyBuilder创建SqlSessionFactory会话工厂
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);

        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = ssf.openSession();

        //调用操作SqlSession数据库的方法
        User user = sqlSession.selectOne("findUserById", 10);
        System.out.println(user);

        //关闭SqlSession
        sqlSession.close();
    }
}
