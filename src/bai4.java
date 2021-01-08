import java.util.Scanner;

public class bai4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a:");
        float a = sc.nextFloat();
        System.out.println("Nhap so b:");
        float b = sc.nextFloat();
        System.out.println("Nhap so c:");
        float c = sc.nextFloat();
        if (    (a+b)<c ||  (a+c)<b ||  (c+b)<a )
        {
            System.out.println("a,b,c khong phai la 3 canh cua tam giac");

        }
        else
        {
            double cv =a +b +c;
            double dt= Math.sqrt(cv *(cv -a)*(cv-b)*(cv-c));
            System.out.println("a,b,c la 3 canh cua tam giac");
            System.out.println("cv = "+cv);
            System.out.println("dt = "+dt);
        }

    }
}
