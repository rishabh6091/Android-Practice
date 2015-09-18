package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int points = 0;
    int pointsTeamB = 0;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void threePointer(View view)
    {
        points = points + 3;
        display(points);
    }
    public void twoPointer(View view)
    {
        points = points +2;
        display(points);
    }
    public void onePointer(View view)
    {
        points = points +1;
        display(points);
    }
    private void display(int score)
    {
        TextView pointsView = (TextView) findViewById(R.id.pointsTextView);
        pointsView.setText("" + score);
    }
    public void threePointerTeamB(View view)
    {
        pointsTeamB = pointsTeamB + 3;
        displayTeamB(pointsTeamB);
    }
    public void twoPointerTeamB(View view)
    {
        pointsTeamB = pointsTeamB +2;
        displayTeamB(pointsTeamB);
    }
    public void onePointerTeamB(View view)
    {
        pointsTeamB = pointsTeamB +1;
        displayTeamB(pointsTeamB);
    }
    private void displayTeamB(int score)
    {
        TextView pointsView = (TextView) findViewById(R.id.pointsTextViewTeamB);
        pointsView.setText("" + score);
    }
    public void resetScore(View view)
    {
        pointsTeamB = 0;
        points = 0;
        display(points);
        displayTeamB(pointsTeamB);
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
