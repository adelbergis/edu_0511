public class Pegasus extends Horse{

    public Pegasus(boolean vegetarian, String speak, byte paws, String color) {
        super(vegetarian, speak, paws, color);
    }

    public void fly(){ System.out.println(speak + ", я полетел(а)"); }
}
