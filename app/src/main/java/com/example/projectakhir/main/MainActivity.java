package com.example.projectakhir.main;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;

import com.example.projectakhir.R;

public class MainActivity extends AppCompatActivity {

//    AppCompatActivity btn_success, btn_failed;
//
//    //Dialog Variables
//    AlertDialog.Builder builderDialog;
//    AlertDialog alertDialog;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        btn_success = (AppCompatActivity)findViewById(R.id.buttonSuccess);
//        btn_failed = (AppCompatActivity)findViewById(R.id.buttonFailed);
//
//        btn_success.setOnClikListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                showAlertDialog(R.layout.my_success_dialog);
//            }
//        });
//
//        btn_failed.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void setonClick(View view){
//                showAlertDialog(R.layout.my_failed_dialog);
//            }
//        });
//                private void showAlertDialog(int myLayout){
//            builderDialog = new AlertDialog.Builder( this);
//            View layoutView = getLayoutInflater().inflate(myLayout, null);
//
//            AppCompatButton dialogButton = layoutView.findViewById(R.id.buttonOk);
//            builderDialog.setView(layoutView);
//            alertDialog = builderDialog.create();
//            alertDialog.show();
//
//            //Click on Ok Button
//            dialogButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    //Dismiss Dialog
//                    alertDialog.dismiss();
//                }
//            });
//        }
//    }
}