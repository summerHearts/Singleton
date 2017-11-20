package com.example.kenvin.singleton;

/**
 * Created by Kenvin on 2017/11/20.
 */

/**
 * 这种方式适合于单线程程序，多线程情况下需要保护getInstance()方法，否则可能会产生多个Singleton对象的实例。
 */
public class LazySingleton {

    private  static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
