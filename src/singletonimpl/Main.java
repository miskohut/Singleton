package singletonimpl;

/**
 * Created by misko on 11.1.2015.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Singleton.getInstance("Ahoj").printInfo();
        Singleton.getInstance("ako sa mas").printInfo();

        Singleton singleton = Singleton.getInstance();

        singleton.printInfo();

        Singleton singleton1 = Singleton.getInstance("bla bla");

        System.out.println("//=======================================");

        singleton1.printInfo();
        singleton.setInfo("ahoj asdf a");
        singleton.printInfo();
    }
}
