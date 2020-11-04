package adapter.loginadapter.v2.adapters;


import adapter.loginadapter.ResultMsg;

/**
 * @author jill
 */
@SuppressWarnings("ALL")
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(200, "Sina", null);
    }
}
