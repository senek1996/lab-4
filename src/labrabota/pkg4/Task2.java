package labrabota.pkg4;

/*
 * Эта прог-а заполняет 5 массивов по 10 эл-ов сгенерированными числами от а до б стат. 
    методом из прошлой задачи. .
    Автор Бредихин А.И.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task2 {
    
    public static int gen(int a, int b) {
        int aa=(int)(Math.random()*(b-a))+1;
        aa=aa+a;
        return aa;
    }
    
    public static void zap(int[] aa,int a,int b) {
        for (int i=0; i<=9; i++) {
            aa[i]=gen(a,b);
            System.out.print(aa[i]+" ");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args) {
        int aa[];
        int bb[];
        int cc[];
        int dd[];
        int ee[];
        aa=new int[10];
        bb=new int[10];
        cc=new int[10];
        dd=new int[10];
        ee=new int[10];
        
        
        int i,a,b;
        
        String abcd="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMйцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ_{}[];:'/";
        
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s1 = null;

        System.out.print("Введите a: ");
        
        try {
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания.");
        }


        String s2 = null;

        System.out.print("\nВведите b: \n");

        try {
            s2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания.");
        }
        
        for (int j=0; j<abcd.length(); j++) {
                if ((s1.contains(""+abcd.charAt(j))) || (s2.contains(""+abcd.charAt(j)))) {
                System.out.print("Неправильные числа");
                return;
            }
        }
        
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        
        if (a>b) {System.out.print("Число a не должно быть больше b!"); return;}
        
        zap(aa,a,b);
        zap(bb,a,b);
        zap(cc,a,b);
        zap(dd,a,b);
        zap(ee,a,b);
        
    }
}
