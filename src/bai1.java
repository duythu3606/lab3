import java.util.Scanner;

public class bai1
    {
    public static void main(String[] args)
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = sc.nextInt();
        System.out.println("Nhap so b:");
        int b = sc.nextInt();
        if (b >0)
        {
            int c;
            c = a / b;
            System.out.println("Ket qua c = "+ c);
        }
        else {
            System.out.println("Error : divide by zero");
        };
        return;

    }
    }

