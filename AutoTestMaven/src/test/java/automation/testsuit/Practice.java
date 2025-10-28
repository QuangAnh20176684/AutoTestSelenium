package automation.testsuit;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Practice {


        @Test
        public static void tingTongMang() {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Nhập độ dài mảng: ");
//            int n = sc.nextInt();

            int[] arr={1,2,3};
            int sum = 0;

            for (int i = 0; i < 3; i++) {
//                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            System.out.println("Tổng các phần tử trong mảng là: " + sum);

//            sc.close();
            Assert.assertEquals(sum, 6);
        }
    @Test
    public static void ting() {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Nhập độ dài mảng: ");
//            int n = sc.nextInt();

        int[] arr={1,2,3};
        int sum = 0;

        for (int i = 0; i < 3; i++) {
//                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//                arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Tổng các phần tử trong mảng là: " + sum);

//            sc.close();
        Assert.assertEquals(sum, 100);
    }
    }

