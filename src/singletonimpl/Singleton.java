package singletonimpl;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Singleton {

    private static Singleton instance;
    private String info;

    private Singleton(String info) {
        this.info = info;
    }

    private Singleton() {

    }

    public static Singleton getInstance(String info) {
        if (instance == null)
            instance = new Singleton(info);

        instance.info = info;
        return instance;
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void printInfo() {
        System.out.println(info);
    }

    public void setInfo(String info) {
        this.info = info;
    }
}