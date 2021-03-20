package com.example.ptsgenap10rpl136;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtemail, txtpassword;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail =(EditText)findViewById(R.id.txtemail);
        txtpassword =(EditText)findViewById(R.id.txtpassword);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View onClick) {
                String email = txtemail.getText().toString();
                String password = txtpassword.getText().toString();
                if (email.equalsIgnoreCase("Zykha@gmail.com")
                        && password.equalsIgnoreCase("12345")){
                    Toast.makeText(MainActivity.this, "sukses Login", Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this, halamanutama.class);
                    move.putExtra("email", email);
                    startActivity(move);
                }else {
                    Toast.makeText(MainActivity.this, "gagal login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
