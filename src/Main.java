public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Пушок",5),new Cat("Барбос",8),new Cat("Шерлок",15)};
        Plate commonBowl = new Plate(20);

        for (int i=0; i< cats.length;i++) {
            cats[i].eat(commonBowl);

        }

        for (int i=0; i<cats.length;i++){
            if (cats[i].getSatiety()==false) {
                int quantity =cats[i].getAppetite() - commonBowl.getSpaciousness();
                commonBowl.increaseFood(quantity);
                cats[i].eat(commonBowl);
            }
        }


    }
}
