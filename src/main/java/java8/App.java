package java8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        ZooPark zooPark = applicationContext.getBean("zooPark", ZooPark.class);
        zooPark.getAnimalInfo();

        applicationContext.close();
    }
}
