public class DeveloperApp {
  public static void main(String[] args) {

      // Developer dev1; // Parent type reference
      // JavaDeveloper jd = new JavaDeveloper();
      // dev1 = jd;
      // dev1.work();
      // dev1.project();

      // // Developer dev2; // Parent type reference
      // // PythonDeveloper pd = new PythonDeveloper();   
      // // dev2 = pd; 
      // // dev2.work();
      // // dev2.project(); or can write like this 

      // Developer dev2 = new PythonDeveloper();   
      // dev2.work();
      // dev2.project();
      
      // // Concept called Upcasting;

      // Developer dev;

      // dev = new PythonDeveloper();
      // dev.work();
      // dev.project();

      // dev = new JavaDeveloper();
      // dev.work();
      // dev.project();
      
      // // Concept called Polymorphism.

        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);

        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);

  }
   public static void accessMethod(Developer dev)  // One is to many.
        {
          dev.work();
          dev.project();
        }

}

      
  

