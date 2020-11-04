package factory.factorymethod;


import factory.ICourse;

/**
 * 工厂模型
 *
 * @author Jill Wang
 */
public interface ICourseFactory {

    /**
     * 创建
     *
     * @return 创建
     */
    ICourse create();

}
