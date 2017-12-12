package org.vistula.switchTest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ImieTest {

    private String determineSex(String name){
        String LastCharacter = name.substring(name.length() - 1).toLowerCase();

        switch (LastCharacter){
            case "a":
                return "GIRL";
            default:
                return "MEN";
        }
    }
    @Test
    public void shouldBeGirl(){
        assertThat(determineSex("Ala")).isEqualTo("GIRL");
    }

    @Test
    public void shouldBeGirlUppercase(){
        assertThat(determineSex("ALA")).isEqualTo("GIRL");
    }

    @Test
    public void shouldBeMen(){
        assertThat(determineSex("Slawek")).isEqualTo("MEN");
    }

    @Test
    public void shouldBeMenUppercase(){
        assertThat(determineSex("SLAWEK")).isEqualTo("MEN");
    }

}
