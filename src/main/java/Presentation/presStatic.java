package Presentation;

import Dao.daoImplementation;
import Metier.metierImplementation;

public class presStatic {
    public static void main(String[] args) {
        daoImplementation dao = new daoImplementation();
        metierImplementation metier = new metierImplementation(dao);
        //metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
