public class Toy {
    private int id;
    private String name;
    private int count;
    private double freq; // Вес(частота выпадения)

    public Toy(int id, String name, int count, double freq) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.freq = freq;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }
}
