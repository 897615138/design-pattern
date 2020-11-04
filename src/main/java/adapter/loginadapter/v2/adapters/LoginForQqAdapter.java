package adapter.loginadapter.v2.adapters;


import adapter.loginadapter.ResultMsg;

/**
 * @author jill
 */
public class LoginForQqAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQqAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(200, "QQ", null);
    }
}
