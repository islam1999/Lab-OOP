import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        int l=0;
        int[]b=new int[10];
        //System.out.println("Введите число");
        for (int a=0; a<b.length; a++)
        {
            b[a]=(int)Math.round((Math.random()*15));
        }
        for (int a=0; a<b.length; a++){
            System.out.print("-"+b[a]);
            }
        double sum=0;
        for(int i=0; i<b.length; i++)
        {
            sum +=b[i];
        }
        System.out.println("Сумма массивы:" + sum);


        /*if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.println(a * 2);
         else
        {
            System.out.println("Вы ввели не целое число");
        }*/
    }
    }


