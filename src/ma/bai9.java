import java.util.Scanner;

public class bai9
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int xA,yA,xB,yB,xC,yC;
        System.out.print("Nhap xA:");
        xA = sc.nextInt();
        System.out.print("Nhap yA:");
        yA = sc.nextInt();
        System.out.print("Nhap xB:");
        xB = sc.nextInt();
        System.out.print("Nhap yB:");
        yB = sc.nextInt();
        System.out.print("Nhap xB:");
        xC = sc.nextInt();
        System.out.print("Nhap yB:");
        yC = sc.nextInt();
        double AB = Math.sqrt((xB -xA)*(xB -xA)+(yB - yA)*(yB-yA));
        double AC = Math.sqrt((xC -xA)*(xC -xA)+(yC - yA)*(yC-yA));
        double BC = Math.sqrt((xC -xB)*(xC -xB)+(yC - yB)*(yC-yB));
        if (AB +BC >AC || BC + AC >AB ||AB + AC > BC)
        {
            System.out.println("A , B , C tạo thành tam giác");
        }
        else
        {
            System.out.println("A , B ,C không tạo thành tam giác");
        }
    }
}
