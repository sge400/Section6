package interfaces.marvel.hero;

public interface Superhero extends Person{

    String UNIVERSE_NAME = "Marvel"; //public static final by default

    String usePower(); //abstract keyword not needed, final keyword not permitted

    /**
     * If Y received kill the villain
     * If N received stop the villain
     * @param c indicates Y or N
     * @return - Returns status
     */
    String stopVillain(char c);

    default String trackLiveLocation() {
        String liveLocation = "USA";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }

    static String commonCharacteristics() {
        return "Superhuman abilities, Willingness to sacrifice";
    }
}
