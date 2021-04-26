
import java.util.Scanner;

public class bai5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("So km :");
        int money = 15000;
        float money1, money2;
        double money3;
        float km = sc.nextFloat();
        money1 = money + (13500*km);
        money2 = 82500 + (11000 *(km-5));
        money3 = (money2 - (money2*0.1) );

        if (km<1)
        {
            System.out.println("So tien tam tinh 1km ="+ money);
        }
        else if(km <=5)
        {
            System.out.println("So tien tam tinh duoi 5km ="+ money1);
        }
        else if (5< km&&km <120)
        {
            System.out.println("So tien tam tinh tren 5km=" + money2);
        }
        else if (km >120)
        {
            System.out.println("So tien tam tinh tren 120km=" + money3);
        }
    }
}
