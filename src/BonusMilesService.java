public class BonusMilesService {
    public int calculate(int ticket) {
        int oneMileBonus = 20; //стоимость одной бонусной мили

        int bonus = ticket / oneMileBonus;
        return bonus;
    }
}
