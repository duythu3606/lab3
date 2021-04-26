package oop;

public class Hinhtron {
    private  Toado tam;
    private double bankinh;

    public Hinhtron(Toado tam, double bankinh) {
        this.tam = tam;
        this.bankinh = bankinh;
    }

    public Toado getTam() {
        return tam;
    }

    public void setTam(Toado tam) {
        this.tam = tam;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double tinhChuvi(){
        return bankinh*2*3.14;
    }
    public double tinhDientich(){
        return bankinh*bankinh*3.14;
    }

    @Override
    public String toString() {
        return "Hình tròn có " + "tâm " + tam +
                ", bán kính =" + bankinh +", Chu vi="+tinhChuvi()+", Dien tich="+tinhDientich()
                ;
    }
}
