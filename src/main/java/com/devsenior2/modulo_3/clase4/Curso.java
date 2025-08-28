package com.devsenior2.modulo_3.clase4;

public class Curso {
    private String name; 
    private int capacity; 

    public Curso(String name, int capacity){
        this.name = name;
        this.capacity = capacity; 
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void enrollCourse(int quantity){
        if(quantity > capacity){
            throw new SlotNotavailableException("The quantity to enroll is greater than the capacity of the course");
        }else{
            capacity -= quantity;
            System.out.println("Enroll succesful");
        }
    }
}
