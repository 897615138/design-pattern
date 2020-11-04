package prototype.simple;

/**
 * @author jill
 */
public class ConcretePrototypeB implements Prototype {

    @SuppressWarnings("unused")
    @Override
    public Prototype clone() {
        try {
            Prototype prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
