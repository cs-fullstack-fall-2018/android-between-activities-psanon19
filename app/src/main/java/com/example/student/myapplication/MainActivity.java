package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private Button winButton;
    private int value = 0;
    public static final String EXTRA_MESSAGE =
            "com.example.student.myapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = (TextView)findViewById(R.id.number_counter);
        winButton = (Button)findViewById(R.id.button_win);
    }

    public void findWinner(View view) {


        String lose = "YOU DIE";
        String win = "YOU WIN";
        if (value<=5){
            winButton.setText(lose);
            counter.setText((value-value)+"");
            value = 0;
        }
        else{
            winButton.setText(win);
            counter.setText((value-value)+"");
            value = 0;
        }
    }

    public void iterator(View view) {
        counter.setText(++value+"");
    }
}
