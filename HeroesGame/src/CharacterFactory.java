import java.util.HashMap;

public class CharacterFactory {
    public HashMap<Integer, Class<? extends Character>> choose;

    public CharacterFactory() {
        choose = new HashMap<>();
        choose.put(0, Hobbit.class);
        choose.put(1, Elf.class);
        choose.put(2, King.class);
        choose.put(3, Knight.class);

    }
}