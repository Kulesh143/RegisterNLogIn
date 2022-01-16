package com.kulesh.myapplicationregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void reg(View view) {
        EditText name=findViewById(R.id.name);
        EditText password=findViewById(R.id.password);
        EditText email=findViewById(R.id.email);
        EditText mobile=findViewById(R.id.mobile);
        RadioButton male=findViewById(R.id.male);
        RadioButton female=findViewById(R.id.female);
        if(name.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Name required", Toast.LENGTH_SHORT).show();
        }else if(password.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Password required", Toast.LENGTH_SHORT).show();
        }else if(email.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Email required", Toast.LENGTH_SHORT).show();
        }else if(mobile.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Mobile required", Toast.LENGTH_SHORT).show();
        }else if(!male.isChecked()&&!female.isChecked()){
            Toast.makeText(getApplicationContext(), "Select Gender", Toast.LENGTH_SHORT).show();
        }else {
            User u=new User(name.getText().toString(),password.getText().toString(),mobile.getText().toString(),email.getText().toString(),null);
            if(male.isChecked()){
                u.setGender("Male");
            }else if(female.isChecked()){
                u.setGender("Female");
            }
            User.userslist.add(u);
            Toast.makeText(getApplicationContext(), "Successfully Registered!", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,LoginActivity.class);
            startActivity(i);
        }
    }
}