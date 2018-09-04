class RegularPrice extends Price {
    int getPriceCode() {
        int REGULAR = 0;
        return REGULAR;
    }
    
    double getCharge(int i)
    {
        double Amount = 2; //code from the book, all of the is from the book anyways.
        if (i > 2)
        {
            Amount += (i - 2) * 1.5;
        }
        return Amount;
    }
}