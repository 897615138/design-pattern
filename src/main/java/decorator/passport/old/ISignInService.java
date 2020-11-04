package decorator.passport.old;

/**
 * @author jill
 */
public interface ISignInService {
    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @return return
     */
    ResultMsg regist(String username, String password);

    /**
     * 登录的方法
     *
     * @param username u
     * @param password p
     * @return re
     */
    ResultMsg login(String username, String password);
}
