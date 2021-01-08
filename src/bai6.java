import java.util.Scanner;

public class bai6
{
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Mời bạn nhập một ký tự: ");
        char a = nhap.next().charAt(0);
        int mark = 0;
        switch (a) {
            case 'a':
                mark = 1;
                break;
            case 'e':
                mark = 1;
                break;
            case 'o':
                mark = 1;
                break;
            case 'u':
                mark = 1;
                break;
            case 'i':
                mark = 1;
                break;
            case 'A':
                mark = 1;
                break;
            case 'E':
                mark = 1;
                break;
            case 'O':
                mark = 1;
                break;
            case 'U':
                mark = 1;
                break;
            case 'I':
                mark = 1;
                break;
        }
        if (((a > 'a' && a <= 'z') || (a > 'A' && a <= 'Z')) && mark != 1) {
            mark = 2;
        }
        switch (mark) {
            case 1:
                System.out.println("Ký tự vừa nhập là nguyên âm");
                break;
            case 2:
                System.out.println("Ký tự vừa nhập là phụ âm");
                break;
            case 0:
                System.out.println("Ký tự vừa nhập không thuộc bảng chữ cái");
                break;
        }
    }
}
