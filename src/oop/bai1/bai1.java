package oop;

public class bai1 {
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public bai1(int x, int y){
        setX(x);
        setY(y);
    }
    public bai1() {
        this(0,0);
    }
    public String toString(){
        return String.format("Tọa độ X : %s,Tọa độ Y : %s",x,y);

    }
}
