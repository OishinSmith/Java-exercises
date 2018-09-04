import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Customer {
   private String _name;
   private List<Rental> _rentals = new ArrayList<Rental>();
   public Customer (String name, List<Rental> rentals){
       _name = name;
       _rentals = rentals;
   };
   public String getName (){
       return _name;
   };
   
   public List<Rental> getRentals(){
       return _rentals;
   }
   
   public String toString(){
       return(getName() + ": " + getRentals());
   }
     
 }