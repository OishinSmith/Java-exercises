import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "";  //this was changed
        
        int i = 0;
        while (i < getRentals().size()) { //this was changed
            double thisAmount = 0;
            Rental each = (Rental) getRentals().get(i);  //this was changed
            
            //determine amounts for each line
             switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                   thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }
            
            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints ++;
            
            //show figures for this rental
            result += "  " + each.getMovie().getTitle() + "  " + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
            i++;
        }
            
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points" + "\n";
        return result;
    }
 }