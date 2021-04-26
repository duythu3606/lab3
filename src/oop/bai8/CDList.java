package oop;

import java.util.ArrayList;
import java.util.List;

public class CDList {
    private int n =3;
    public CD cdList[];
    private static int count =0;


    public CDList() {cdList = new  CD[n];}

    public void add (CD cd )  {
        if (check_full()&&check_id(cd.getMaCD()))
        {
            cdList[count] = cd;
            count++;
        }
    }
    private boolean check_id(int id){
        for (int i=0;i<count;i++){
            if (cdList[i].getMaCD()==id) return  false;
        }
        return true;
    }
    private boolean check_full(){
        if( count>n) return  false;
        return true;
    }
//    private boolean check_have(){
//        for (int i = 0 ; i<count; i ++){
//            if (cdList[i].getTuaCD() == ""&&cdList[i].getGiathanh()==0&& cdList[i].getSobaihat()==0&&cdList[i].getMaCD()==0) return false;
//        }
//        return true;
//    }
    public void getall(){
        for (int i = 0 ; i< n;i++) {

            System.out.println(cdList[i]);
        }

    }
    public void sumCD(){
        int d= 0;
        for (int i = 0; i<cdList.length;i++){
            if (cdList[i]==null){
                d=d;}
            else d++;
        }
        System.out.println("Số CD có là : "+d);
    }
    public void sumGT(){
        float tong = 0 ;
        for (int i =0 ; i < cdList.length;i++){
           tong =tong + cdList[i].getGiathanh();
        }
        System.out.println("Giá thành tổng : " + tong);
    }
    public void lowGT(){
        CD temp =null;
        for (int i =0; i <cdList.length-1;i++){
            for (int j = i+1;j< cdList.length;j++){
                if (cdList[i].getGiathanh()<cdList[j].getGiathanh()){
                    temp = cdList[i];
                    cdList[i] = cdList[j];
                    cdList[j] = temp;
                }
            }
        }
    }
}
