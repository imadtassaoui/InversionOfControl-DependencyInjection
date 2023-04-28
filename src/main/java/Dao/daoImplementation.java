package Dao;

import org.springframework.stereotype.Component;

import static java.lang.Math.random;

@Component("dao")
public class daoImplementation implements  daoInterface{
    @Override
    public double getData() {
        System.out.println("First Version");
        double value = Math.random();
        return value;
    }
}
