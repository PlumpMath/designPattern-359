package creational.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        Runnable r = SingletonPatternDemo::showMessage;
        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }

    }

    static void showMessage() {
        // 不合法的构造函数
        // 编译时错误：构造函数 SingleObject() 是不可见的
        // SingleObject object = new SingleObject();

        // 获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        // 显示消息
        object.showMessage();

        Singleton1 object1 = Singleton1.getInstance();
        object1.showMessage();

        Singleton2 object2 = Singleton2.getInstance();
        object2.showMessage();

        Singleton3 object3 = Singleton3.getInstance();
        object3.showMessage();

        Singleton4 object4 = Singleton4.getInstance();
        object4.showMessage();

        Singleton5 object5 = Singleton5.getInstance();
        object5.showMessage();

        Singleton6 object6 = Singleton6.INSTANCE;
        object6.showMessage();
    }

}
