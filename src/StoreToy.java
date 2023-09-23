import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StoreToy {
        private ArrayList<Toy> toys;
        private ArrayList<Toy> prizeToys;
        private String prizeFile;

        public StoreToy() {
            toys = new ArrayList<Toy>();
            prizeToys = new ArrayList<Toy>();
            prizeFile = "prize_toys.txt";
        }

        public void addToy(Toy toy) {
            toys.add(toy);
        }

        public void changeToyFreq(int toyId, double newFreq) {
            for (Toy toy : toys) {
                if (toy.getId() == toyId) {
                    toy.setFreq(newFreq);
                }
            }
        }

        public void organizeRandom() {
            prizeToys.clear();

            for (Toy toy : toys) {
                double random = Math.random() * 100;
                if (random < toy.getFreq()) {
                    prizeToys.add(toy);
                }
            }
        }
        public Toy getPrize() {
            if (!prizeToys.isEmpty()) {
                Toy prizeToy = prizeToys.remove(0);
                prizeToy.setCount(prizeToy.getCount() - 1);

                try {
                    FileWriter writer = new FileWriter(prizeFile, true);
                    writer.write(prizeToy.getName() + "\n");
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при записи в файл игрушки");
                }

                return prizeToy;
            } else {
                System.out.println("Все игрушки кончились");
                return null;
            }
        }
}
