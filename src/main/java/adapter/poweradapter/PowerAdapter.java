package adapter.poweradapter;

/**
 * @author jill
 */
public class PowerAdapter implements Dc5 {

    private final Ac220 ac220;

    PowerAdapter(Ac220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDc5V() {
        int adapterInput = ac220.outputAc220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V,输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
