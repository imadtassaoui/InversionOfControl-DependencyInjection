package Presentation;

import Dao.daoInterface;
import Metier.metierInterface;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presDynamic {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));  // FileNotFoundException
        String daoClassName = scanner.nextLine();
        Class ClassDao = Class.forName(daoClassName);   // ClassNotFoundException
        daoInterface dao = (daoInterface) ClassDao.newInstance();     // InstantiationException   -   IllegalAccessException

        String metierClassName = scanner.nextLine();
        Class ClassMetier = Class.forName(metierClassName);   // ClassNotFoundException
        metierInterface metier = (metierInterface) ClassMetier.newInstance();     // InstantiationException   -   IllegalAccessException

        Method  method = ClassMetier.getMethod("setDao", daoInterface.class);
        method.invoke(metier, dao);

        System.out.println(metier.calcul());
    }
}
