package lab3;

public class Lab3_CountOddAndEvenNumber {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 2, 2, 2};
        int OddNumber=0;
        int EvenNumber=0;
        for (int i : intArr ) {
            if(i%2==0)
            {
                EvenNumber=EvenNumber+1;
            }
            else
            {
                OddNumber=OddNumber+1;
            }
        }
        System.out.printf("Số lượng chữ số lẻ là %d và số lượng chữ số chẳn là %d",OddNumber,EvenNumber);

    }


}
