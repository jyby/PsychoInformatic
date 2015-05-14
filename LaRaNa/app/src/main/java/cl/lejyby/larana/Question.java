package cl.lejyby.larana;

/** Question Class
 * For now, binary question extracted from two flash cards.
 * Created by jbarbay on 11/05/15.
 */
import java.util.Random;

public class Question {
    String left;
    String right;
    Boolean expectedCorrectness;
    public final Random rand = new Random();

    public Question(String left, String right, Boolean b) {
        this.left = left;
        this.right = right;
        expectedCorrectness = b;
    }

    public Question(FlashCard left, FlashCard right) {
        int r = rand.nextInt(4);
        switch(r) {
            case 0:
                this.left = left.getFace(0);
                this.right = left.getFace(1);
                expectedCorrectness=Boolean.TRUE;
            case 1:
                this.left = right.getFace(0);
                this.right = right.getFace(1);
                expectedCorrectness=Boolean.TRUE;
            case 2:
                this.left = left.getFace(0);
                this.right = right.getFace(1);
                expectedCorrectness=Boolean.FALSE;
            case 3:
                this.left = right.getFace(0);
                this.right = left.getFace(1);
                expectedCorrectness=Boolean.FALSE;
        }
    }

    public String getLeft() {
        return this.left;
    }
    public String getRight() {
        return this.right;
    }
}
