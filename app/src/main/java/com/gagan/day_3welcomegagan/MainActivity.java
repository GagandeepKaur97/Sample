package com.gagan.day_3welcomegagan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       TextView Name;
       Button Next;
       ImageView Image;
       ImageView Message;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (TextView)findViewById(R.id.etname);
        Next = (Button)findViewById(R.id.btnNext);
        Message = (ImageView) findViewById(R.id.Message);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if (Name.getText().toString().equals("Gagandeep") ) {
                   // Message.setTextColor(Color.GREEN);
                  //  Message.setText("login successful");
//            Toast.makeText(this,"success login",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name" , "Gagandeep");
                    startActivity(intent);
                } else {
                   // Message.setTextColor(Color.RED);
                   // Message.setText("failed");
                    showAlert();
//           Toast.makeText(this,"login failed",Toast.LENGTH_SHORT).show();
                }

            }


        });

    }private void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Login error");
        alertDialogBuilder.setMessage("Enter name");
        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"enter valid data",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog mAlertDialog = alertDialogBuilder.create();
        mAlertDialog.show();
    }


}

