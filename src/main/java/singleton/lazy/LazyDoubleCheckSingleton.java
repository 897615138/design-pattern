package singleton.lazy;

/**
 * @author jill
 */

@SuppressWarnings("ALL")
public
class LazyDoubleCheckSingleton {
    /**
     * 私有化可见静态变量
     */
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                            /*
                                        1.分配内存给这个对象
                                        2.初始化对象
                                        3.设置lazy指向刚分配的内存地址
                                        4.初次访问对象
                             */
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
