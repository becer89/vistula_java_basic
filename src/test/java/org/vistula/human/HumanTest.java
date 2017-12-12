package org.vistula.human;

import org.junit.Test;
import org.vistula.webpage.WebPage;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import java.util.ArrayList;


public class HumanTest {





    @Test
    public void myFirstTest() {
        Human slawek = new Human(19, "Slawek", "Radzyminski");
        assert slawek.getAge() == 19;
    }

    @Test
    public void testEmptyConstructor() {
        Human jessica = new Human();
        jessica.setAge(19);
        assert jessica.getAge() == 19;
    }

    @Test
    public void verifyName() {
        Human slawek = new Human(19, "Slawek", "Radzyminski");
        assert slawek.getName() == "Slawek";
    }

    @Test
    public void verifyName2() {
        Human jessica = new Human();
        jessica.setName("Jessica");
        assert jessica.getName() == "Jessica";
    }

    @Test
    public void verifyLastName(){
        Human pawel = new Human (28, "Pawel", "Piekarzewski");
        assert pawel.getLastName() == "Piekarzewski";
    }
    @Test
    public void verifyLastName2(){
        Human jozek = new Human();
        jozek.setLastName("Nowak");
        assert jozek.getLastName() == "Nowak";

    }
    @Test
    public void verifyAlcohol() {
        Human janek = new Human();
        janek.setAge(17);
        assert janek.canBuyAlcohol() == false;
    }

  //  @Test
   // public void verifyAlcoho3() {
  //      Human janek = new Human();
   //     janek.setAge(17);
   //     assertThat(janek.canBuyAlcohol());
   // }

    @Test
    public void verifyAlcohol2() {
        Human janek = new Human();
        janek.setAge(18);
        assert janek.canBuyAlcohol() == true;
    }
    @Test
    public void verifyAlcohol3() {
        Human janek = new Human();
        janek.setAge(19);
        assert janek.canBuyAlcohol() == true;
    }

    @Test
    public void shouldReturnCorrectHuman(){
        ArrayList<Human> humans = new ArrayList<>();
        Human slawek = new Human(15, "Slawek", "Slawkowski");
        Human jessica = new Human(11, "Jessica", "Simpson");
        Human jurand = new Human(680, "Jurand", "Zespychowa");

        humans.add(slawek);
        humans.add(jessica);
        humans.add(jurand);

        assertThat(humans.get(0).getAge()).isEqualTo(15);
        assertThat(humans.get(2).getLastName()).isEqualTo("Zespychowa");

    }
}
