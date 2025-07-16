package Algorithm.CN;

import java.util.Scanner;

public class CRC {
    void div(int[] a, int k) {
        int[] gp = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
        System.out.println("----divisor---");
        for (int i = 0; i < gp.length; i++)
            System.out.print(gp[i]);

        System.out.println();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (a[i] == 1) {
                for (int j = i; j < gp.length + i; j++) {
                    a[j] = a[j] ^ gp[count++];
                }
                count = 0;
            }

        }
    }

    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[100];
        int len, k;
        int flag = 0;
        System.out.println("The transimiiter side\n ----------------------\n");
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);
        CRC ob = new CRC();
        len = sc.nextInt();
        k = len;
        System.out.println("Enter the message:");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 16; i++) {
            a[len++] = 0;
        }
        for (int i = 0; i < len; i++) {
            b[i] = a[i];
        }
        ob.div(a, k);
        System.out.print("CRC Is");
        for (int i = k; i < len; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            a[i] = a[i] ^ b[i];
        }
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Reviere side\n ------------------\n");
        System.out.println("reveoer side message");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println();
        ob.div(a, k);
        System.out.print("CRC at reciver side");
        for (int i = k; i < len; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            if (a[i] != 0) {
                flag = 1;
                break;
            }

        }
        System.out.println("--------------");
        if (flag == 1) {
            System.out.println("error detceted");
        } else {
            System.out.println("successfully");
        }
    }
}