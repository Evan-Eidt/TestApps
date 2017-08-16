package com.example.evanm.testapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImportantLinksPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_links_page);
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

    public void goToCHS (View view) {
        goToUrl ( "https://sites.google.com/a/chelsea.k12.mi.us/chelseahigh/");
    }

    public void goToPS (View view) {
        goToUrl ( "https://ps1.chelsea.k12.mi.us/public/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}


