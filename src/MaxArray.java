
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] Array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Độ dài mảng không được vượt quá 20");
        } while (size > 20);
        Array = new int[size];
        int i = 0;
        while (i < Array.length) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            Array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng đã nhập là: ");
        for (int j = 0; j < Array.length; j++) {
            System.out.println(Array[j] + "\t");
        }
        int max = Array[0];
        int index = 1;
        for (int j = 0; j < Array.length; j++) {
            if (Array[j] > max) {
                max = Array[j];
                index = j + 1;
            }
        }
        System.out.println("Phẩn tử có giá trị lớn nhất trong mảng là : " + max + " ở vị trí " +index);
    }
}
