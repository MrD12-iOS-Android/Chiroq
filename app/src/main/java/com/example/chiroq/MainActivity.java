package com.example.chiroq;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.hardware.Camera;
import android.os.Bundle;
import android.service.media.CameraPrewarmService;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    private FlashClass flashClass;
    ImageButton btn_on,btn_off;
    ConstraintLayout back_ground;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Here ID
        init();





    }
    public void init(){

        btn_on = findViewById(R.id.on);
        flashClass = new FlashClass(this);
        back_ground = findViewById(R.id.back_ground);
        textView = findViewById(R.id.text);
    }



    @SuppressLint("ResourceType")
    public void On(View view) {
        if (flashClass.isFlash_status())
        {
            flashClass.flashOff();
            btn_on.setBackgroundResource(R.drawable.start);
            back_ground.setBackgroundColor(Color.BLACK);
            textView.setText("O'chiq");
            textView.setTextColor(Color.RED);
        }else{
            flashClass.flashOn();
            btn_on.setBackgroundResource(R.drawable.end);
            textView.setText("Yoniq");
            textView.setTextColor(Color.BLUE);
            back_ground.setBackgroundColor(Color.BLACK);
        }


    }

}