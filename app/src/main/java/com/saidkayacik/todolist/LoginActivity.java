package com.saidkayacik.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button loginbtn;
    String emails, passwords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginbtn = findViewById(R.id.button2);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emails = email.getText().toString();
                passwords = password.getText().toString();
                if (emails.equals("said@said.com") && passwords.equals("123123")) {
                    Toast.makeText(getApplicationContext(), " Successfully logged in.", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }else{

                    Toast.makeText(getApplicationContext(), " Email or password is incorrect, please try again.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
