package vn.edu.iuh.fit.se.android.lab08;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnRegister;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = findViewById(R.id.btnSignIn);
        btnRegister = findViewById(R.id.btnRegister);

        btnSignIn.setOnClickListener((view) -> {
            Intent intent = new Intent(this, SignIn.class);
            startActivity(intent);
        });

        btnRegister.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Register.class);
            startActivity(intent);
        });

    }
}