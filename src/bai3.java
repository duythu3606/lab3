import java.util.Scanner;

public class bai3
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
        System.out.println("Nhap so d:");
        float d = sc.nextFloat();
        float Max =a;
        float Min =b;
        if (Max <b)
        {
            Max=b;
        }
        if (Max <c)
        {
            Max =c;
        }
        if (Max <d)
        {
            Max =d;
        }
        if (Min >a)
        {
            Min=a;
        }
        if (Min >c)
        {
            Min =c;
        }
        if (Min >d)
        {
            Min =d;
        }
        System.out.println("Max = "+Max);
        System.out.println("Min = "+Min);


    }
}
