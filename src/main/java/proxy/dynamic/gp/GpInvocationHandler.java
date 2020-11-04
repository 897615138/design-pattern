package proxy.dynamic.gp;

import java.lang.reflect.Method;

/**
 * @author jill
 */
@SuppressWarnings("ALL")
public
interface GpInvocationHandler {
    /**
     * 调用
     * @param proxy 代理
     * @param method 方法
     * @param args 参数
     * @return return
     * @throws Throwable 异常
     */
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
