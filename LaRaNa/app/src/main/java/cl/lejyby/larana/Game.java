package cl.lejyby.larana;

import java.util.Random;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class Game extends ActionBarActivity {

//    Deck deck;
    Question question;
    public final Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final Button button_joker = (Button) findViewById(R.id.button_joker);
        final Button button_validate = (Button) findViewById(R.id.button_validate);
        final Button button_reject = (Button) findViewById(R.id.button_reject);
        final Button button_flag = (Button) findViewById(R.id.button_flag);
        final TextView sideA = (TextView) findViewById(R.id.flashcard_side_A);
        final TextView sideB = (TextView) findViewById(R.id.flashcard_side_B);

//        this.deck = new Deck();
        question = new Question();

        button_joker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                question = deck.pickAQuestion();
                question = new Question();
                sideA.setText(question.getLeft());
                sideB.setText(question.getRight());
            }
        });
        button_reject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question = new Question();
                sideA.setText(question.getLeft());
                sideB.setText(question.getRight());
          }
        });
        button_validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question = new Question();
                sideA.setText(question.getLeft());
                sideB.setText(question.getRight());
            }
        });
        button_flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question = new Question();
                sideA.setText(question.getLeft());
                sideB.setText(question.getRight());
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
