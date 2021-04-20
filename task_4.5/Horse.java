public class Horse extends Animal{
    String color;

    public Horse(boolean vegetarian, String speak, byte paws, String color) {
        super(vegetarian, speak, paws);
        this.color = color;
    }
    public void run(){ System.out.println(speak + ", я поскакал(а)"); }
}
