package com.ss.ita.utils;

public enum Users {
    IVANKA(1, "Ivanna Veselovska","IvannaVeselovska"),
    VOLODYMYR_MUR(2, "Volodymyr Muravskyi","vmuravskyi"),
    YURII(3,"Yurii Nesterovych","yranest"),
    MAKSYM_DEN(4,"Maksym Denysenko","Maxde1"),
    ANASTASIIA(5,"Anastasiia Kovalchuk","kubrub"),
    IEVGENII(6,"Ievgenii Shcherbakov","shcherbakoveugene"),
    MAKSYM_SEM(7,"Max Semochko","msemochko"),
    VOLODYMYR_SHO(8,"VOLODYMYR_SHOVKOPLYAS","2vovik4"),
    VIKTOR(9,"Viktor Yashchyshyn","viktor7469");
    private final int id;
    private final String fullName;
    private final String gitName;

    Users(int id, String fullName, String gitName) {
        this.id = id;
        this.fullName = fullName;
        this.gitName = gitName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGitName() {
        return gitName;
    }

    public static Users getUserById(int id) {
        for (Users user: values()) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }
}
