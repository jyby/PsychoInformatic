package cl.lejyby.larana;

import android.test.InstrumentationTestCase;

/** QuestionTest: methods to test the correct implementation of the Question class.
 * Created by jbarbay on 19/05/15.
 */
public class QuestionTest extends InstrumentationTestCase {

    Question testQuestionWithNegativeAnswer() {
        return new Question("FlashCard 1, Side A","Flashcard 2, Side B",Boolean.FALSE);
    }

    Question testQuestionWithPositiveAnswer() {
        return new Question("FlashCard 1, Side A","Flashcard 1, Side B",Boolean.TRUE);
    }

    void testQuestionGetLeft()  throws Exception {
        Question q = new Question("Side A","Side B",Boolean.FALSE);
        assertEquals(q.getLeft(),"Side A");
    }
    void testQuestionGetRight()  throws Exception {
        Question q = new Question("Side A","Side B",Boolean.FALSE);
        assertEquals(q.getRight(),"Side B");
    }
}
