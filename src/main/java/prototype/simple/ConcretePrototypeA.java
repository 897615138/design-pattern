package prototype.simple;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author jill
 */

@SuppressWarnings("unused")
@Getter
@Setter
public class ConcretePrototypeA implements Prototype {

    private int age;
    private String name;
    private ArrayList<String> hobbies = new ArrayList<>();

    @Override
    public ConcretePrototypeA clone() {
        try {
            ConcretePrototypeA concretePrototypeA = (ConcretePrototypeA) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(age);
        concretePrototype.setName(name);
        concretePrototype.setHobbies(hobbies);
        return concretePrototype;
    }
}
