package proxy.dynamic.gp;


import proxy.Person;
import proxy.dynamic.jdk.Girl;

/**
 * @author jill
 */
public class GpProxyTest {

    public static void main(String[] args) {

        //JDK动态代理的实现原理
        Person obj = (Person) new GpMeiPo().getInstance(new Girl());
        System.out.println(obj.getClass());
        try {
            obj.findLove();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }

}
