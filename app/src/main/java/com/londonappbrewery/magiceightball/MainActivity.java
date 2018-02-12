package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // connecting java code with xml ids

        Button buttonclick = (Button)findViewById(R.id.clickbutton);
        final TextView textshow = (TextView)findViewById(R.id.textView2);
        //creating option to show differrnt text
        final int [] textarray = new int[] {
                R.string.option1,
                R.string.option2,
                R.string.option3,
                R.string.option4,
                R.string.option5

        };
        // creating click on button

        buttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomgenerator = new Random();
                int randomno = randomgenerator.nextInt(5);

                textshow.setText(textarray[randomno]);




            }
        });







    }
}
