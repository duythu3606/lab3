package IO.demo;

import java.io.*;
import java.net.PortUnreachableException;
import java.util.*;

public class EmpList extends Vector<Employee> {
    Scanner sc = new Scanner(System.in);

    public EmpList() {
        super();
    }

    public void addFromFile(String fName) throws IOException {
        try {
            File f = new File(fName);
            if (!f.exists()) return;
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            while ((details = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(details, ",");
                String code = stk.nextToken().toUpperCase();
                String name = stk.nextToken().toUpperCase();
                int salary = Integer.parseInt(stk.nextToken());
                Employee emp = new Employee(code, name, salary);
                this.add(emp);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        try{
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Employee x :this) {
            pw.println();
            }
            pw.close();fw.close();
            }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public int find(String aCode){
        for (int i = 0 ; i<this.size();i++)
            if (this.getCode().equals(aCode)) return i;
            return -1;
    }
    public void addNewEmp(){
        String newCode , newName;
        int salary;
        int pos;
        boolean valid =true;
        System.out.println("Enter New Empployee Details : ");
        do {
            System.out.println(" code E000");
             newCode = sc.nextLine().toUpperCase();
             pos = find(newCode);
             valid = newCode.matches("^E\\d(3)$");
             if (pos>=0) System.out.println(" The code is duplicate");
             if (!valid) System.out.println(" The code : E and 3 digits.");
        }
        while (pos>=0 ||(!valid));
        System.out.println("  name :");
        newName = sc.nextLine().toUpperCase();
        System.out.println("  salary: ");
        salary = Integer.parseInt(sc.nextLine());
        this.add(new Employee(newCode,newName,salary));
        System.out.println("New Employee has been added.");
    }
    public void removeEmp(){
        String code;
        System.out.println("Enter the code of removed employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos<0) System.out.println("This code dose not exist.");
        else
        {
            this.remove(pos);
            System.out.println("The employee "+code+" has been removed.");
        }
    }
    public void promote(){
        String code;
        System.out.println("Enter the code of removed employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos<0) System.out.println("This code dose not exist.");
        else
        {
            int oldSalary = this.get(pos).getSalary();
            int newSalary;
            do {
                System.out.println("Old salary : "+oldSalary+"newSalary : ");
                newSalary = Integer.parseInt(sc.nextLine());
            }
            while (newSalary<oldSalary);
            this.get(pos).setSalary(newSalary);
            System.out.println("The employee" + code + " has been updated.");
        }
    }
    public void print(){
        if (this.size()==0){
            System.out.println("Empty List.");
            return;
        }
        Collections.sort(this);
        System.out.println("\nEMPLOYEE LIST");
        System.out.println("---------------------");
        for (Employee x : this) x.print();
    }
}
