import java.util.List;
import java.util.ArrayList;

public class Customer {
    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();
    
    public Customer(String name, List<Rental> rentals) {
        _name = name;
        _rentals = rentals;
    }

    public String getName() {
        return _name;
    }
    
    public List<Rental> getRentals() {
        return _rentals;
    }
    
    public String toString() {
        return getName() + ": " + getRentals();
    }
    
    public String statement()
    {
        String output = "Statement for " + getName() + "\n";
        double total = getTotalCharge();
        int frequentRenterPoints = getTotalFrequentRenterPoints();
        for(Rental rental : getRentals())
        {
            output += "  " + rental.getMovie().getTitle() + "  " + String.valueOf(rental.getCharge()) + "\n";
            
        }
        output += "Amount owed is " + total + "\n";
        output += "You earned " + frequentRenterPoints + " frequent renter points\n";
        return output;
    }
    public double getTotalCharge()
    {
        double result = 0;
        for(Rental rental:getRentals())
        {
            result = result +rental.getCharge();
        }
        return result;
    }
    public int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental rental : getRentals()) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }
}