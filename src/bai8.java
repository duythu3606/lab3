import java.util.Scanner;

public class bai8
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int mark =0;
        System.out.println("Nhap so thu nhat :");
        float a = sc.nextFloat();
        System.out.println("Nhap so thu hai  :");
        float b = sc.nextFloat();
        double tong =a +b;
        double hieu =a -b;
        double tich =a *b;
        double thuong =a /b;
        System.out.println("    Menu    ");
        System.out.println("============");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println(":");
        System.out.println("============");
        System.out.println("Chon : ");
        char c = sc.next().charAt(0);

        switch (c)
        {
            case '+':mark =1;
                System.out.println("Tong "+tong);
            break;
            case '-':mark =1;
                System.out.println("Hieu "+hieu);
            break;
            case '*':mark =1;
                System.out.println("Tich "+tich);
            break;
            case ':':mark =1;
                System.out.println("Thuong "+thuong);
            break;
        }
        if ((a>'+')||(a<=':')&& mark !=1)
        {
            System.out.println("Nguoi dung chon sai phep toan");
        }
    }
}
