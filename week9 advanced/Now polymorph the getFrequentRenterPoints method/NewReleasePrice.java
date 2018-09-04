class NewReleasePrice extends Price {
    int getPriceCode() {
        int NEW_RELEASE = 1;
        return NEW_RELEASE;
    }
    

    double getCharge(int i)
    {
        return i * 3;
    }

    int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return 2;
        else
            return 1;
    }
}