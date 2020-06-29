public class Card {

  private int number;
  private Suit suit;

  public Card(int number, Suit suit) {
    this.number = number;
    this.suit = suit;
  }
  
  public void printCard() {
    System.out.println("This card is");
    System.out.println("- Number: " + number);
    System.out.println("- Suit: " + suit);
    System.out.println("- Color: " + suit.getColor());
  }
}
