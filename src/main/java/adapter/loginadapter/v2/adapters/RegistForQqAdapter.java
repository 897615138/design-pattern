package adapter.loginadapter.v2.adapters;


import adapter.loginadapter.ResultMsg;

/**
 * @author jill
 */
public class RegistForQqAdapter implements RegistAdapter {
    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg regist(String id, Object adapter) {
        return new ResultMsg(200, "qq", null);
    }
}
