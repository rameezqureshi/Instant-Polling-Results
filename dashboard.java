package com.example.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends Activity implements View.OnClickListener {


    Button btn_profile, btn_create, btn_liveresults, btn_membership, btn_about, btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn_profile = (Button) findViewById(R.id.Profile);
        btn_create = (Button) findViewById(R.id.Polls);
        btn_liveresults = (Button) findViewById(R.id.liveresults);
        btn_membership = (Button) findViewById(R.id.memberships);
        btn_about = (Button) findViewById(R.id.aboutus);
        btn_logout = (Button) findViewById(R.id.logout);
        btn_profile.setOnClickListener(this);
        btn_create.setOnClickListener(this);
        btn_liveresults.setOnClickListener(this);
        btn_membership.setOnClickListener(this);
        btn_about.setOnClickListener(this);
        btn_logout.setOnClickListener(this);


   /* btn_profile = (Button) findViewById(R.id.Profile);
    btn_profile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // do the "on click" action here
            Intent i ;
            switch (v.getId()) {
                case R.id.Profile : i = new Intent (dashboard.this, profile.class);startActivity(i); break;
                case R.id.Polls: i = new Intent (dashboard.this,tabviewlayout.class);startActivity(i); break;
                case R.id.liveresults: i = new Intent(dashboard.this,LoginActivity.class); startActivity(i); break;
                default:break;
        }}
    });
                                   }*/

    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.Profile:
                i = new Intent(dashboard.this, profile.class);
                startActivity(i);
                break;
            case R.id.Polls:
                i = new Intent(dashboard.this, PollContest.class);
                startActivity(i);
                break;
            case R.id.liveresults:
                i = new Intent(dashboard.this, MainTab  .class);
                startActivity(i);
                break;
            default:
                break;


        }
    }
}