package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int totalSocreOfTeamA = 0;
    int totalSocreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTheSocreForTeamA();
        showTheSocreForTeamB();
    }

    public void didClickOn3PointsForTeamA(View view){
        totalSocreOfTeamA += 3;
        showTheSocreForTeamA();
    }

    public void didClickOn2PointsForTeamA(View view){
        totalSocreOfTeamA += 2;
        showTheSocreForTeamA();
    }

    public void didClickOnThrowForTeamA(View view){
        totalSocreOfTeamA += 1;
        showTheSocreForTeamA();
    }

    public void didClickOn3PointsForTeamB(View view){
        totalSocreOfTeamB += 3;
        showTheSocreForTeamB();
    }

    public void didClickOn2PointsForTeamB(View view){
        totalSocreOfTeamB += 2;
        showTheSocreForTeamB();
    }

    public void didClickOnThrowForTeamB(View view){
        totalSocreOfTeamB += 1;
        showTheSocreForTeamB();
    }

    public void didClickOnReset(View view){
        totalSocreOfTeamA = 0;
        totalSocreOfTeamB = 0;
        showTheSocreForTeamA();
        showTheSocreForTeamB();
    }

    public void showTheSocreForTeamA(){
        TextView textView = (TextView)findViewById(R.id.text_view_totalScoreTeamA);
        textView.setText("" + totalSocreOfTeamA);
    }
    public void showTheSocreForTeamB(){
        TextView textView = (TextView)findViewById(R.id.text_view_totalScoreTeamB);
        textView.setText("" + totalSocreOfTeamB);
    }
}
