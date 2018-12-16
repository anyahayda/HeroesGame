public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character other) {
        if (other.power < this.power)
            other.hp = 0;
        else {
            if (hp < 0)
                this.hp = 0;
            else
                this.hp = this.hp - 1;
        }
    }
}
