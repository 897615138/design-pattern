package factory.factorymethod;


import factory.ICourse;
import factory.JavaCourse;

/**
 * @author Jill Wang
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
