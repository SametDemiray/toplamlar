package org.example;

import java.util.Scanner;

/* Klavyeden girilen n sayısına göre; 1'den n'e kadar tamsayıların toplamını (t1),1'den n'e kadar tek sayırların toplamını (t2) ve
   2'den n'e kadar çift sayıların toplamını (t3) hesaplayan program.

    Pozitif Tamsayı Giriniz : 50
    1'den 50'e kadar tamsayıların toplamı: 1275
    1'den 50'e kadar tek sayıların toplamı: 625
    2'den 50'e kadar çift sayıların toplamı: 650
*/

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Pozitif Tamsayı Giriniz : ");
                int n = scanner.nextInt();

                int t1 = 0; // Tamsayıların toplamı
                int t2 = 0; // Tek sayıların toplamı
                int t3 = 0; // Çift sayıların toplamı

                for (int i = 1; i <= n; i++) {
                    t1 += i;
                    if (i % 2 == 1) {
                        t2 += i;
                    } else {
                        t3 += i;
                    }
                }

                System.out.println("1'den " + n + "'e kadar tamsayıların toplamı: " + t1);
                System.out.println("1'den " + n + "'e kadar tek sayıların toplamı: " + t2);
                System.out.println("2'den " + n + "'e kadar çift sayıların toplamı: " + t3);

    }
}