package interfaces.marvel.hero;

public interface Superhero extends Person{

    String UNIVERSE_NAME = "Marvel"; //public static final by default

    String usePower(); //abstract keyword not needed

    /**
     * If Y received kill the villain
     * If N received stop the villain
     * @param c indicates Y or N
     * @return - Returns status
     */
    String stopVillain(char c);
}
