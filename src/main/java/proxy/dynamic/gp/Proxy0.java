package proxy.dynamic.gp;

import proxy.Person;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author JillW
 * @date 2020/10/30
 */


public
class Proxy0 implements Person {
    private final GpInvocationHandler h;

    public Proxy0(GpInvocationHandler h) {
        this.h = h;
    }

    @Override
    public void findLove() throws Throwable {
        try {
            Method m = Person.class.getMethod("findLove");
            h.invoke(this, m, new Object[]{});
        } catch (Exception throwable) {
            throwable.printStackTrace();
            throw new UndeclaredThrowableException(throwable);
        }
    }
}

