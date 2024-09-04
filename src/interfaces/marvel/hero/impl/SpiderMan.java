package interfaces.marvel.hero.impl;

import interfaces.marvel.hero.Superhero;

public class SpiderMan implements Superhero {

    @Override
    public String usePower() {
        return "SpiderMan using his power";
    }

    @Override
    public String stopVillain(char c) {
        if (c=='Y') {
            return "SpiderMan killed the Villain";
        } else {
            return "SpiderMan stopped the Villain";
        }
    }

    @Override
    public String trackLiveLocation() {
        String liveLocation = "London";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }
}
