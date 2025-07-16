package Algorithm.CN;

import java.util.Scanner;

public class CRC2 {

    void div(int a[], int k) {
        int gp[] = { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 };
        System.out.print("The divisor is ");
        for (int i = 0; i < 17; i++)
            System.out.print(gp[i]);
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (a[i] == 1) {
                for (int j = 1; j < 17; j++) {
                    a[j + i] = a[j + i] ^ gp[count++];
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
        CRC2 ob = new CRC2();
        Scanner sc = new Scanner(System.in);

        // Transmitter side
        System.out.println("Transmitter side");
        System.out.println("--------------------------------------");
        System.out.println("Enter the length of data Frame:");
        len = sc.nextInt();
        k = len;

        System.out.println("Enter the Message:");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }

        // Append zeros for CRC
        for (int i = len; i < len + 16; i++) {
            a[i] = 0;
        }

        // Copy original data to b
        for (int i = 0; i < len; i++) {
            b[i] = a[i];
        }

        // Perform CRC division
        ob.div(a, k);

        System.out.print("\nThe CRC at the sender:");
        for (int i = k; i < len + 16; i++) {
            System.out.print(a[i]);
        }

        // XOR with original data to get transmitted data
        for (int i = 0; i < len; i++) {
            a[i] = a[i] ^ b[i];
        }

        System.out.print("\nData to be transmitted:");
        for (int i = 0; i < len + 16; i++) {
            System.out.print(a[i]);
        }

        // Receiver side simulation
        System.out.println("\n\nReceiver Side");
        System.out.println("--------------------------------------");
        System.out.println("Enter the received data:");

        // Input received data
        for (int i = 0; i < len + 16; i++) {
            a[i] = sc.nextInt();
        }

        // Perform CRC division at receiver
        ob.div(a, k);

        // Print CRC at receiver
        System.out.print("\nThe CRC at the receiver:");
        for (int i = k; i < len + 16; i++) {
            System.out.print(a[i]);
        }

        // Check for errors
        for (int i = k; i < len + 16; i++) {
            if (a[i] != 0) {
                flag = 1;
                break;
            }
        }

        // Display result of CRC error detection
        System.out.println("\n\nResult of CRC error detection:");
        if (flag == 1) {
            System.out.println("Error in the data, resend the data again.");
        } else {
            System.out.println("Data is received successfully.");
        }
    }
}
