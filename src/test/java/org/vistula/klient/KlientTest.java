package org.vistula.klient;

import org.junit.Test;

public class KlientTest {


    @Test
    public void areYouWomen() {
        Klient aneta = new Klient();
        aneta.setWomen(true);
        assert aneta.isWomenn() == true;
    }

    @Test
    public void areYouWomen2() {
        Klient jurek = new Klient();
        jurek.setWomen(false);
        assert jurek.isWomenn() == false;
    }


    @Test
    public void isShort() {
        Klient olek = new Klient();
        olek.setHeigh(140);
        assert olek.isShort() == true;
    }

    @Test
    public void isTall() {
        Klient olek = new Klient();
        olek.setHeigh(160);
        assert olek.isShort() == false;
    }

  //  @Test
  //  public void isEligable(){
   //     Klient someone = new Klient();
   //     someone.setWomen(false);
   //     someone.setHeigh(190);
   //     someone.setWeigh(79);

   //     assert someone
   // }

}
