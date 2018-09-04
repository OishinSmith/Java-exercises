class Rental {
     private Movie _movie;
     private int _daysRented;
     public Rental(Movie movie, int daysRented) {
       _movie = movie;
       _daysRented = daysRented;
     }
     public int getDaysRented() {
       return _daysRented;
     }
    public Movie getMovie() {
       return _movie;
    }
       
    public String toString() {
        return(getMovie() + " ["+ getDaysRented()+"]");
    }
    
    public double getCharge() { //from book
        double thisAmount = 0;
        switch (this.getMovie().getPriceCode()) { //this to refer to local variable
            case Movie.REGULAR:
                thisAmount += 2;
                if (this.getDaysRented() > 2)
                    thisAmount += (this.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += this.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (this.getDaysRented() > 3)
                    thisAmount += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
    public int getFrequentRenterPoints() //mostly same code
    {
        int frequentRenterPoints = 1;
        if((this.getMovie().getPriceCode() == 1) && this.getDaysRented() > 1)
        {
            frequentRenterPoints = frequentRenterPoints + 1;
        }
        return frequentRenterPoints;
          
    }
}