
import cn.zxt.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {



    public static void main(String[] args) {

        /*com.alibaba.dubbo.container.Main.main(args);*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.hello("罗成"));
    }
}
