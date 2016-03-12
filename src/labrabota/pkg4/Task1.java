/*
 * Эта прог-а генерирует числа от а до б стат. методом и заполняет ими массив из 20 эл-ов.
 Автор Бредихин А.И.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task1 {

    public static int gen(int a, int b) {
        int aa = (int) (Math.random() * (b - a)) + 1;
        aa = aa + a;
        return aa;
    }

    public static void main(String[] args) {
        int aa[];
        aa = new int[20];
        int i, a = 0, b = 0;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s1 = null;

        System.out.print("Введите a: ");

        try {
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            a = Integer.parseInt(s1);
        } catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }

        String s2 = null;

        System.out.print("\nВведите b: \n");

        try {
            s2 = bufferedReader.readLine(); //читаем строку с клавиатуры
            b = Integer.parseInt(s2);
        } catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }

        if (a > b) {
            System.out.print("Число a не должно быть больше b!");
            return;
        }

        for (i = 0; i < 20; i++) {
            aa[i] = gen(a, b);
            System.out.print(aa[i] + " ");
        }

    }
}
