package adapter.poweradapter;

/**
 * @author jill
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        Dc5 dc5 = new PowerAdapter(new Ac220());
        dc5.outputDc5V();
    }
}
