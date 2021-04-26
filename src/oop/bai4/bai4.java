package oop;

public class bai4 {
    private String tenchuxe;
    private String loaixe;
    private int dungtich;
    private float trigia;

    public String getTenchuxe() {
        return tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dt) {
        if (dt>=0)
        this.dungtich = dt;
        else
            this.dungtich = 0;
    }

    public float getTrigia() {
        return trigia;
    }

    public void setTrigia(float trigia) {
        if (trigia >=0)
        this.trigia = trigia;
        else this.trigia = 0;
    }
    public bai4(String chu,String xe,int dt, float gia)
    {
        setTenchuxe(chu);
        setLoaixe(xe);
        setDungtich(dt);
        setTrigia(gia);
    }
    public bai4 (){
        this("","",0,0f);
    }
    public double thue(){
        if (dungtich <=100)
            return (trigia*0.1);
        else if(100 < dungtich&&dungtich<200)
            return (trigia*(0.3));
        else if (dungtich>200)
            return (trigia*(0.5));
        return 0;
    }


    public String toString(){
        String st = String.format("%s %20s %10d %20f %10f",getTenchuxe(),getLoaixe(),getDungtich(),getTrigia(),thue());
        return st;
    }
}
