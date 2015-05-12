package cl.lejyby.larana;
import java.util.Random;

/**
 * Created by jbarbay on 11/05/15.
 */
public class FlashCard {
    private int id;
    private String[] face;
    public final Random rand = new Random();

    public FlashCard() {
        this.face = new String[2];
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
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
