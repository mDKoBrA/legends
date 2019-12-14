package com.example.legends.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.legends.MainActivity;
import com.example.legends.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegisterActivity extends AppCompatActivity {

    private EditText password;
    private EditText confirmPassword;
    private EditText email;
    private Button register;
    private TextView tv_signin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        password = findViewById(R.id.et_password);
        confirmPassword = findViewById(R.id.et_confirm_password);
        email = findViewById(R.id.et_email);
        register = findViewById(R.id.btn_register);
        tv_signin = findViewById(R.id.tv_signin);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });

        tv_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(j);
            }
        });
    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    public static boolean isValidPassword(String password) {
        Matcher matcher = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,20})").matcher(password);
        return matcher.matches();
    }

    void checkDataEntered() {
        if (isEmpty(password)) {
            Toast t = Toast.makeText(this, "You must enter password to register!", Toast.LENGTH_SHORT);
            t.show();
        }
        if (isEmpty(confirmPassword)) {
            confirmPassword.setError("Enter your confirmation password");

            if (!password.equals(confirmPassword)) {
                Toast.makeText(RegisterActivity.this, "Password do not match", Toast.LENGTH_SHORT).show();
            }
        }

        if (!isEmail(email)) {
            email.setError("Enter valid email!");
        } else if (!isValidPassword(password.getText().toString())) {
            password.setError("Password must contain mix of upper and lower case letters as well as digits and one special charecter(6-20)");
        }

    }
}