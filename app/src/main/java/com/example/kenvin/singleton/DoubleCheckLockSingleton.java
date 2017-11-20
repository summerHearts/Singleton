package com.example.kenvin.singleton;

/**
 * Created by Kenvin on 2017/11/20.
 */

/**
 * “双重检查锁定背后的理论是完美的。不幸地是，现实完全不同。
 * 双重检查锁定的问题是：并不能保证它会在单处理器或多处理器计算机上顺利运行。双重检查锁定失败的问题并不归咎于 JVM 中的实现 bug，而是归咎于 Java 平台内存模型。
 * 内存模型允许所谓的“无序写入”，这也是这些习语失败的一个主要原因。”
 *  volatile关键字确保：当instance变量被初始化成Singleton实例时，多个线程正确地得到instance变量。
 *  如果性能是你关心的重点，那么这个做法可以帮你大大地减少getInstance()的时间耗费。
 */
public class DoubleCheckLockSingleton {
    private volatile static DoubleCheckLockSingleton instance;
    private DoubleCheckLockSingleton (){}
    public static DoubleCheckLockSingleton getSingleton() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
