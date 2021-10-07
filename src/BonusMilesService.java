public class BonusMilesService {
    public int calculate(int price) {
        int costPerMile = 20;
        int miles = price / costPerMile;
        return miles;
    }
}