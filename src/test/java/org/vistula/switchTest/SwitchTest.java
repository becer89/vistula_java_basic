package org.vistula.switchTest;

import org.junit.Test;

public class SwitchTest {

    @Test
    public void switchTest(){
    int zmienna = 4;

    switch(zmienna){
    case 1:
        System.out.println("Liczba to 1");
        break;
    case 2:
        System.out.println("Liczba to 2");
        break;
    case 4:
        System.out.println("Liczba to 4");
        break;
    default:
        System.out.println("Liczba to ani 1 ani 2");
        break;



    }
}}
