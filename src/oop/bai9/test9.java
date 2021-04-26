package oop;

public class test9 {
    public static void main(String[] args) {
        Congnhan cn1 = new Congnhan(1,"Thành","Phạm",100);
        Congnhan cn2 = new Congnhan(2,"Thái","Phạm",550);
        Congnhan cn3 = new Congnhan(3,"Thanh","Phạm",150);

        CNList cnList = new CNList();

        cnList.add(cn1);
        cnList.add(cn2);
        cnList.add(cn3);


//        cnList.SoCN();
       // cnList.CN200();
        cnList.giamdan();
        cnList.getall();
    }
}
