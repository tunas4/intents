package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView buttonGoogle = findViewById(R.id.button5);

        buttonGoogle.setOnClickListener(
                v -> click_google()
        );

        TextView buttonTwitter = findViewById(R.id.button6);

        buttonTwitter.setOnClickListener(
                v -> click_twitter()
        );

        TextView buttonYoutube = findViewById(R.id.button4);

        buttonYoutube.setOnClickListener(
                v -> click_youtube()
        );

        TextView buttonIntent1 = findViewById(R.id.button);

        buttonIntent1.setOnClickListener(
                v -> click_intent1()
        );

        TextView buttonIntent2 = findViewById(R.id.button2);

        buttonIntent2.setOnClickListener(
                v -> click_intent2()
        );

        TextView buttonIntent3 = findViewById(R.id.button3);

        buttonIntent3.setOnClickListener(
                v -> click_intent3()
        );
    }
    public void click_google ()
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        startActivity(intent);
    }
    public void click_twitter ()
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.twitter.com"));
        startActivity(intent);
    }
    public void click_youtube ()
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com"));
        startActivity(intent);
    }
    public void click_intent1()
    {
        Intent intent = new Intent(MainActivity.this, Intent1.class);
        startActivity(intent);
    }
   public void click_intent2()
   {
       Intent intent = new Intent(MainActivity.this, intent2.class);
       startActivity(intent);
   }
   public  void click_intent3()
   {
       Intent intent = new Intent(MainActivity.this, intent3.class);
       startActivity(intent);
   }

}