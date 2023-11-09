package other;

import cn.hutool.core.date.DateUtil;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIOC.dao.UserDao;
import springIOC.service.UserService;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

/**
 * tttest01:
 *
 * @author: zsm
 * @time: 2023/5/23 11:39
 */
public class tttest01 {

    @Test
    public void tets0012(){
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.add("a");
        stringJoiner.add("b");
        stringJoiner.add("c");
        stringJoiner.add("d");
        stringJoiner.add("f");
        System.out.println(stringJoiner);
    }

    @Test
    public void test0012(){
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));


            Integer c = new Integer(1);
            Integer d = new Integer(1);
        System.out.println(c == d);

    }


    @Test
    public void test01(){
        //创建工厂对象
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //创建一个读取器（xml）
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        //读取配置文件给工厂
        xmlBeanDefinitionReader.loadBeanDefinitions("Beans.xml");
        //获取bean对象
        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService");
        userService.soutUserServcie();
    }

    @Test
    public void test02(){
        //ApplicationContext接口相当于封装了BeanFactory
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        userService.soutUserServcie();
        classPathXmlApplicationContext.close();
    }


    @Test
    public void test03(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        UserDao userDao = (UserDao) classPathXmlApplicationContext.getBean("userDao1");
        userDao.soutUserDAO();
    }

    @Test
    public void test04(){
        Date data = new Date();
        System.out.println(data.getTime()/1000);
    }


    @Test
    public void test05(){
    String a = "一阿达";
        System.out.println(a.substring(0,2));
    }

    @Test
    public void test06(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String endTime = formatter.format(calendar.getTime());
        String startDayTime = DateUtil.beginOfMonth(calendar.getTime()).toString();
        calendar.add(Calendar.DATE, -1);
        String startTime = formatter.format(calendar.getTime());
        String substring = endTime.substring(0, 10);
        if(endTime.equals(substring)){
            System.out.println(startTime);
            System.out.println(startDayTime);

            System.out.println(startDayTime);
            System.out.println(endTime);

        }else{
            System.out.println(startTime);
            System.out.println(endTime);
        }
    }

}
