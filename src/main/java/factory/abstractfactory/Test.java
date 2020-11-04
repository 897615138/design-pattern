package factory.abstractfactory;

/**
 * @author Jill Wang
 */
public class Test {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote().edit();
        factory.createVideo().record();

    }

}
