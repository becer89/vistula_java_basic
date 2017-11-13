package org.vistula.math;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MathTest {

   @Test
    public void shouldCorrectlyMultiply() {
        Math multiplication = new Math(5,6);
        assertThat(multiplication.multiply()).isEqualTo(30);

}



@Test
    public void mySecondMultiply(){
    Math multiplication = new Math(5,6);
    assert multiplication.multiply() == 30;
    assert multiplication.getNumberOne() == 5;
    assert multiplication.getNumberTwo() == 6;

}

@Test
    public void myThirdMultiply(){
    Math multiplication = new Math();
        multiplication.setNumberOne(5);
        multiplication.setNumberTwo(6);
        assert multiplication.multiply() == 30;
    }

    @Test
    public void myFirstAddition(){
        Math addition = new Math();
        addition.setNumberOne(5);
        addition.setNumberTwo(6);
        assert addition.addition() == 11;
    }

    @Test
    public void myFirstDivision(){
        Math division = new Math();
        division.setNumberOne(10);
        division.setNumberTwo(2);
        assert division.division() == 5;

    }

    @Test
    public void mySecondDivision(){
        Math division = new Math(20,2);
       // division.getNumberOne();
       // division.getNumberTwo();
        assert division.division() == 10;

    }
    @Test
    public void multiply2Test(){
        Math multiply = new Math();
        assert multiply.multiply2(2,4) == 8;

    }

}


