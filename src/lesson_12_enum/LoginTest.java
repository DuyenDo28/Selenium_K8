package lesson_12_enum;

public class LoginTest {

    public static void main(String[] args) {
        DriverFactory.initWebDriver(BrowserType.CHROME);
        DriverFactory.initWebDriver(BrowserType.FIREFOX);
        DriverFactory.initWebDriver(BrowserType.SAFARI);
    }
}
