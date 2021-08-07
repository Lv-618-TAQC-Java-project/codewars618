package com.ss.ita.kata.implementation.maxde1;

public enum Tasks {

    ONE ("Keep Hydrated!", 1),
    TWO ("Volume of a Cuboid", 2),
    THREE ("Miles per gallon to kilometers per liter", 3),
    FOUR ("To square(root) or not to square(root)", 4),
    FIVE ("Count of positives / sum of negatives", 5),
    SIX ("Convert a String to a Number!", 6),
    SEVEN ("Wilson primes", 7),
    EIGHT ("Formatting decimal places #0",8),
    NINE ("Find numbers which are divisible by given number", 9),
    TEN ("Looking for a benefactor", 10),
    ELEVEN ("Sum of the first nth term of Series", 11),
    TWELVE ("Where is Vasya?", 12),
    THIRTEEN ("Build a pile of Cubes", 13),
    FOURTEEN ("Easy Balance Checking", 14),
    FIFTEEN ("Floating-point Approximation (I)", 15),
    SIXTEEN ("Rainfall", 16),
    SEVENTEEN ("Ranking NBA teams", 17),
    EIGHTEEN ("Help the bookseller !", 18),
    NINETEEN ("Artificial Rain", 19),
    TWENTY ("Gap in Primes", 20),
    TWENTY_ONE ("Trailing zeros in factorial", 21),
    TWENTY_TWO ("Perimeter of squares in a rectangle", 22),
    TWENTY_THREE ("Which x for that sum?", 23),
    TWENTY_FOUR ("Find the smallest", 24);




    private String title;
    private int index;
    Tasks(String title, int index){
        this.index = index;
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public int getIndex() {
        return index;
    }
    public String getTitleAndIndex(){
        return ""+index +" - "+title;
    }
}
