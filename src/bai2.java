import java.util.Scanner;

public class bai2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x ,x1,x2,delta;
        System.out.println("Nhap so a:");
        int a = sc.nextInt();
        System.out.println("Nhap so b:");
        int b = sc.nextInt();
        System.out.println("Nhap so c:");
        int c = sc.nextInt();

        delta = b*b - 4 *a *c;
        if (delta > 0)
        {
            x1 = (-b + Math.sqrt(delta))/ (2*a);
            x2 = (-b - Math.sqrt(delta))/ (2*a);
            System.out.println("Phuong trinh co 2 nghiem:");
            System.out.println("x1 ="+x1);
            System.out.println("x1 ="+x2);
        }
        else if (delta == 0)
        {
            x = -b / (2*a);
            System.out.println("Phuong trinh co 1 nghiem : x =" + x);
        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        };
    }
}
