


public class FQ {

    public static void main(String[] args) {
        int x;
       for (x=0;x<=1000;x++)
       {
           if ((x % 5) == 0 && (x % 7) == 0)
       {
           System.out.println("FitzQuark");
       }
           else if ((x % 5) == 0)
           {
               System.out.println("Fitz");
           }
           else if ((x % 7) == 0)
           {
               System.out.println("Quark");
           }

           else
           {
               System.out.println(x);
           }

       }
    }
}