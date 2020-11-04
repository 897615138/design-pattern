package adapter.loginadapter.v2.adapters;


import adapter.loginadapter.ResultMsg;

/**
 * @author jill
 */
@SuppressWarnings("ALL")
public interface RegistAdapter {
    /**
     * 适配器是否支持
     *
     * @param adapter 适配器
     * @return 结果
     */
    boolean support(Object adapter);

    /**
     * 注册
     *
     * @param id      用户名
     * @param adapter 适配器
     * @return 结果
     */
    ResultMsg regist(String id, Object adapter);
}
