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
    final int x_min = 5;
    final int x_max = 9;
    final int y_min = 5;
    final int y_max = 9;


    public Question() {
        int x = x_min + rand.nextInt(x_max-x_min);
        int y = y_min + rand.nextInt(y_max-y_min);
        expectedCorrectness = rand.nextBoolean();
        if (expectedCorrectness) {
            this.left = Integer.toString(x) + "*" + Integer.toString(y);
            this.right = Integer.toString(x * y);
        } else {
            int r = rand.nextInt(4);
            if (r == 0) {
                this.left = Integer.toString(x+1) + "*" + Integer.toString(y);
                this.right = Integer.toString(x * y);
            } else if (r == 1) {
                this.left = Integer.toString(x) + "*" + Integer.toString(y+1);
                this.right = Integer.toString(x * y);
            } else if (r == 2) {
                this.left = Integer.toString(x) + "*" + Integer.toString(y);
                this.right = Integer.toString((x+1) * y);
            } else if (r == 3) {
                this.left = Integer.toString(x) + "*" + Integer.toString(y);
                this.right = Integer.toString(x * (y+1));
            }
        }
    }

//    public Question() {
//        this(new FlashCard(), new FlashCard());
//    }

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
