package com.example;

public class Dev {
    
    private Computer comp;
    
    // private Laptop laptop;

    // private int age;

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public Dev(int age) {
    //     this.age = age;
    // }

    // public Dev() {
    //     System.out.println("Dev Constuctor");
    // }

    // public Laptop getLaptop() {
    //     return laptop;
    // }

    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    
    public Dev() {
    }

    // public Dev(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    public void method() {
        System.out.println("Working on it");
        comp.method();
    }

}
