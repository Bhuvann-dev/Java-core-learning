public class DeveloperApp {
  public static void main(String[] args) {

      Developer dev1; // Parent type reference
      JavaDeveloper jd = new JavaDeveloper();
      dev1 = jd;
      dev1.work();
      dev1.project();

      // Developer dev2; // Parent type reference
      // PythonDeveloper pd = new PythonDeveloper();   
      // dev2 = pd; 
      // dev2.work();
      // dev2.project(); or can write like this 

      Developer dev2 = new PythonDeveloper();   
      dev2.work();
      dev2.project();
      
      // Concept called Upcasting;

      
  }
}
