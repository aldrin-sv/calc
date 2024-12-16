package com.example.calc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class divActivity extends AppCompatActivity {

    EditText et7,et8;
    Button btn7,btn8;
    String res,gNum1,gNum2;
    int n1,n2,s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);
        btn7=(Button) findViewById(R.id.db1);
        btn8=(Button) findViewById(R.id.db2);

        et7=(EditText) findViewById(R.id.dn1);
        et8=(EditText) findViewById(R.id.dn2);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gNum1=et7.getText().toString();
                gNum2=et8.getText().toString();
                n1=Integer.parseInt(gNum1);
                n2=Integer.parseInt(gNum2);
                s1=n1/n2;
                res=String.valueOf(s1);
                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob4=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob4);
            }
        });
    }
}