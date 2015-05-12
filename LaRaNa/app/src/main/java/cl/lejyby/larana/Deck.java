package cl.lejyby.larana;
import java.util.Random;

/**
 * Created by jbarbay on 11/05/15.
 */
public class Deck {
    FlashCard[] flashCard;
    final Random rand = new Random();
    final int x_min = 2;
    final int x_max = 9;
    final int y_min = 2;
    final int y_max = 9;

    public Deck() {
        flashCard = new FlashCard[(x_max - x_min + 1) * (y_max - y_min + 1)];
        for (int x = x_min; x <= x_max; x++) {
            for (int y = y_min; y <= y_max; y++) {
                flashCard[(x - x_min) * (y - y_min)] = new FlashCard(x, y);
            }
        }
    }


    FlashCard pickAFlashCard() {
        if (flashCard.length > 0) {
            int index = rand.nextInt(flashCard.length);
            return flashCard[index];
        } else
            return null;
    }

    boolean match(String faceLeft, String faceRight) {
        // Check if there is a line of the database containing face1 and face2
        for (int i = 0; i < flashCard.length; i++) {
            FlashCard card = flashCard[i];
            String face0 = card.getFace(0);
            String face1 = card.getFace(1);
            if ((face1.matches(faceLeft) && face0.matches(faceRight)) ||
                    (face0.matches(faceLeft) && face1.matches(faceRight)))
                return true;
        }
        return false;
    }
}
