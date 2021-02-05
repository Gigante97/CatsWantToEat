public class Plate {
    private int spaciousness;

    Plate(int spaciousness) {
        this.spaciousness = spaciousness;
    }

    void decreaseFood(int appetite) {
        if (spaciousness>appetite) {
            spaciousness-=appetite;
        }
    }
   int getSpaciousness() {
        return spaciousness;
   }
   void increaseFood(int quantity) {
       System.out.println("Добавали еды: " + quantity + " кусочков");
        spaciousness +=quantity;
   }
}
