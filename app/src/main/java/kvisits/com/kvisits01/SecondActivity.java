package kvisits.com.kvisits01;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button bgray,byellow,bgreen,blist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bgray = findViewById(R.id.btn_gray);
        byellow = findViewById(R.id.btn_yellow);
        bgreen = findViewById(R.id.btn_green);
        blist = findViewById(R.id.btn_list);
        bgray.setOnClickListener(this);
        byellow.setOnClickListener(this);
        bgreen.setOnClickListener(this);
        blist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_gray:
                ConstraintLayout rl = findViewById(R.id.constraintto);
                rl.setBackgroundColor(Color.GRAY);
                break;
            case R.id.btn_yellow:
                ConstraintLayout r2 = findViewById(R.id.constraintto);
                r2.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.btn_green:
                ConstraintLayout r3= findViewById(R.id.constraintto);
                r3.setBackgroundColor(Color.GREEN);
                break;
            case R.id.btn_list:
                Intent i;
                i = new Intent(SecondActivity.this,StartActivity.class);
                startActivity(i);
                break;
        }

    }
}
