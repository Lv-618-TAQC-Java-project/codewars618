package com.ss.ita.kata.implementation.maxde1;


import com.ss.ita.utils.TaskDescription;
import java.util.Scanner;

public class Manu {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Manu m = new Manu();
        m.menu();
    }
    public void menu(){

        int choice;
        while (true){
            showMenu();
            choice = sc.nextInt();
            switch (choice){
                case (1):
                    run();
                    break;
                case (2):
                    taskList();
                    break;
                case (3):
                    showTaskDetails();
                    break;
                case (4):
                    usersList();
                    break;
                case (5):
                    setImplementationByUser();
                    return;

            }
            if (choice == 0){
                break;
            }
        }

    }
    public void taskList(){
    for (Tasks task: Tasks.values()){
        System.out.println(task.getTitleAndIndex());
        }
    }
    public void showMenu(){
        System.out.println("1 - Run task");
        System.out.println("2 - Show Task Details");
        System.out.println("3 - Show task List");
        System.out.println("4 - Show users List");
        System.out.println("5 - Set Implementation");
        System.out.println("Enter your choice:\n");
    }
    public void showTaskDetails(){
        System.out.println("Enter inx of method");
        System.out.println(TaskDescription.getById(sc.nextInt()));
    }
    public void run(){
        FiveImpl a =new FiveImpl();
        System.out.println("Enter n: ");
        System.out.println(a.zeros(sc.nextInt()));;
    }
    public void usersList(){
        System.out.println();
    }
    public void setImplementationByUser(){

    }


}
