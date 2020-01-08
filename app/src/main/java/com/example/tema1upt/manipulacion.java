package com.example.tema1upt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class manipulacion  extends AppCompatActivity {
    EditText edtnombre;
    EditText edtmonto;
    TextView txtresultado;
    Button btnejecutar;
    Button btnCambiarPropiedad;

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        edtnombre=findViewById(R.id.edtnombre);
        edtmonto=findViewById(R.id.edtmonto);
        txtresultado=findViewById(R.id.txtResultado);
        btnejecutar=findViewById(R.id.btncambiar);
        btnCambiarPropiedad=findViewById(R.id.btnpropiedad);
        btnejecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cambio;
                cambio=Double.parseDouble(edtmonto.getText().toString())*3.3;
                txtresultado.setText(edtnombre.getText() + " el monto de "+ edtmonto.getText()+
                        " dolares equivale a " + cambio.toString() + " Soles");
            }
        });
    }

    public void ocultar(View view){
        if(i==0){
            btnejecutar.setVisibility(View.GONE);
            btnCambiarPropiedad.setText("Visible");
            i=1;
        }
        else {
            btnejecutar.setVisibility(View.VISIBLE);
            btnCambiarPropiedad.setText("Ocultar");
            i=0;
        }


    }

}
