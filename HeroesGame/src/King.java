public class King extends Character {
    public King() {
        super(5, 15);
    }
    public void kick(Character other) {
        if (other.power < this.power) {
            System.out.println("King win");
            if (hp < 0)
                other.hp = 0;
            else
                other.hp = other.hp - this.power;
        } else {
            if (hp < 0)
                this.hp = 0;
            else
                this.hp = this.hp - 1;
        }
    }
}