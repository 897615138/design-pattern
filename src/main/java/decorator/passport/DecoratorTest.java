package decorator.passport;


import decorator.passport.old.SignServiceImpl;
import decorator.passport.upgrade.ISignInForThirdService;
import decorator.passport.upgrade.SignInForThirdServiceImpl;

/**
 * @author jill on 2019/3/17.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISignInForThirdService signInForThirdService = new SignInForThirdServiceImpl(new SignServiceImpl());
        signInForThirdService.loginForQq("steadfast");

    }


}
