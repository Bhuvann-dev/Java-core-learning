public class Main {
  public static void main(String[] args) {
      Parent p = new Child();
      p.disp1();
      p.disp2();
      // p.disp3(); --error
      ((Child)(p)).disp3(); // downcasting;

  }
}
