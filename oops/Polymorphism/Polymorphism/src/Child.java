public class Child extends Parent {
  void disp1() {
    System.out.println("Inside child disp1");
  }  

  // void disp2() {
  //   System.out.println("Inside parent disp2");
  // }  Inherited method

  void disp3() {
    System.out.println("Inside child disp3"); // child specific method
  }
}
