package labrabota.pkg4;

/*
 * Эта прог-а сортирует массив из 40 элементов пузырьком по возрастанию.
    Автор Бредихин А.И.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task3 {
    
    public static void sort(int a[]) {
        int buf;
        for (int i=0; i<=39; i++) {
            for (int j=i+1; j<=39; j++) {
                if (a[i]>a[j]) {
                    buf=a[i];
                    a[i]=a[j];
                    a[j]=buf;
                }
            }
        }
        System.out.print("\n");
        for (int i=0; i<=39; i++) {
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        final int n=39;
        int aa[];
        aa=new int [40];
        int i;
        
        System.out.print("Массив до сортировки: ");
        for (i=0; i<=39; i++)  {
            aa[i]=(int)(Math.random()*100+1);
            System.out.print(aa[i]+" ");
        }
        System.out.print("\n");
        
        sort(aa);
        
    }
}
