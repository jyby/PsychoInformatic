package cl.lejyby.larana;
import java.util.Random;

/** FlashCard: structure for a flashcard with multiple faces.
 * Created by jbarbay on 11/05/15.
 */
public class FlashCard {
    private int id;
    private String[] face;
    public final Random rand = new Random();
    final int x_min = 5;
    final int x_max = 9;
    final int y_min = 5;
    final int y_max = 9;

    public FlashCard() {
        this.face = new String[2];
        int x = x_min + rand.nextInt(x_max-x_min);
        int y = y_min + rand.nextInt(y_max-y_min);
        this.face[0] = Integer.toString(x)+"*"+Integer.toString(y);
        this.face[1] = Integer.toString(x*y);
    }
    public FlashCard(int x, int y) {
        this.face = new String[2];
        this.face[0] = Integer.toString(x)+"*"+Integer.toString(y);
        this.face[1] = Integer.toString(x*y);
    }
    public FlashCard(String faceA, String faceB) {
        this.face = new String[2];
        this.face[0] = faceA;
        this.face[1] = faceB;
    }
    public FlashCard(int id, String faceA, String faceB) {
        this.face = new String[2];
        this.face[0] = faceA;
        this.face[1] = faceB;
        this.id = id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public void setFaces(String[] face) {
        this.face = face;
    }

    public String[] getFaces() {
        return this.face;
    }

    public String getFace(int i) {
        return this.face[i];
    }

}
