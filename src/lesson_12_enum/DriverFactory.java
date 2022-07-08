package lesson_12_enum;

public class DriverFactory {

    public static void initWebDriver (BrowserType browserType){
        switch (browserType){
            case CHROME:
                System.out.println("Init chrome driver");
                break;
            case FIREFOX:
                System.out.println("Init firefox driver");
                break;
            case SAFARI:
                System.out.println("Init safari driver");
                break;
        }
    }
}
