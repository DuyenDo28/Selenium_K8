package lab6;

public class Lab_6_4_CheckingURLContainsASpecificString {
    public static void main(String[] args) {
        String url = "https://google.com";
        int i=0;
        if (url.contains(".com")) {
            System.out.printf("url contains .com\n");
        }
        else{
            System.out.printf("url contains .net\n");
        }
        if(url.substring(0,5).equals("https")){
            System.out.printf("url contains https\n");

        }
        else {
            System.out.printf("url contains http");
        }




    }
}
