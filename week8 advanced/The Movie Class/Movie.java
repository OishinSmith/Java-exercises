public class Movie {
   public static final int  CHILDRENS = 2;  //static means that instead of each instance of the class 
                                            //having that variable, the variable belongs to the class as a whole.
   public static final int  REGULAR = 0;
   public static final int  NEW_RELEASE = 1; //final means that the values are constant and cannot be changed.
   private String _title;
   private int _priceCode;
   public Movie(String title, int priceCode) {
       _title = title;
       _priceCode = priceCode;
   }
   public int getPriceCode() {
       return _priceCode;
   }
   public void setPriceCode(int arg) {
     _priceCode = arg;
   }
   public String getTitle (){
       return _title;
   };
 }