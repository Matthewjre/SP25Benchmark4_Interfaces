package models;

import java.util.ArrayList;

//NOTE: This file does NOT need a class contract, and it doesn't need method contract either. Just define and implement the
//primary methods
public class ArrayListQueue<E> implements IQueue<E> {

    private ArrayList<E> list = new ArrayList<>();










    //Ignore this, I need it for writing your autograder tests
    public String toString() {
        return list.toString();
    }
}
