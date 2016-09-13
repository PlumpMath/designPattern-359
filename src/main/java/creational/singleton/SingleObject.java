package creational.singleton;

public class SingleObject {

    // 创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();
    private static int cnt = 1;

    // 让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    // 获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        if (cnt > 1) {
            System.out.println("***************");
            System.out.println("SingleObject!" + "icnt:" + cnt);
            System.out.println("***************");
        }
    }

}
