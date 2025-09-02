public class Door {
    //can only open one way
    //has a lock on one side
    //can be locked or unlocked
    //does not open from outside if closed
    //rectangular shaped
    
    private int numberOfLocks; // = 1; 
    private boolean canBeLocked; // = true;
    private String shape; // = "rectangular";
    private double height; // = 7.0;
    private char name; // = "D";

    public Door() {
        numberOfLocks = 1;
        canBeLocked = true;
        shape = "rectangular";
        height = 7.0;
        name = 'D';
    }

    // public WhatComesOut nameOfFunction(input) {

    public void numberOfLocks() {
        numberOfLocks = 0;
        System.out.println("Number of Locks: " + numberOfLocks);
    }

    public void canBeLocked() {
        if (canBeLocked = true);
            System.out.println("The door can be locked. ");
    }

    public void shape() {
        shape = "square";
    }

    public void height() {
        height = 6.8;
    }

    public void name() {
        name = 'A';
    }
}