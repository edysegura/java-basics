import edu.polymorphism.music.instrument.InstrumentFactory;
import edu.polymorphism.music.instrument.InstrumentTypes;
import edu.polymorphism.music.instrument.MusicalInstrument;

public class App {

  public static void playInstrument(InstrumentTypes type) {
    MusicalInstrument instrument = InstrumentFactory.get(type);
    String song = instrument.play();
    System.out.println("Playing " + song);
  }

  public static void main(String[] args) {
    playInstrument(InstrumentTypes.DRUM);
    playInstrument(InstrumentTypes.ELETRONIC_GUITAR);
  }

}
