package org.vistula.klient;

import org.junit.Test;

public class Klient {

    private String name;
    private int age;
    private int heigh;
    private int weigh;
    private boolean isWomen;


    public Klient() {
    }


    public Klient(String name, int age, int heigh, int weigh, boolean isWomen) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
        this.weigh = weigh;
        this.isWomen = isWomen;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeigh() {
        return heigh;
    }

    public int getWeigh() {
        return weigh;
    }

    public boolean isWomen() {
        return isWomen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public void setWomen(boolean women) {
        isWomen = women;
    }

    public boolean isWomenn() {
        if (isWomen = true) {
            System.out.println("Jestem kobietą");
            return true;
        } else {
            System.out.println("Nie jestem kobietą");
            return false;
        }
    }

    public boolean isShort() {
        if (heigh < 150) {
            System.out.println("Niski");
            return true;
        } else {
            System.out.println("Wysoki");
            return false;
        }
    }

    public boolean isEligable() {
        if (isWomen = false && heigh >170 && weigh <80) {
            System.out.println("promocja obowiązuje");
            return true;
        } else {
            System.out.println("promocja nie obowiązuje");
            return false;

        }

    }


}
