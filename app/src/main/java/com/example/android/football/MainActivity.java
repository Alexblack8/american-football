package com.example.android.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

int point_for_A=0;
int point_for_B=0;
TextView ScoreTeamA,ScoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addsixforteamA(View v){
        point_for_A=point_for_A+6;
        displayForTeamA(point_for_A);}


    public void addThreeforteamA(View v){
        point_for_A=point_for_A+3;
        displayForTeamA(point_for_A);}

    public void addtwoforteamA(View v){
        point_for_A=point_for_A+2;
        displayForTeamA(point_for_A);
    }
    public void addzeroforteamA(View v){
        point_for_A=point_for_A-1;
        displayForTeamA(point_for_A);
    }


    public void addsixforteamB(View v){
        point_for_B=point_for_B+6;
        displayForTeamB(point_for_B);
    }
    public void addThreeforteamB(View v){
        point_for_B=point_for_B+3;
        displayForTeamB(point_for_B);
    }
    public void addtwoforteamB(View v){
        point_for_B=point_for_B+2;
        displayForTeamB(point_for_B);
    }
    public void addzeroforteamB(View v){
        point_for_B=point_for_B-1;
        displayForTeamB(point_for_B);
    }


    public void resetScore(View v){
        displayForTeamA(0);
        displayForTeamB(0);
        point_for_A=0;
        point_for_B=0;

    }

    private void displayForTeamA(int number){
        ScoreTeamA= (TextView) findViewById(R.id.team_a_score);
        ScoreTeamA.setText("" +number);
    }

    private void displayForTeamB(int number){
        ScoreTeamB= (TextView) findViewById(R.id.team_b_score);
        ScoreTeamB.setText("" +number);
    }
}
