public class BoxWeight {
    float width, height, depth;
    float weight;
    public BoxWeight() {
        width = height = depth = weight = 0;
    }
    public BoxWeight(float w, float h, float d, float m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
    public BoxWeight(BoxWeight bw) {
        this.width = bw.width;
        this.height = bw.height;
        this.depth = bw.depth;
        this.weight = bw.weight;
    }
    public float getVolume() {
        return width * height * depth;
    }
    public void displayVolume() {
        System.out.println("Volume = " + getVolume());
    }
    public void displayWeight() {
        System.out.println("Weight = " + weight);
    }
}