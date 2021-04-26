package oop;

import java.util.ArrayList;
import java.util.List;

public class CD {
    private int maCD;
    private String tuaCD;
    private int sobaihat;
    private float giathanh;


    public CD(int maCD, String tuaCD, int sobaihat, float giathanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.sobaihat = sobaihat;
        this.giathanh = giathanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD <0){
            this.maCD = 999999;
        }
        else {

        this.maCD = maCD;}
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD == "")
        {
            this.tuaCD = "Chưa xác định!";
        }
        else {
        this.tuaCD = tuaCD;}
    }

    public int getSobaihat() {
        return sobaihat;
    }

    public void setSobaihat(int sobaihat) {
        if (sobaihat>0)
        {
        this.sobaihat = sobaihat;}
        else {this.sobaihat =0 ;}
    }

    public float getGiathanh() {
        return giathanh;
    }

    public void setGiathanh(float giathanh) {
        if (giathanh >0){
        this.giathanh = giathanh;}
        else {
            this.giathanh = 0;
        }
    }

    @Override
    public String toString() {
        return "bai8{" +
                "maCD=" + maCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", sobaihat=" + sobaihat +
                ", giathanh=" + giathanh +
                '}';
    }
}
