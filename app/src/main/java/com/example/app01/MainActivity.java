package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludar;
    private Button btnLimpiar;
    private Button btnCerrar;
    private EditText txtSaludo;
    private TextView lblSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = (Button) findViewById(R.id.btnSaludar);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);
        txtSaludo = (EditText) findViewById(R.id.txtSaludo);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtSaludo.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "Ingresa un nombre, por favor.", Toast.LENGTH_SHORT).show();
                } else {
                    String txtSaludar = txtSaludo.getText().toString();
                    lblSaludo.setText("Hola " + txtSaludar + ". ¿Cómo estás? :D");
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtSaludo.getText().toString().matches("")&&lblSaludo.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "Ya está limpio. :D", Toast.LENGTH_SHORT).show();
                } else {
                    txtSaludo.setText("");
                    lblSaludo.setText("");
                }
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}