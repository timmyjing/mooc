
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int price = this.squareMeters * this.pricePerSquareMeter;
        
        return Math.abs(price - otherPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int price = this.squareMeters * this.pricePerSquareMeter;
        
        return price > otherPrice;
    }
    
}
