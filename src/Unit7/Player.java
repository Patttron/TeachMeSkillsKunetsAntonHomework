package Unit7;

import java.io.Serializable;

public class Player extends Barca implements Serializable {
    private String name;

    public Player(int matches, String name) {
        super(matches);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player from Barcelona has " + getMatches() +
                " matches. His name is " + name + ".";
    }
}