import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.dao.UserMapper;
import org.springframework.context.ApplicationContext;

public class AOPTest {
    @Test
    public void test () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper userMapper = applicationContext.getBean("userMapperImpl", UserMapper.class);
        userMapper.add();
    }
}