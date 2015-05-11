package cl.lejyby.larana;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class Game extends ActionBarActivity {

    float y_coordinate = 0;
    float y_coordinate_increment = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button button_joker = (Button) findViewById(R.id.button_joker);
        Button button_validate = (Button) findViewById(R.id.button_validate);
        Button button_reject = (Button) findViewById(R.id.button_reject);
        Button button_flag = (Button) findViewById(R.id.button_flag);
        final TextView sideA = (TextView) findViewById(R.id.flashcard_side_A);
        final TextView sideB = (TextView) findViewById(R.id.flashcard_side_B);
        sideA.setY(y_coordinate);
        sideB.setY(y_coordinate);

        button_joker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y_coordinate += y_coordinate_increment;
                sideA.setY(y_coordinate);
            }
        });
        button_reject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideA.setText("0");
            }
        });
        button_validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideA.setText("0");
            }
        });
        button_flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideA.setText("0");
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
