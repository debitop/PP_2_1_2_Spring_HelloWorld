import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloBean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloBean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(helloBean1.getMessage());
        System.out.println(catBean1.getMessage());

        System.out.println("бины helloworld равны? " + (helloBean1 == helloBean2));
        System.out.println("бины cat равны? " + (catBean1 == catBean2));
    }
}