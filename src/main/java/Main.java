import config.AppConfig;
import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User user1 = new User();
        user1.setName("John");
        user1.setAge(20);
        userService.add(user1);

        User user2 = new User();
        user2.setName("Bob");
        user2.setAge(22);
        userService.add(user2);

        userService.listUsers().forEach(System.out::println);
    }
}
