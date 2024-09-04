package interfaces.marvel.hero.impl;

import interfaces.marvel.hero.Superhero;

public class CaptainAmerica implements Superhero {

    @Override
    public String usePower() {
        return "CaptainAmerica using his power";
    }

    @Override
    public String stopVillain(char c) {
        if (c=='Y') {
            return "CaptainAmerica killed the Villain";
        } else {
            return "CaptainAmerica stopped the Villain";
        }
    }
}
