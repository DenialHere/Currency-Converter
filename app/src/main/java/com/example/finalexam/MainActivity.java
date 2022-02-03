package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {

        email = findViewById(R.id.editTextTextEmail);
        password = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.buttonLogin);

        if (email.getText().toString().equals("alex@gmail.com") && password.getText().toString().equals("1234"))
        {
            Intent intent = new Intent(this, CurrencyConverter.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"Invalid email or password.",Toast.LENGTH_SHORT).show();
        }

}
}