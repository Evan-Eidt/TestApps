package com.example.evanm.testapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);

        Button menuButton = (Button) findViewById(R.id.menuButton);

            menuButton.setOnClickListener(new View.OnClickListener() {

           @Override

          public void onClick(View v) {

                goToMenu();

            }

        });
}
    private void goToMenu() {

        Intent intent = new Intent(this, MenuScreen.class);

        startActivity(intent);

    }
}
