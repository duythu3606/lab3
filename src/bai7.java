import java.util.Scanner;

public class bai7
{
    public static void main(String[] args)
    {
        System.out.println("    Menu    ");
        System.out.println("============");
        System.out.println("1. CP");
        System.out.println("2. C");
        System.out.println("3. HDJ");
        System.out.println("4. DreamWeaver");
        System.out.println("5. RBDMS");
        System.out.println("6. Learn Java By Example");
        System.out.println("=============");
        System.out.println("Chon : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int mark =0;
        switch (a)
        {
            case 1: mark =1;
                System.out.println("Ban chon CP");
            break;
            case 2: mark =1;
                System.out.println("Ban chon C");
                break;
            case 3: mark =1;
                System.out.println("Ban chon HDJ");
                break;
            case 4: mark =1;
                System.out.println("Ban chon DreamWeaver");
                break;
            case 5: mark =1;
                System.out.println("Ban chon RBDMS");
                break;
            case 6: mark =1;
                System.out.println("Ban chon Learn Java By Example");
                break;

        }
        if ((a>0)||(a<=6)&& mark !=1)
        {
            System.out.println("Nguoi dung chon sai");
        }

    }
}
