public class WaterBottle {



    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;


    }

    public int getVolume() {
        return volume;
    }

    public int getHadOneDrinkVolume() {

        volume = volume -10;
        return volume ;
    }

    public int emptyBottle() {
        volume =0;
        return volume;
    }

    public int FillBottle() {
        volume =100;
        return volume;
    }
}

