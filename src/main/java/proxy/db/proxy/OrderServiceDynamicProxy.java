package proxy.db.proxy;


import proxy.db.db.DynamicDataSourceEntity;
import proxy.dynamic.gp.GpClassLoader;
import proxy.dynamic.gp.GpInvocationHandler;
import proxy.dynamic.gp.GpProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jill on 2019/3/10.
 */
public
class OrderServiceDynamicProxy implements GpInvocationHandler {

    private final SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object proxyObj;

    private static void after() {
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return GpProxy.newProxyInstance(new GpClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxyObj, args);
        after();
        return object;
    }

    /**
     * @param target 订单对象Order
     */
    private void before(Object target) {
        try {
            //进行数据源的切换
            System.out.println("Proxy before method");

            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            int dbRouter = Integer.parseInt(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
