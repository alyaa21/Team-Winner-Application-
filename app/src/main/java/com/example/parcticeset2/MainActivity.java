package com.example.parcticeset2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
int team_a=0,team_b=0;
        Button A3,A2,A1,B3,B2,B1,Res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A3=findViewById(R.id.A_3);
        A3.setOnClickListener(this);
        A2=findViewById(R.id.A_2);
        A2.setOnClickListener(this);
        A1=findViewById(R.id.A_1);
        A1.setOnClickListener(this);
        B3=findViewById(R.id.B_3);
        B3.setOnClickListener(this);
        B2=findViewById(R.id.B_2);
        B2.setOnClickListener(this);
        B1=findViewById(R.id.B_1);
        B1.setOnClickListener(this);
        Res=findViewById(R.id.reset_button);
        Res.setOnClickListener(this);


    }


    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */


    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");
    }



    public void display2(int score_b) {
        TextView t = (TextView) findViewById(R.id.display_text_view2);
        t.setText(score_b+"");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.A_3:
                team_a+=3;
                display(team_a);
                break;
            case R.id.A_2:
                team_a+=2;
                display(team_a);
                break;
            case R.id.A_1:
                team_a+=1;
                display(team_a);
                break;
            case R.id.B_3:
                team_b+=3;
                display2(team_b);
                break;
            case R.id.B_2:
                team_b+=2;
                display2(team_b);
                break;
            case R.id.B_1:
                team_b+=1;
                display2(team_b);
                break;
            case R.id.reset_button:
                team_a=0;
                team_b=0;
                display(team_a);
                display2(team_b);
                break;
        }

    }
}