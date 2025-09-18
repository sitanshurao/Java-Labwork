public class Boxx {
    float width, height, depth;
    public Boxx() {
        width = height = depth = 0;
    }
    public Boxx(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }
    public Boxx(Boxx b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }
    public float getVolume() {
        return width * height * depth;
    }
    public void displayVolume() {
        System.out.println("Volume = " + getVolume());
    }
}