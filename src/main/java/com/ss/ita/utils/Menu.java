package com.ss.ita.utils;


public class Menu {
    ConsoleScanner cs = new ConsoleScanner();
    Runner runner;

    public void menu() {
        constructorRunner();
        int choice;
        do {
            showMenu();
            choice = cs.readInt();
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
                    break;

            }
        } while (choice != 0);
        System.out.println("Thank you! Hope to see you again:)");

    }

    private void constructorRunner() {
        System.out.println("Hello!\nTo continue, please, choose someone's implementation: ");
        System.out.println();
        usersList();
        runner = new Runner(Users.getUserById(cs.readInt()));
    }

    public void taskList() {

        for (Tasks task : Tasks.values()) {
            System.out.println(task.getId() + " " + task.getTaskName());
        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("1 - Run task");
        System.out.println("2 - Show task List");
        System.out.println("3 - Show Task Details");
        System.out.println("4 - Show users List");
        System.out.println("5 - Change implementation");
        System.out.println("0 - Exit");
        System.out.println();
        System.out.println("Enter your choice:\n");
    }

    public void showTaskDetails() {
        System.out.println("Enter inx of method");
        System.out.println(Tasks.getDescription(cs.readInt()));
        System.out.println();
    }

    public void run() {
        System.out.println();
        System.out.println("Enter index of task");
        int choose = cs.readInt();
        while (choose > 24 || choose < 1) {
            System.out.println("Enter from 1 to 24");
            choose = cs.readInt();
        }
        runner.setTasks(choose);
        System.out.println("--------------------------------------------------");
    }

    public void usersList() {
        System.out.println();
        System.out.println("List of users:");
        for (Users user : Users.values()) {
            System.out.println(user.getId() + " " + user.getFullName()+" "+user.getGitName());
        }
        System.out.println();
    }

    public void setImplementationByUser() {
        usersList();
        System.out.println("Make your choice:");
        int choose;
//        while (choose > 1 || choose < 9) {
//            choose = cs.readInt();
//        }
        do {
            choose = cs.readInt();
        } while (choose < 1 || choose > 9);
        runner.setUsers(Users.getUserById(choose));
        System.out.println();
    }
}
