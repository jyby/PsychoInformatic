package cl.lejyby.larana;
import java.util.Random;

/**
 * Created by jbarbay on 11/05/15.
 */
public class Deck {
    int nbFlashCards;
    FlashCard[] flashCard;
    final Random rand = new Random();

    FlashCard pickAFlashCard() {
        if(nbFlashCards>0) {
            int index = rand.nextInt(nbFlashCards);
            return flashCard[index];
        } else
            return null;
    }
}
