package edu.polymorphism.music.instrument;

public class InstrumentFactory {

  public static MusicalInstrument get(InstrumentTypes type) {
    switch (type) {
      case ELECTRONIC_GUITAR:
        return new ElectronicGuitar();

      case DRUM:
        return new Drum();

      case PIANO:
        return new Piano();

      case SAXOPHONE:
        return new Saxophone();

      default:
        return null;
    }
  }

}
