package com.example.projectakhir.Activity.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.projectakhir.Activity.MenuActivity;
import com.example.projectakhir.Activity.main.MainActivity;
import com.example.projectakhir.R;
import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import retrofit2.http.POST;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    TextInputEditText inputEmail, inputPassword;
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin        = findViewById(R.id.btnLogin);
        inputEmail      = findViewById(R.id.input_email);
        inputPassword   = findViewById(R.id.input_password);
        progress        = findViewById(R.id.progress);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username, password;
                username     = String.valueOf(inputEmail.getText());
                password     = String.valueOf(inputPassword.getText());

                if (!username.equals("") && !password.equals("")){
                    progress.setVisibility(View.VISIBLE);
                    Handler handler = new Handler();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            String[] field = new String[2];
                            field[0]       = "username";
                            field[1]       = "password";

                            String[] data = new String[2];
                            data[0]       = username;
                            data[1]       = password;

                            PutData putData = new PutData("http://192.168.0.101/tree-ace-app/api-login.php/", "POST", field, data);

                            if (putData.startPut()){
                                if (putData.onComplete()){
                                    progress.setVisibility(View. GONE);
                                    String result = putData.getResult();
                                    if(result.equals("Login Success")){
                                        Toast.makeText(LoginActivity.this, result, Toast.LENGTH_SHORT).show();
                                        Toast.makeText(LoginActivity.this, "Selamat Datang, "+username+"!", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(LoginActivity.this, MenuActivity.class));
                                        finish();
                                    } else {
                                        Toast.makeText(LoginActivity.this, result, Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                        }
                    });
                } else{
                    Toast.makeText(LoginActivity.this, "Mohon untuk mengisi username dan password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}