package interfaces.marvel.hero.app;

import interfaces.marvel.hero.Superhero;
import interfaces.marvel.hero.impl.CaptainAmerica;
import interfaces.marvel.hero.impl.IronMan;
import interfaces.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {

    public static void main(String[] args) {

        System.out.println(Superhero.UNIVERSE_NAME);

        Superhero ironMan = new IronMan();
        /*System.out.println(ironMan.usePower());
        System.out.println(ironMan.stopVillain('N'));*/
        invokeSuperHero(ironMan);

        Superhero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan);

        Superhero captainAmerica = new CaptainAmerica();
        invokeSuperHero(captainAmerica);
    }

    private static void invokeSuperHero(Superhero superhero) {
        System.out.println(superhero.usePower());
        System.out.println(superhero.stopVillain('N'));
    }
}
