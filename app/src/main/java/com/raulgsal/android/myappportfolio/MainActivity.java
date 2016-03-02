package com.raulgsal.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    //When user click button launch a Toast message
    public void showToast(View view){

        Context context = getApplicationContext();
        Button button = (Button) view;
        String buttonText = (String)button.getText();

        String toastText;

        if(buttonText.contains("App")){
            toastText = "This button will launch my " + buttonText + "!";
        } else {
            toastText = "This button will launch my " + buttonText + " App!";
        }

        //Cancel previous Toast
        if(toast != null){
            toast.cancel();
        }

        //Show new Toast
        toast = Toast.makeText(context,toastText,Toast.LENGTH_SHORT);
        toast.show();

    }


}
