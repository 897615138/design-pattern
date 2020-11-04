package factory.abstractfactory;

/**
 * @author Jill Wang
 */
public class PythonCourseFactory implements ICourseFactory {

    @Override
    public INote createNote() {
        return new PythonNote();
    }


    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
