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
        String output = "";
        double total = 0;
        int frequentRenterPoints = 0;
        for(Rental rental : getRentals())
        {
            output += "  " + rental.getMovie().getTitle() + "  " + String.valueOf(rental.getCharge()) + "\n";
            
            total += rental.getCharge();
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        output += "Amount owed is " + total + "\n";
        output += "You earned " + frequentRenterPoints + " frequent renter points\n";
        return output;
    }
}