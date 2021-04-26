package oop;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class bai5 {
    private  int mahang;
    private String tenhang;
    private  int dongia;
    private LocalDate ngaysanxuat;
    private LocalDate ngayhethan;

    public int getMahang() {
        return mahang;
    }

    public void setMahang(int mahang) {
            this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        if (tenhang ==null)
            this.tenhang ="XXX";
        else
            this.tenhang = tenhang;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        if (dongia <0)
            this.dongia = 0;
        else
            this.dongia = dongia;
    }

    public LocalDate getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(LocalDate ngaysanxuat) {
        if (!ngaysanxuat.isBefore(LocalDate.now()))
        {
            this.ngaysanxuat = LocalDate.now();
        }
        else {
            this.ngaysanxuat = ngaysanxuat;
        }
    }

    public LocalDate getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(LocalDate ngayhethan) {
        if (!ngayhethan.isAfter(this.ngayhethan))
        {
            this.ngayhethan = this.ngaysanxuat;
        }
        else {
            this.ngayhethan = ngayhethan;
        }
    }
    public boolean hethan(){
        return LocalDate.now().isAfter(getNgayhethan());
    }

    public bai5(int mahang, String tenhang, int dongia, LocalDate ngaysanxuat, LocalDate ngayhethan) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethan = ngayhethan;
    }

    public bai5()
    {
        this(0,"",0,LocalDate.now(),LocalDate.now());
    }

    public String toString(){
        String mp;
        DecimalFormat  df = new DecimalFormat("#,##0.00");
        String gia = df.format(getDongia())+"VNĐ";
        if(hethan()){
            mp = "Hết hạn.";
        }
        else {
            mp = "";
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String exd = dtf.format(getNgayhethan());
        String mfd = dtf.format(getNgaysanxuat());
        return  String.format("%3d %-30s %25s %20s %20s %16s",getMahang(),getTenhang(),getDongia(),mfd,exd,gia);

    }
}