package kvisits.com.kvisits01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText et_3, et_4;
    CheckBox cB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        et_3 = findViewById(R.id.editText3);
        et_4 = findViewById(R.id.editText4);
        cB = findViewById(R.id.checkBox);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kadi = et_3.getText().toString();
                String pass = et_4.getText().toString();
                if (cB.isChecked() &&kadi.equals("demo") && pass.equals("12345")) {
                    Intent i;
                    i = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), "Şifre Doğru.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Şifre Yanlış.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


}