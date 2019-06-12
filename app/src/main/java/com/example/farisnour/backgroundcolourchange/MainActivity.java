package com.example.farisnour.backgroundcolourchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.farisnour.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = findViewById(R.id.viewText);

        String message = getMessage(LocalDate.now());

        textView.setText(message);
//        intent.putExtra(EXTRA_MESSAGE, "RamadanDate: " + ramadan.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\ncurrent date: " + today.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\ndifference: " + difference);
//        intent.putExtra("com.example.farisnour.MESSAGE2", message);
//        startActivity(intent);
    }

    public static String getMessage(LocalDate today) {
        LocalDate ramadan = LocalDate.of(2019, 5, 6);

        int difference = ramadan.getDayOfYear() - today.getDayOfYear();

        if (difference > 0) {
            return "There are " + difference + " days until Ramadan :)";
        }
        else if (difference > -30 && difference <= 0) {
            return "Day " + (1 - difference) + " of Ramadan";
        }
        else {
            return "Ramadan is now over :(";
        }
    }

}
