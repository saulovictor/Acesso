package com.example.tecnologia.acesso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Login2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

    }

public void onStart(){
    Intent it = getIntent();
    Bundle param = it.getExtras();
    String capturedMessage= param.getString("greeting");
    String captured_I = param.getString("greeting");
}
}

