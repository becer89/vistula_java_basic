package org.vistula.petla;

import org.junit.Test;

public class petlaTest {

    @Test
    public void basicForLoop() {
        // for (warunek początkowy; warunek kontynuacji; operacja na zakończenie pętli)
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
    @Test
    public void basicForLoop2() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    @Test
    public void basicWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    @Test
    public void basicWhileLoop2() {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}