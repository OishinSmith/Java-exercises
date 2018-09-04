class ChildrensPrice extends Price {
    
    int getPriceCode() {
        int CHILDRENS = 2;
        return CHILDRENS;
    }
    
    double getCharge(int i)
    {
        double Amount = 1.5; //code from the book, all of the is from the book anyways.
        if (i > 3)
        {
            Amount += ((i - 3) * 1.5);
        }
        return Amount;
    }
    
    
}