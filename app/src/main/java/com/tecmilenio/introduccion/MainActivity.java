package com.tecmilenio.introduccion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        guardar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                String name = etNombre.getText().toString();
                String school = etEscuela.getText().toString();
                String career = etCarrera.getText().toString();
                String subject = etMateria.getText().toString();

                System.out.print("el nombre es: " + name + "\n");
                System.out.print("la escuela es: " + school + "\n");
                System.out.print("el carrera es: " + career + "\n");
                System.out.print("la materia es: " + subject + "\n");

            }

        });

    }
}