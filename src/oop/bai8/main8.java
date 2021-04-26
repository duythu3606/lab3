package oop;

import java.util.ArrayList;
import java.util.List;

public class main8 {
    public static void main(String[] args) {

        CD cd1 = new CD(1,"anh",3,50000);
        CD cd2 = new CD(2,"em",5,55000);
//        CD cd2 = new CD(0,"",0,0);
        CD cd3 = new CD(3,"ga",4,60000);
//        CD cd3 = new CD(0,"",0,0);
//        CD cd4 = new CD(1,"qua",2,70000);

       CDList cdList = new CDList();
       cdList.add(cd1);
       cdList.add(cd2);
       cdList.add(cd3);
//       cdList.add(cd4);

       cdList.getall();
       cdList.sumCD();
       cdList.sumGT();


    }


}
