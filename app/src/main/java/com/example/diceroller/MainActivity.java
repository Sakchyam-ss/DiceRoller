package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

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

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Dice Rolled", Toast.LENGTH_SHORT).show();
                Dice dice = new Dice(6);
                int diceRoll = dice.roll();
                textView.setText(Integer.toString(diceRoll));


            }
        });

    }
}