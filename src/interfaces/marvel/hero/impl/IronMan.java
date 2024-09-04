package interfaces.marvel.hero.impl;

import interfaces.marvel.hero.Superhero;

public class IronMan implements Superhero {

    @Override
    public String usePower() {
        return "IronMan using his power";
    }

    @Override
    public String stopVillain(char c) {
        if (c=='Y') {
            return "IronMan killed the Villain";
        } else {
            return "IronMan stopped the Villain";
        }
    }
}
