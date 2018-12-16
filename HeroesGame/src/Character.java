public abstract class Character {
    public int hp;
    public int power;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }
    public abstract void kick(Character c);

    public boolean isAlive(){
        if (hp > 0)
            return true;
        else
            return false;
    }

}
