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
        ImageButton links = (ImageButton) findViewById(R.id.importantLinks);

        links.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToLinks();

            }

        });
    }
    private void goToLinks() {

        Intent intent = new Intent(this, ImportantLinksPage.class);

        startActivity(intent);

    }
}

