package com.kulesh.myapplicationregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void login(View view) {
        EditText name=findViewById(R.id.name);
        EditText password=findViewById(R.id.password);
        if(name.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Name required", Toast.LENGTH_SHORT).show();
        }else if(password.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Password required", Toast.LENGTH_SHORT).show();
        }else{
           for(User u:User.userslist){
               if(u.getName().equals("Kulesh")&&u.getPassword().equals("143")){
                   Toast.makeText(getApplicationContext(), "Logged In!!!", Toast.LENGTH_SHORT).show();
               Intent i=new Intent(this,Home.class);
               i.putExtra("key","Kulesh Logged In!!!");
               startActivity(i);
               break;
               }
           }
        }

    }
}