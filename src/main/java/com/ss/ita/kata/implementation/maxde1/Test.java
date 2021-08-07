package com.ss.ita.kata.implementation.maxde1;

public enum Test {
////    ONE(1, "You love cycling. Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.",
////            "Enter the time in hours and I will return the number of litres you will drink, rounded to the smallest value."),
////    TWO(2,"You have a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid.",
////            "Enter length, width and the height."),
////    THREE(3, "This is a method that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).",
////            "The result will be rounded off to two decimal points. If the answer ends with a 0, it will be rounded off without the 0. So instead of 5.50, you will get 5.5. Enter a float number."),
////    FOUR(4, "A method, that will get an integer array as parameter and will process every number from this array.\n" +
////            "If the number has an integer square root, take this, otherwise square the number.",
////            "Input array that contains only positive numbers and will never be empty or null."),
////    FIVE(5,"Given an array of integers.\n" +
////            "Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.\n" +
////            "If the input array is empty or null, return an empty array.",
////            "Example\n" +
////                    "For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65]."),
////    SIX(6,"We need a function that can transform a string into a number. What ways of achieving this do you know?\n" +
////            "Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.",
////            "Examples\n" +
////                    "\"1234\" --> 1234\n" +
////                    "\"605\"  --> 605\n" +
////                    "\"1405\" --> 1405"),
////    SEVEN(7,"Wilson primes satisfy the following condition. Let P represent a prime number.\n" +
////            "\n" +
////            "Then ((P-1)! + 1) / (P * P) should give a whole number.",
////            "Enter double"),
////    EIGHT(8,"Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.",
////            "Example:    \n" +
////                    "5.5589 is rounded 5.56   \n" +
////                    "3.3424 is rounded 3.34"),
////    NINE(9,"Function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.",
////            "Example\n" +
////                    "divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]"),
////    TEN(10, "John has a list of the first n donations: [14, 30, 5, 7, 9, 11, 15] He wants to know how much the next benefactor should give to the association so that the average of the first n + 1 donations should reach an average of 30. After doing the math he found 149. He thinks that he made a mistake. Let's check.",
////            "new_avg([14, 30, 5, 7, 9, 11, 15], 92) should return 645\n" +
////                    "new_avg([14, 30, 5, 7, 9, 11, 15], 2) \n" +
////                    "should raise an error (ValueError or invalid_argument or argument-error or DomainError) \n" +
////                    "or return -1 or ERROR or Nothing or None depending on the language."),
////    ELEVEN(11, "Your task is to write a function which returns the sum of following series upto nth term(parameter).",
////            "Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...\n" +
////                    "Round the answer to 2 decimal places and return it as String.\n" +
////                    "If the given value is 0 then it should return 0.00\n" +
////                    "You will only be given Natural Numbers as arguments."),
////    TWELVE(12, "Vasya stands in line with number of people p (including Vasya), but he doesn't know exactly which position he occupies. He can say that there are no less than b people standing in front of him and no more than a people standing behind him. Find the number of different positions Vasya can occupy.",
////            "As an input you have 3 numbers:\n" +
////                    "1. Total amount of people in the line;\n" +
////                    "2. Number of people standing in front of him\n" +
////                    "3. Number of people standing behind him\n" +
////                    "\n" +
////                    "WhereIsVasya.whereIsHe(3, 1, 1)   // => 2  The possible positions are: 2 and 3"),
////    THIRTEEN(13, "This task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.\n" +
////            "\n" +
////            "You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?\n" +
////            "\n" +
////            "The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.",
////            "Examples:\n" +
////                    "\n" +
////                    "findNb(1071225) --> 45\n" +
////                    "findNb(91716553919377) --> -1"),
////    FOURTEEN(14, "The first line shows the original balance. Each other line (when not blank) gives information: check number, category, check amount. (Input form may change depending on the language).\n" +
////            "\n" +
////            "First you have to clean the lines keeping only letters, digits, dots and spaces.\n" +
////            "\n" +
////            "Then return a report as a string (underscores show spaces -- don't put them in your solution. They are there so you can see them and how many of them you need to have):",
////            "Something like this:\n" +
////                    "\"1000.00\n" +
////                    "125 Market 125.45\n" +
////                    "126 Hardware 34.95\n" +
////                    "127 Video 7.45\n" +
////                    "128 Book 14.32\n" +
////                    "129 Gasoline 16.10\""),
////    FIFTEEN(15, "Consider the function\n" +
////            "f: x -> sqrt(1 + x) - 1 at x = 1e-15.\n" +
////            "\n" +
////            "We get: f(x) = 4.44089209850062616e-16\n" +
////            "or something around that, depending on the language.\n" +
////            "\n" +
////            "This function involves the subtraction of a pair of similar numbers when x is near 0 and the results are significantly erroneous in this region. Using pow instead of sqrt doesn't give better results.\n" +
////            "\n" +
////            "A \"good\" answer is 4.99999999999999875... * 1e-16.",
////            "assertFuzzyEquals (ApproxFloat.f(2.6e-08), 1.29999999155e-08);\n" +
////                    "assertFuzzyEquals (ApproxFloat.f(1.4e-09), 6.999999997549999e-10);\n" +
////                    "assertFuzzyEquals (ApproxFloat.f(5.0e-06), 2.499996875007812e-06);\n" +
////                    "assertFuzzyEquals (ApproxFloat.f(2.4e-07), 1.1999999280000085e-07);"),
////    SIXTEEN(16, "data and data1 are two strings with rainfall records of a few cities for months from January to December. The records of towns are separated by \\n. The name of each town is followed by :.\n" +
////            "\n" +
////            "Task:\n" +
////            "function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).\n" +
////            "function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.\n" +
////            "Examples:\n" +
////            "mean(\"London\", data), 51.19(9999999999996) \n" +
////            "variance(\"London\", data), 57.42(833333333374)");
//    String title;
//    int index;
//    Test(String title, int index){
//        this.index = index;
//        this.title = title;
//    }
//    public int getIndex(){
//        return index;
//    }
//    public String getTitle(){
//        return title;
//    }
//    public static String getTitleFromTitle(int i) {
//        for (Test t : Test.values()) {
//            if (t.getIndex() == i) {
//                return t.title;
//            }
//        }
//        return "";
//    }

}
