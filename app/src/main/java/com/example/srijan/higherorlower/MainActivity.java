package com.example.srijan.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    String message;
    public void generaterandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
    public void guess(View view){

        EditText editText = (EditText) findViewById(R.id.editText);
        int guessValue = Integer.parseInt(editText.getText().toString());
        Log.i("Entered Value",editText.getText().toString());
        Log.i("Random Number",Integer.toString(randomNumber));

        if(guessValue < randomNumber)
        {
            message="Higher!";
        }
        else if(guessValue > randomNumber)
        {
            message="Lower!";
        }
        else
        {
            message="You Got it!! Try again.";
            generaterandomNumber();
        }
        Toast.makeText(this,message.toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generaterandomNumber();


    }
}
