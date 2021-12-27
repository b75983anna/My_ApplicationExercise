package com.example.myapplicationexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class End_Activity extends AppCompatActivity {

    private Button exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        exitBtn = (Button) findViewById(R.id.exit_Button);

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Intent ActivityEnd = new Intent(getApplicationContext(), End_Activity.class);
                ActivityEnd.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ActivityEnd.putExtra("EXIT", true);
                startActivity(ActivityEnd);*/

                finish();
                System.exit(0);
            }
        });

    }
}