package lab4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLearningCreateASimpleMenu {
    public static void main(String[] args) {
        System.out.printf("=====MENU======\n" +
                "1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number\n");
        System.out.printf("Chon 1 trong 4 option trong Menu đi");
        Scanner in = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(10);
        List list1 = new ArrayList<>();
        switch (in.nextInt()) {
            case 1:
                System.out.printf("bạn đã chọn option 1 nên sẽ in ra số phần tử trong list \n");

                for (int i = 0; i < rand_int1; i++) {
                    list1.add(rand.nextInt());

                }
                System.out.println("Danh sach Phan Tu trong list la: " + list1);
                break;
            case 2:
                System.out.println("bạn đã chọn option 2 nên sẽ in ra giá trị lớn nhất và nhỏ nhất trong list" + list1);
                for (int i = 0; i < rand_int1; i++) {
                    list1.add(rand.nextInt());

                }

                int minValue = (int) list1.get(0);
                int maxValue = (int) list1.get(0);
                for (int i = 0; i < list1.size(); i++) {
                    if (minValue > (int) list1.get(i)) {
                        minValue = (int) list1.get(i);

                    }
                }
                for (int i = 0; i < list1.size(); i++) {
                    if (maxValue < (int) list1.get(i)) {
                        maxValue = (int) list1.get(i);

                    }
                }
                System.out.printf("Gia Tri Lon Nhat la %d và Gia Tri Nho Nhat la %d \n", maxValue, minValue);
                System.out.println("Danh sach Phan Tu trong list la: " + list1);

                break;
            case 3:

                System.out.printf("Nhập số cần tìm: ");

                for (int i = 0; i < rand_int1; i++) {
                    list1.add(rand.nextInt());

                }
                int number=in.nextInt();
                int numberIsInList=0;
                for (int i = 0; i < list1.size(); i++) {
                    if((int)list1.get(i)==number)
                    {
                        System.out.printf("Nhập số cần tìm là số %d có ở vị trí %d \n",number,i);
                        numberIsInList=1;
                    }

                }
                if(numberIsInList==0)
                {
                    System.out.printf("Nhập số cần tìm ko có ở đây");
                }
                break;
            default:
                System.out.printf("Bạn chọn chưa đúng, nhập lại đi");
        }
    }
}
