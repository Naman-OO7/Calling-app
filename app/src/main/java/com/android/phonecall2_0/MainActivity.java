package com.android.phonecall2_0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=findViewById(R.id.edit);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = edit.getText().toString();
               if (number.isEmpty()){
                   Toast.makeText(MainActivity.this, "Please Enter the Number", Toast.LENGTH_SHORT).show();
               }else{
                   String s = "tel:"+ number;
                   Intent intent = new Intent(Intent.ACTION_CALL);
                   intent.setData(Uri.parse(s));
                   startActivity(intent);
               }
            }
        });

    }
}