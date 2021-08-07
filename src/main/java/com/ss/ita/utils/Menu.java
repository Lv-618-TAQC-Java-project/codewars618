package com.ss.ita.utils;
import com.ss.ita.kata.Eight;
import com.ss.ita.kata.implementation.vmuravskyi.EightImpl;
import com.ss.ita.utils.Tasks;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void menu() {

        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    run();
                    break;
                case 2:
                    taskList();
                    break;
                case 3:
                    showTaskDetails();
                    break;
                case 4:
                    usersList();
                    break;
                case 5:
                    setImplementationByUser();
                    return;
                default:
                    System.out.println("Exit");

            }
        } while (choice != 0);

    }

    public void taskList() {
        for (Tasks task : Tasks.values()) {
            System.out.println(Tasks.getTaskName());
        }
    }

    public void showMenu() {
        System.out.println("1 - Run task");
        System.out.println("2 - Show Task Details");
        System.out.println("3 - Show task List");
        System.out.println("4 - Show users List");
        System.out.println("5 - Set Implementation");
        System.out.println("Enter your choice:\n");
    }

    public void showTaskDetails() {
        System.out.println("Enter inx of method");
        System.out.println(Tasks.getTaskById(sc.nextInt()));
    }

    public void run() {
        EightImpl e = new EightImpl();
        System.out.println("Enter n: ");
        System.out.println(e.liters(123));
    }

    public void usersList() {
        System.out.println();
    }

    public void setImplementationByUser() {

    }


}
