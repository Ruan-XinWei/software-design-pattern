package Singleton;

public class Main {

    public static void main(String[] args) {
        String appConfig1 = AppConfig.getConfig();
        String appConfig2 = AppConfig.getConfig();
        System.out.println("第一个配置信息是：" + appConfig1);
        System.out.println("第二个配置信息是：" + appConfig2);
    }
}
