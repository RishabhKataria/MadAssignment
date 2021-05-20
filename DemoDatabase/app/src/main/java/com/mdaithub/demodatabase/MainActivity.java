package com.mdaithub.demodatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nameText, phoneText, emailText, passText;

    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText=findViewById(R.id.nameText);
        phoneText=findViewById(R.id.mobileText);
        passText=findViewById(R.id.passText);
        emailText=findViewById(R.id.emailText);
        saveButton=findViewById(R.id.saveButton);

        saveButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.saveButton)
        {
            MyDBHelper ob=new MyDBHelper(this);

            SQLiteDatabase db=ob.getWritableDatabase(); //for insert, update, delete
            //SQLiteDatabase db=ob.getReadableDatabase(); //for select
            ContentValues cv=new ContentValues();
            cv.put("name", nameText.getText().toString());
            cv.put("email", emailText.getText().toString());
            cv.put("phone", phoneText.getText().toString());
            cv.put("password", passText.getText().toString());
            long i=db.insert("UserDetails",null, cv);
            if(i>0)
            {
                Toast.makeText(this, "Record Inserted!!", Toast.LENGTH_SHORT).show();
                nameText.setText("");
                phoneText.setText("");
                emailText.setText("");
                passText.setText("");
                //Intent
            }
            else
            {
                Toast.makeText(this, "Record Not Inserted!!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}