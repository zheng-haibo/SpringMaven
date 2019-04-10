import cn.service.IMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Scanner;

public class TestMessage {


    public static void main(String[] args) throws IOException {

        Resource resource = new ByteArrayResource("www.baidu.com".getBytes());

        Scanner scanner = new Scanner(resource.getInputStream());

        while(scanner.hasNext()){

            System.out.println(scanner.nextLine());

        }
        scanner.close();
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IMessageService messageService = ac.getBean("msg",IMessageService.class);
//        System.out.println(messageService.out());
    }
}
