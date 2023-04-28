package Dao;

public class daoImplementation2 implements daoInterface {
    @Override
    public double getData() {
        System.out.println("Second Version");
        double value = 1937;
        return value;
    }
}
