package devandroid.mariaeduarda.bancotb.Controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.mariaeduarda.bancotb.R;
import devandroid.mariaeduarda.bancotb.View.CadastroActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText inputEmail, inputSenha;
    private Button btnLogar;
    private TextView txtCadastrar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        inputEmail = findViewById(R.id.inputemail);
        inputSenha = findViewById(R.id.editTextTextPassword);
        btnLogar = findViewById(R.id.btn_logar);
        txtCadastrar = findViewById(R.id.textView4); // Alterado para corresponder ao id do TextView de cadastro

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarLogin();
            }
        });

        // Adicionando listener para o TextView de cadastro
        txtCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaCadastro(); // Método para iniciar a tela de cadastro
            }
        });
    }

    private void realizarLogin() {
        String email = inputEmail.getText().toString().trim();
        String senha = inputSenha.getText().toString();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(senha)) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Aqui você pode adicionar a lógica para verificar o login
        // Por enquanto, vamos apenas exibir uma mensagem de sucesso
        Toast.makeText(this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
    }

    private void abrirTelaCadastro() {
        // Inicia a Activity de cadastro
        Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(intent);
    }
}
