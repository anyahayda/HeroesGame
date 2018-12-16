public class Knight extends Character {
    public Knight() {
        super(5, 15);
    }
    public void kick(Character other) {
        if (other.power < this.power) {
            System.out.println("Knight win");
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
