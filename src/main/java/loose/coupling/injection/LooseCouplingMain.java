package loose.coupling.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingMain {
    public static void main(String[] args) {
//        UserDataProvider dataProvider = new UserDatabase();
//        UserManager userManager = new UserManager(dataProvider);
//
//        System.out.println(userManager.getUserInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationInjectionCouplingContext.xml");
        UserManager userManager = (UserManager) context.getBean("userManager");
        System.out.println(userManager.getUserInfo());
    }

}
