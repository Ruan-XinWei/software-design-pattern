package Singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
单例模式，采用懒汉式单例
 */
public class AppConfig {
    private static String Config = null;
    private static AppConfig appConfig = null;
    private static final Object syncObject = new Object();

    public static String getConfig() {
        if (appConfig == null) {
            synchronized (syncObject) {
                if (appConfig == null) {
                    appConfig = new AppConfig();
                    setConfig();
                }
            }
        }
        return Config;
    }

    private static void setConfig() {
        /*
        使用调用时间来模拟，区分获取配置信息
         */
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Config = "配置信息 " + dateFormat.format(date);
    }
}
