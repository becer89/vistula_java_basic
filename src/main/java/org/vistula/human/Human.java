package org.vistula.human;

public class Human {

    private int age;
    private String name;
    private String lastName;


    public Human(){}



    public Human(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public boolean canBuyAlcohol(){
        if (age >= 18) {
            return true;
        }
        else{
            return false;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
