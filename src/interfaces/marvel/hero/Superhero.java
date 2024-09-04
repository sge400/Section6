package interfaces.marvel.hero;

public interface Superhero {

    String usePower(); //abstract keyword not needed

    /**
     * If Y received kill the villain
     * If N received stop the villain
     * @param c indicates Y or N
     * @return - Returns status
     */
    String stopVillain(char c);
}
