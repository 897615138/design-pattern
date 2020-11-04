package factory.abstractfactory;

/**
 * @author Jill Wang
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
