class Book {
     private int pageNo;

     void setData(int x) {
        
        if (x > 0) {
            pageNo = x;
        }
         
     } 
     void getData() {
        System.out.println(pageNo);
     }
}

public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setData(10);
        b1.getData();
        
    }
}