package com.example.evanm.testapps;

import java.util.Calendar;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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

        Button newItem = (Button) findViewById(R.id.newItemButton);

        newItem.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                addCalendarEvent();

            }

        });
}

        public void addCalendarEvent(){

            Calendar cal = Calendar.getInstance();
            Intent intent = new Intent(Intent.ACTION_EDIT);
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra("beginTime", cal.getTimeInMillis());
            intent.putExtra("allDay", true);
            intent.putExtra("rrule", "FREQ=YEARLY");
            intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
            intent.putExtra("title", "A Test Event from android app");
            intent.putExtra("description", "A Test Description from android app");
            intent.putExtra("eventLocation", "Geolocation");
            startActivity(intent);

        }

    private void goToMenu() {

        Intent intent = new Intent(this, MenuScreen.class);

        startActivity(intent);

    }
}
