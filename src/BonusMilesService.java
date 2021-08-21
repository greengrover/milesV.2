public class BonusMilesService {
    public int calculate(int price) {
        int milesPrice = 20;
        int totalBonus = price / milesPrice;

        return totalBonus;
    }

}
