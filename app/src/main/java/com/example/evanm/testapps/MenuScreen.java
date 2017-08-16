package com.example.evanm.testapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        ImageButton links = (ImageButton) findViewById(R.id.important_links);

        links.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToLinks();

            }

        });

        ImageButton home = (ImageButton) findViewById(R.id.home);

            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    goToHome();

        }

    });

        ImageButton calendar = (ImageButton) findViewById(R.id.calendar);

            calendar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    goToCalendar();

                }

    });
}
    private void goToCalendar() {

        Intent intent = new Intent(this, CalendarPage.class);

        startActivity(intent);

    }
    private void goToLinks() {

        Intent intent = new Intent(this, ImportantLinksPage.class);

        startActivity(intent);

    }
    private void goToHome() {

        Intent intent = new Intent(this, SchoolHome.class);

        startActivity(intent);

    }
}

