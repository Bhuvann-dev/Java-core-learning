public class System {
  public static void main(String[] args) {
      
    Keyboard k = new Keyboard();
    accessdisp(k);

    Mouse m = new Mouse();
    accessdisp(m);

  }

  public void accessdisp(Mnitor mon) {
    mon.work();
    mon.disp2();

    if (mon instanceof Keyboard) {
      ((Keyboard) (mon) ).show3();
    } else {
      ((Mouse) (mon)).show3();
    }

  }
}
