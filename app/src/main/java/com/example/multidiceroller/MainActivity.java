package com.example.multidiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textView2;

    private TextView textView3;
    public class Dice {
        private int numSides;
        public Dice(int numSides)
        {
            this.numSides = numSides;
        }
        public int roll ()
        {
            return (int) (Math.random()*6) +1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView= findViewById(R.id.textView);
        textView2= findViewById(R.id.textView2);
        textView3= findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "3 Dices Rolled", Toast.LENGTH_SHORT).show();

                Dice dice = new Dice(6);
                int diceRoll = dice.roll();
                textView.setText(Integer.toString(diceRoll));

                Dice dice2 = new Dice(6);
                int diceRoll2 = dice2.roll();
                textView2.setText(Integer.toString(diceRoll2));

                Dice dice3 = new Dice(6);
                int diceRoll3 = dice3.roll();
                textView3.setText(Integer.toString(diceRoll3));
            }
        });

    }
}