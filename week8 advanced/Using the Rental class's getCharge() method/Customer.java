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
   
   public String statement() { //from previous question: The statement method: getTotal()


        double totalAmount = 0;
        int frequentPoints = 0;
        String result = "";
        
        int i = 0;
        while (i < getRentals().size()) {
            double thisAmount = 0;
            Rental each = (Rental) getRentals().get(i);
            
            thisAmount = getTotal(each);//method defined below
            frequentPoints = frequentPoints + 1;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentPoints = frequentPoints + 1;
            
            result += "  " + each.getMovie().getTitle() + "  " + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
            i++;
        }
            
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentPoints) + " frequent renter points" + "\n";
        return result;
   }
   public double getTotal(Rental rental)
   {
       return rental.getCharge();
   }
     
 }