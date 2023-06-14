public class BonusMilesService {
    public int calculate (int price) {
        int resulte;
        if (price>20) {
            resulte=price/20;
        }else{
            resulte=0;
        }
        return resulte;
    }
}
