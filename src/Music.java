import com.sun.jdi.PathSearchingVirtualMachine;

public class Music extends ServiceCommunicator{
    public static void main(String[] args) {
        System.out.println(new Music("Halo-Beyonce").get()); //lets you look up Beyonce's song halo
        System.out.println(new Music("Drake-Gods-plan").get()); //lets you look up Beyonce's song halo
        System.out.println(new Music("Alicia-Keys-Fallin").get()); //lets you look up Beyonce's song halo
        System.out.println(new Music("J-cole-Crooked-smile").get()); //lets you look up Beyonce's song halo
    }
    Music(String songTitleORartist) {
        super("https://itunes.apple.com/search?term=" + songTitleORartist + "&limit=1");

    }

}
