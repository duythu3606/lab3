package oop;

public class CNList {
    private int n=3;
    private Congnhan cnlist[];
    private int count =0;

    public CNList(){cnlist = new Congnhan[n];}

    public void add(Congnhan cn){
        if (check_full())
        {
            cnlist[count] = cn;
            count++;
        }
    }

    private boolean check_full(){
        if( count>n) return  false;
        return true;
    }
    public void getall(){
        for (int i = 0 ; i< n;i++) {
            System.out.println(cnlist[i]);
        }
    }
    public void SoCN(){
        int dem =0;
        for (int i =0 ; i< cnlist.length;i++)
        {
            if (cnlist[i]==null) {
                dem=dem;
            }
            else dem++;
        }
        System.out.println("Số công nhân là : " + count);
    }
    public void CN200(){
        for (int i =0 ; i<cnlist.length ; i++){
            if (cnlist[i].getmSP() > 200){
                System.out.println(cnlist[i]);
            }
        }
    }
    public void giamdan(){
        Congnhan temp =null;
        for (int i =0; i < cnlist.length-1;i++){
            for (int j =i+1;j < cnlist.length;j++){
                if (cnlist[i].getmSP() < cnlist[j].getmSP())
                {
                    temp = cnlist[i];
                    cnlist[i] = cnlist[j];
                    cnlist[j] = temp;
                }
            }
        }
    }
}
