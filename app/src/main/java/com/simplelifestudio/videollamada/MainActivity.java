package com.simplelifestudio.videollamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button RCButton;
    private Button IVButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();




    }




    private void init() {

        RCButton = findViewById(R.id.mainbutRBT);
        IVButton = findViewById(R.id.mainIvanBT);


        RCButton.setOnClickListener(this);
        IVButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.mainbutRBT:
                startActivity(new Intent(getApplicationContext(),RichardVideo.class));
            break;

            case R.id.mainIvanBT:
                startActivity(new Intent(getApplicationContext(),IvanLlamada.class));
             break;
        }
    }
}
