package lab3;

import java.util.Scanner;

public class FindingMaxOrMinFromAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang ");
        int n = in.nextInt();
        // NhapMangMotChieu(n);
        // System.out.printf("Phan tu lon nhat trong mang la %d", TimPhanTuLonNhatTrongMang(n));
        //System.out.printf("Phan tu nho nhat trong mang la %d", TimPhanTuNhoNhatTrongMang(n));
        SapXepMangFromMinToMax(n);
    }

    public static void NhapMangMotChieu(int n) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]=", i);
            arr[i] = in.nextInt();
        }

    }

    public static int TimPhanTuLonNhatTrongMang(int n) {
        int PhanTuLonNhat = 0;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang \n");
        for (int i = 0; i < n; i++) {

            arr[i] = in.nextInt();
        }
        for (int i : arr) {
            if (i > PhanTuLonNhat) {
                PhanTuLonNhat = i;
            }
        }
        return PhanTuLonNhat;

    }

    public static int TimPhanTuNhoNhatTrongMang(int n) {
        int PhanTuNhoNhat = 0;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang \n");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }

        int i = 0;
        PhanTuNhoNhat = arr[0];
        do {

            if (arr[i] < PhanTuNhoNhat) {
                PhanTuNhoNhat = arr[i];
            }
            i++;
        }
        while (i < n);
        return PhanTuNhoNhat;
    }
    public static void SapXepMangFromMinToMax(int n)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];

        System.out.print("Nhap cac phan tu cua mang \n");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }

        for (int i = 0; i <arr.length ; i++) {
            int arrMinTemp;
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]>arr[j])
                {
                    arrMinTemp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=arrMinTemp;
                }

            }
            System.out.printf("%d \t",arr[i]);
    }

    }

}
