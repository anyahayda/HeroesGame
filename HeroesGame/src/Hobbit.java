public class Hobbit extends Character {
    public Hobbit() {
        super(0,3);
    }

    @Override
    public void kick(Character other) {
        toCry();
    }

    private void toCry(){
        System.out.println("Cry");
    }
}
