package oop;

public class bai2 {
    private int maSV;
    private String hovaten;
    private float DiemLT;
    private float DiemTH;


    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        if (maSV<0)
            this.maSV =0;
        else
            this.maSV = maSV;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public float getDiemLT() {

        return DiemLT;
    }

    public void setDiemLT(float diemLT) {
        if (diemLT>=0&& diemLT<=10)
            this.DiemLT = diemLT;
        else
            this.DiemLT= 0;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(float diemTH) {
        if (diemTH>=0 && diemTH<=10)
            this.DiemTH = diemTH;
        else
            this.DiemTH=0;
    }
    public float getDiemTB() {
        return (DiemLT + DiemTH)/2;
    }

    public bai2(int maSV, String hoTen, float diemLT, float diemTH) {
        setMaSV(maSV);
        setHovaten(hoTen);
        setDiemLT(diemLT);
        setDiemLT(diemTH);
    }
    public bai2() {
        this(0,"",0.0f,0.0f);
    }

    public String toString(){
        return String.format("%s5 %-30s %10.2f %10.2f %10.2f",maSV,hovaten,DiemLT,DiemTH,getDiemTB());
    }
}
