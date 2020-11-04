package proxy.dynamic.jdk;


import java.lang.reflect.Method;

/**
 * obj.findLove();
 * <p>
 * $Proxy0
 * byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
 * FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
 * os.write(bytes);
 * os.close();
 *
 * @author jill
 */

public class JdkProxyTest {

    public static void main(String[] args) {
        try {
            Object obj = new JdkMeiPo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
