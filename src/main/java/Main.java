public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();
    long bonus = service.calculate(1000_60, true, 500);
    System.out.println(bonus);
  }
}

