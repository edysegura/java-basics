public enum Suit {

  HEART("Red"),
  DIAMOND("Black"),
  CLUB("Black"),
  SPADE("Red");

  private String color;

  Suit(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

}
