package oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class mainbai5 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1 = "31/01/2022";
        String date2 = "31/12/2019";

        bai5 sanpham1 = new bai5(001,"US Apple", 93000, LocalDate.parse(date2, dtf), LocalDate.parse(date1, dtf));
        bai5 sanpham2= new bai5(002,"Pine Apple", 58000, LocalDate.parse("23/01/2020", dtf), LocalDate.parse("31/12/2021", dtf));
        bai5 sanpham3 = new bai5(003,"Ong Tho Condensed Milk", 15000, LocalDate.parse("15/01/2019", dtf), LocalDate.parse("31/12/2020", dtf));
        bai5 sanpham4 = new bai5();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-30s %25s %20s %20s %16s%n", "MSP", "Tên Sản Phẩm", "Giá", "Ngày sản xuất", "Hạn sử dụng", "Thành giá");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println(sanpham1.toString());
        System.out.println(sanpham2.toString());
        System.out.println(sanpham3.toString());
        System.out.println(sanpham4.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
    }
}
