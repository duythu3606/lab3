package oop;

public class bai3 {
    public int ma;
    public int mb;
    public int mc;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if (ma <0)
            this.ma =0;
        else
            this.ma = ma;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        if (mb<0)
            this.mb = 0;
        else
            this.mb = mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        if (mc<0)
            this.mc = 0;
        else
            this.mc = mc;
    }
    public bai3()
    {this(0,0,0);}
    public bai3(int a ,  int b, int c){
        setMa(a);
        setMb(b);
        setMc(c);
    }
    public float getchuvi(){
        return  (getMa() + getMb() + getMc())/2;
    }
    public double getdS(){
        return Math.sqrt(getchuvi()*(getchuvi()-getMa())*(getchuvi()-getMb())*(getchuvi()-getMc()));

    }
    public void hinhdang(){
        if (ma==mb || ma ==mc)
        {
            System.out.println("Tam giác cân.");
        }
        else if (ma==mb && ma==mc)
        {
            System.out.println("Tam giác đều");
        }
        else System.out.println("Tam giác thường");

    }
    public String toString(){
        return String.format("Cạnh A : %s,Cạnh B : %s,Cạnh C : %s,Chu vi : %s , Diên tích : %f",ma,mb,mc,getchuvi(),getdS());
    }
}
