package devandroid.mariaeduarda.bancotb.View;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.mariaeduarda.bancotb.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText edtNome, edtCPF, edtSenha, edtDepositoInicial;
    private Button btnCadastrar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Inicializar componentes da interface
        edtNome = findViewById(R.id.editTextText);
        edtCPF = findViewById(R.id.editTextText2);
        edtSenha = findViewById(R.id.editTextText3);
        edtDepositoInicial = findViewById(R.id.editTextText4);
        btnCadastrar = findViewById(R.id.button);

        // Configurar o botão de cadastro para responder ao clique do usuário
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarUsuario();
            }
        });
    }

    private void cadastrarUsuario() {
        // Obter os valores dos campos de texto
        String nome = edtNome.getText().toString().trim();
        String cpf = edtCPF.getText().toString().trim();
        String senha = edtSenha.getText().toString();
        String depositoInicialStr = edtDepositoInicial.getText().toString().trim();

        // Validar se os campos estão preenchidos
        if (TextUtils.isEmpty(nome) || TextUtils.isEmpty(cpf) || TextUtils.isEmpty(senha) || TextUtils.isEmpty(depositoInicialStr)) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Verificar se o CPF é válido
        if (!validarCPF(cpf)) {
            Toast.makeText(this, "CPF inválido", Toast.LENGTH_SHORT).show();
            return;
        }

        // Converte o valor do depósito inicial para um número decimal
        double depositoInicial = Double.parseDouble(depositoInicialStr);

        // Criar um objeto de usuário com os dados fornecidos
        Usuario novoUsuario = new Usuario(nome, cpf, senha, depositoInicial);

        // Aqui você pode adicionar código adicional para salvar os dados do usuário em um banco de dados ou em outro local de armazenamento
        // Por enquanto, vamos apenas exibir uma mensagem de sucesso
        Toast.makeText(this, "Usuário cadastrado com sucesso", Toast.LENGTH_SHORT).show();
    }

    // Método para validar o CPF
    private boolean validarCPF(String cpf) {
        // Adicione a lógica de validação do CPF aqui
        // Retorne true se o CPF for válido, false caso contrário
        // Por enquanto, vamos apenas retornar true para simular que o CPF é válido
        return true;
    }
}
