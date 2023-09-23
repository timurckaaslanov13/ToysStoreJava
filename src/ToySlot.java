public class ToySlot {
    public static void main(String[] args) {
        StoreToy storeToy = new StoreToy();

        Toy toy1 = new Toy(1, "Lego", 3, 20);
        Toy toy2 = new Toy(2, "Barbie", 200, 40);
        Toy toy3 = new Toy(3, "SuperMan", 132, 90);
        Toy toy4 = new Toy(4, "Iphone", 10, 12);
        Toy toy5 = new Toy(5, "chees", 100, 95);
        Toy toy6 = new Toy(6, "PlayStation", 10, 11);

        storeToy.addToy(toy1);
        storeToy.addToy(toy2);
        storeToy.addToy(toy3);
        storeToy.addToy(toy4);
        storeToy.addToy(toy5);
        storeToy.addToy(toy6);

        storeToy.changeToyFreq(1, 30);

        storeToy.organizeRandom();

        Toy prizeToy = storeToy.getPrize();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}
