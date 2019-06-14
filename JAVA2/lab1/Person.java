package baitap.lab1;

import java.util.Scanner;

public class Person implements PersonExample{
    protected String id;
    protected String name;
    protected int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        String id = sc.nextLine();
        setId(id);
        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();
        setName(name);
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        setAge(age);
    }
    
    @Override
    public void Display() {
        System.out.println("ID: " + getId());
        System.out.println("Ho va Ten: " + getName());
        System.out.println("Tuoi: " + getAge());
    }
    
}
