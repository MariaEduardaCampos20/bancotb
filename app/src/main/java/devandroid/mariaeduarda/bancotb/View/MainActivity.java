package devandroid.mariaeduarda.bancotb.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import devandroid.mariaeduarda.bancotb.Model.Pessoa;
import devandroid.mariaeduarda.bancotb.Model.Saldo;
import devandroid.mariaeduarda.bancotb.R;

public class MainActivity extends AppCompatActivity {

    Pessoa  pessoa;
    Saldo saldo;
    Button btn_logar;

    private TextView txt_fututo;
    private TextView txt_titulomain;
    EditText inputemail;
    EditText editTextTextPassword;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        pessoa = new  Pessoa();
        saldo = new Saldo();

        /*inputemail = findViewById(R.id.inputemail);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);

        inputemail.setTextColor(Color.WHITE);
        editTextTextPassword.setTextColor(Color.WHITE);

        txt_fututo = findViewById(R.id.txt_fututo);
        txt_titulomain = findViewById(R.id.txt_titulomain);

        btn_logar = findViewById(R.id.btn_logar);

        btn_logar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });*/


    }
}