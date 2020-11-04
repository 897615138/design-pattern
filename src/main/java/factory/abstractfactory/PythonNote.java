package factory.abstractfactory;

/**
 * Python笔记
 *
 * @author Jill Wang
 */
public class PythonNote implements INote {

    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
