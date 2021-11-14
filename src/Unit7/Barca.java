package Unit7;

import java.io.Serializable;

public class Barca implements Serializable {
    private int matches;

    public int getMatches() {
        return matches;
    }

    public Barca(int matches) {
        this.matches = matches;
    }
}
