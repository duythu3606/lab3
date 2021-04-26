package oop;

public class Congnhan {
    private int maCN;
    private String ten;
    private String Ho;
    private int mSP;

    public Congnhan(int maCN, String ten, String ho, int mSP) {
        this.maCN = maCN;
        this.ten = ten;
        this.Ho = ho;
        this.mSP = mSP;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        if (maCN>0)
        this.maCN = maCN;
        else
            this.maCN =0;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten !="")
        this.ten = ten;
        else this.ten ="";
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String ho) {
        if (ho!="")
        this.Ho = ho;
        else this.Ho ="";
    }

    public int getmSP() {
        return mSP;
    }

    public void setmSP(int mSP) {
        if (mSP>0)
        this.mSP = mSP;
        else this.mSP =0;

    }
    public double tinhLuong(){

        if (mSP>=1 && mSP<=199){
          return     mSP*0.5;
        }
        else if(mSP>=200 && mSP<=399){
         return     mSP*0.55;
        }
        else if (mSP>=400 && mSP<=599){
            return     mSP*0.6;
        }
        else if (mSP>=600){
            return     mSP*0.65;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Congnhan{" +
                "maCN=" + maCN +
                ", ten='" + ten + '\'' +
                ", Ho='" + Ho + '\'' +
                ", mSP=" + mSP +
                '}';
    }
}
