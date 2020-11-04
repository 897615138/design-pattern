package adapter.loginadapter.v2;


import adapter.loginadapter.ResultMsg;
import adapter.loginadapter.SignInService;
import adapter.loginadapter.v2.adapters.LoginAdapter;
import adapter.loginadapter.v2.adapters.LoginForQqAdapter;
import adapter.loginadapter.v2.adapters.LoginForTelAdapter;
import adapter.loginadapter.v2.adapters.LoginForWechatAdapter;

/**
 * 结合策略模式、工厂模式、适配器模式
 *
 * @author jill
 */
public class PassportForThirdAdapter extends SignInService implements IPassportForThird {

    @Override
    public ResultMsg loginForQq(String id) {
        return processLogin(id, LoginForQqAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    /**
     * 记住登录状态后自动登录
     *
     * @param token token
     * @return 结果
     */
    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelephone(String telephone, String code) {
        return processLogin(telephone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username, passport);
        return super.login(username, passport);
    }

    /**
     * 登录适配器
     *
     * @param key       id
     * @param loginType 登录类型
     * @return 结果
     */
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> loginType) {
        try {
            //适配器不一定要实现接口
            LoginAdapter adapter = loginType.newInstance();
            //判断传过来的适配器是否能处理指定的逻辑
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //类图的快捷键  Ctrl + Alt + Shift + U
}
