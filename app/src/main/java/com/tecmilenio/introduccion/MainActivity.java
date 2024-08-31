package com.tecmilenio.introduccion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etEscuela;
    private EditText etCarrera;
    private EditText etMateria;
    private Button borrar;
    private Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNombre=(EditText) findViewById(R.id.etNombre);
        etEscuela=(EditText) findViewById(R.id.etEscuela);
        etCarrera=(EditText) findViewById(R.id.etCarrera);
        etMateria=(EditText) findViewById(R.id.etMateria);

        borrar=(Button) findViewById(R.id.borrar);
        guardar=(Button) findViewById(R.id.guardar);

        tvGuardaDatos=(TextView) findViewById(R.id.tvGuardaDatos);
        textFront=(TextView) findViewById(R.id.textFront);


        guardar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                String name = etNombre.getText().toString();
                String school = etEscuela.getText().toString();
                String career = etCarrera.getText().toString();
                String subject = etMateria.getText().toString();

                Logger.getLogger("el nombre es: " + name + "\n");
                Logger.getLogger("la escuela es: " + school + "\n");
                Logger.getLogger("el carrera es: " + career + "\n");
                Logger.getLogger("la materia es: " + subject + "\n");

                tvGuardaDatos.setVisibility(View.VISIBLE);

                System.out.println("");
                System.out.println("");System.out.println("");
                System.out.println("");

                textFront.setText("Nuestras alma mater "+ school+ "le da la más cordial bienvenida "
                        + "correspondiente a la carrera de "+ career +"en la materia de "+ subject);

            }

        });

    }
}