package com.example.tecnologia.acesso;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.io.Serializable;
import java.util.List;


public class Login extends Activity {

    EditText editDigiteEmail;
    EditText editDigiteSenha;
    Button btnEntrar ;
    private Object persistencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editDigiteEmail = (EditText) findViewById(R.id.editDigiteEmail);
        editDigiteSenha = (EditText) findViewById(R.id.editDigiteSenha);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (editDigiteEmail.getText().length() == 0 || editDigiteSenha.getText().length() == 0) {
                    Toast.makeText(getApplication(),
                            "Os Campos E-mail e Senha São Obrigatorios",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplication(),
                            "Bem Vindo!",
                            Toast.LENGTH_LONG).show();

                    editDigiteEmail.setText("");
                    editDigiteSenha.setText("");
                }
            }
        });

    }

    public void onStart(){


        EditText editDigiteEmail = (EditText) findViewById(R.id.editDigiteEmail);
        EditText editDigiteSenha = (EditText) findViewById(R.id.editDigiteSenha);
        String message = "Oi! " + editDigiteEmail.getText().toString();
        int i = Integer.parseInt(editDigiteSenha.getText().toString());

        Bundle param = new Bundle();
        param.putString("greeting", message);
        param.putString("greeting", message);

        Intent intent = new Intent(this, Login2.class);
        intent.putExtras(param);
        startActivity(intent);
    }
}
