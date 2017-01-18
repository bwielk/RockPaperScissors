package example.codeclan.com.paperscissorsrock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class RPSActivity extends AppCompatActivity {

    Button scissors;
    Button rock;
    Button paper;
    Intent intent;
    Random random = new Random();
    TextView displayResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);
        displayResult = (TextView)findViewById(R.id.result);

        scissors = (Button)findViewById(R.id.scissors);
        rock = (Button)findViewById(R.id.rock);
        paper = (Button)findViewById(R.id.paper);


//        intent = new Intent(RPSActivity.this, ResultActivity.class);

        Log.d(getClass().toString(), "WORKING ON THAT");
    }

    public void pushRock(View button){
        Log.d(getClass().toString(), "ROCK");
        int computerChoice = random.nextInt(3) + 1;
        Game rock = new Game();
        String result = rock.runGame(1, computerChoice);
        displayResult.setText(result);
//        intent.putExtra("answer", result);
//        startActivity(intent);
    }

    public void pushPaper(View button) {
        Log.d(getClass().toString(), "PAPER");
        int computerChoice = random.nextInt(3) + 1;
        Game rock = new Game();
        String result = rock.runGame(2, computerChoice);
        displayResult.setText(result);
    }

    public void pushScissors(View button) {
        Log.d(getClass().toString(), "SCISSORS");
        int computerChoice = random.nextInt(3) + 1;
        Game rock = new Game();
        String result = rock.runGame(3, computerChoice);
        displayResult.setText(result);
    }


}
