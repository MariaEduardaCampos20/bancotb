package devandroid.mariaeduarda.bancotb.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.mariaeduarda.bancotb.R;
import devandroid.mariaeduarda.bancotb.databinding.ActivityInicialBinding;

public class InicialActivity extends AppCompatActivity {

    //usa se quiser mas se não apaga
    private ActivityInicialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInicialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }


}