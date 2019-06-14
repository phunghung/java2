package baitap.lab6;

import java.util.ArrayList;

public class PersonModel<T> {
    public ArrayList<T> li = new ArrayList<T>();
    
    public void addObject(T object) {
        li.add(object);      
    }
    
    public void Display() {
        for(T e : li) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        PersonModel<Student> objStudent = new PersonModel<Student>();
        Student objStudent1 = new Student("AT226", "Phung Xuan Hung", 24);
        Student objStudent2 = new Student("AC556", "Nguyen Hoai Thuong", 22);   
        
        objStudent.addObject(objStudent1);
        objStudent.addObject(objStudent2);       
        objStudent.Display();
        
        PersonModel<Employee> objEmployee = new PersonModel<Employee>();
        Employee objEmployee1 = new Employee("NV1", "Phung Xuan Hung", 20);
        Employee objEmployee2 = new Employee("NV2", "Nguyen Hoai Thuong", 18);
        
        objEmployee.addObject(objEmployee1);
        objEmployee.addObject(objEmployee2);
        objEmployee.Display();
        
        PersonModel<String> objString = new PersonModel<String>();
        
        objString.addObject("Phung Xuan Hung");
        objString.addObject("Nguyen Hoai Thuong");
        objString.Display();
    }
    
    
}
