package factory.abstractfactory;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 *
 * @author Jill Wang
 */
public interface ICourseFactory {

    /**
     * 做笔记
     * @return 笔记
     */
    INote createNote();

    /**
     * 录像
     * @return 录像
     */
    IVideo createVideo();

}
