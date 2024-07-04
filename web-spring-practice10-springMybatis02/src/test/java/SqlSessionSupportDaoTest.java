import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import java.util.ArrayList;
import com.company.pojo.User;
import com.company.dao.UserMapperImpl;

public class SqlSessionSupportDaoTest {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        ArrayList<User> userArray = applicationContext.getBean("userMapperImpl", UserMapperImpl.class).selectAll();
        for(User ele: userArray) {
            System.out.println(ele.toString());
        }
    }
}