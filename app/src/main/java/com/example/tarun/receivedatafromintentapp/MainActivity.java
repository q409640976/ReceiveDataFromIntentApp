package com.example.tarun.receivedatafromintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtEnqNo = findViewById(R.id.txtEnqNo);
        TextView txtApplicantName = findViewById(R.id.txtApplicantName);
        TextView txtSubmit = findViewById(R.id.txtSubmit);
        if (getIntent() != null && getIntent().getExtras() != null) {
            if (getIntent().getExtras().getString("enqNo")!=null)
                txtEnqNo.setText(getIntent().getExtras().getString("enqNo"));
            if (getIntent().getExtras().getString("applicantName")!=null)
                txtApplicantName.setText(getIntent().getExtras().getString("applicantName"));
            if (getIntent().getExtras().getString("pmayRequestCode")!=null)
                txtSubmit.setText(getIntent().getExtras().getString("pmayRequestCode"));
        }
    }
}
