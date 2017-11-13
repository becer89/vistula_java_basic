package org.vistula.math;

public class Math {

    // zmienne
    int numberOne;
    int numberTwo;


    // konstruktory
    public Math() {
    }

    public Math(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;

    }

    //gettery,settery

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    //metody, funkcjonalności

    public int multiply() {
        return numberOne * numberTwo;
    }

    public int addition(){
        return numberOne + numberTwo;
    }

    public int division(){
        return numberOne / numberTwo;
    }
    public int multiply2(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

}