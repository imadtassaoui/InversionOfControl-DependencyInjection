package Presentation;

import Metier.metierInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao", "Metier");
        metierInterface metier = context.getBean(metierInterface.class);
        System.out.println(metier.calcul());
    }
}
