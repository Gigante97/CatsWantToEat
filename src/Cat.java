public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name,int appetite) {
        this.name=name;
        this.appetite=appetite;
        this.satiety=false;
    }

    void eat(Plate plate) {
        if (plate.getSpaciousness()>=appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " наелся");
        }
        else {
            System.out.println(name + " не наелся. Мало еды");
        }
    }

    boolean getSatiety() {
        return satiety;
    }

    int getAppetite(){
        return appetite;
    }
}
