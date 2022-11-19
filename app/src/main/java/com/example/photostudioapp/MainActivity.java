package com.example.photostudioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] names = {"Dr. C.V. Raman","Radhakrishnan Venkataramanan",
            "S Chandrashekhar","Sir M.Visvesvaraya"," A.P.J Abdul Kalam"};
    Button prev, next;
    ImageView pic;
    TextView text;
    int currentimage = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev (View view){

        String idx = "pic" + currentimage;
        int x = this.getResources().getIdentifier(idx,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentimage = (5 + currentimage-1) % 5;
        String idy = "pic" + currentimage;
        int y = this.getResources().getIdentifier(idy,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        text.setText(names[currentimage]);
    }

    public void next (View view){
        text = findViewById(R.id.textcv);

        String idx = "pic" + currentimage;
        int x = this.getResources().getIdentifier(idx,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentimage = (currentimage+1) % 5;
        String idy = "pic" + currentimage;
        int y = this.getResources().getIdentifier(idy,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentimage]);

    }
}