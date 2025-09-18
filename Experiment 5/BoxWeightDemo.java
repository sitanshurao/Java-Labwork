public class BoxWeightDemo {
    public static void main(String[] args) {
        Boxx b = new Boxx(2, 3, 4);
        b.displayVolume();
        BoxWeight bw = new BoxWeight(2, 3, 4, 10);
        bw.displayVolume();
        bw.displayWeight();
        BoxWeight bw2 = new BoxWeight(bw);
        bw2.displayVolume();
        bw2.displayWeight();
    }
}
