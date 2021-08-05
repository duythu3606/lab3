package IO.demo;

import IO.employee.Menu;

import java.util.Scanner;

public class MangaerProgram {
    public static void main(String[] args) {
        String filename = "employee.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("Add new Employee");
        menu.add("Remove an employee");
        menu.add("Promoting the employee's salary");
        menu.add("Print the list");
        menu.add("Save to files");
        menu.add("Quit");
        int userChoice;
        boolean changed = false;
        list.AddFromFile(filename);
        do {
            System.out.println("\nEMPLOYEE MANAGER");
            userChoice =menu.getUserChoice();
            switch (userChoice){
                case 1 : list.addNewEmp(); changed =true; break;
                case 2 : list.removeEmp(); changed =true; break;
                case 3 : list.promote(); changed =true; break;
                case 4 : list.print();
                case 5 : list.saveToFile(filename); changed =false;
                default: if (changed){
                    System.out.println("Save changes Y/N ?");
                    String response = sc.nextLine().toUpperCase();
                    if (response.startsWith("Y"))
                        list.saveToFile(filename);
                }
            }
        }
        while (userChoice>0&&userChoice<6)
    }
}
