package com.example.aluno.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText login;
    private EditText pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.usuario);
        pass = findViewById(R.id.senha);
        btn = findViewById(R.id.botao);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String txt = login.getText().toString();
                String passw = pass.getText().toString();
                String admin = "admin";
                String pas = "admin1234";

                if (txt.equals(admin) && passw.equals(pas)) {
                    Toast.makeText(MainActivity.this, "Login aceito", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Senha ou usuario invalidos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
