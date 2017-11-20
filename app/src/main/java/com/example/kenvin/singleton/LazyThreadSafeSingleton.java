package com.example.kenvin.singleton;

/**
 * Created by Kenvin on 2017/11/20.
 */

/**
 * 这种方式适合于单线程程序，多线程情况下需要保护getInstance()方法，否则可能会产生多个Singleton对象的实例。
 */
public class LazyThreadSafeSingleton {

    private  static  LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton() {

    }

    //在多线程中很好的工作,效率很低，99%情况下不需要同步
    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (instance == null){
            instance = new LazyThreadSafeSingleton();
        }
        return instance;
    }
}
