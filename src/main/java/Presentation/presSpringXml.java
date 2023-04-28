package Presentation;

import Metier.metierInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        metierInterface metier = (metierInterface) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
