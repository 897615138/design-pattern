package factory.factorymethod;


import factory.ICourse;
import factory.PythonCourse;

/**
 * @author Jill Wang
 */
public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
