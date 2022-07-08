package lesson_13_ExceptionHandle;

public class Calculator {

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().divide(4, 2));
        try {
            System.out.println(new Calculator().divide(4, 0));
        }catch(ArithmeticException e){
            throw new IllegalArgumentException("ERR Second number cannot be Zero");
        }
        catch (Exception e) {
            // có thể dùng exceptio printStacktTrace
            e.printStackTrace();
           // System.out.println("Second number cannot be Zero");

            // hoặc có thể dùng IllegalArgumentException
            //throw new IllegalArgumentException("ERR Second number cannot be Zero");
        }
        System.out.println("see you again");
    }

    // phỏng vấn hỏi về: bạn biết gì về exception handle
    //trong java ngầm định class là object
    // Exception bao gồm các loai sau
    //1. Error: những lỗi liên quan phần cứng, virtual machine error..
    //2. Exception gồm check exception và uncheck exception
    // uncheck exception: là những lỗi dc check ở thời điểm run time (null pointter exception, IllegalArgumentException, indexoutOffbound hoặc lỗi về toán học..là những lỗi ví dụ trong code)
    // Check exception xảy ra tại thời điểm compile time gồm: input, output exception, interrupted exception, lỗi khi dùng DB connection (a Tụ có ví dụ input/output exception trong video từ phút  thử 1:10
    // overloading xảy ra tai thời điểm compile time, overriding xảy ra tài thời điểm run time vì tại thời điểm run time mới bit dc mqh is a relationship chứ
}
