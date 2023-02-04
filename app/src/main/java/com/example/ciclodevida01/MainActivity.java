package com.example.ciclodevida01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaaramos el objeto que tenemos el el diseño
    TextView textView1, textView2, textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume() {
        super.onResume();
        // la primera variable textView1 se mostrará con el
        // nombre [onResume]
        textView1 = findViewById(R.id.tvCuadrado);
        // y la misma variable será visible al ejecutar la apl.
        textView1.setVisibility(View.VISIBLE);
        // la segunda variable textView2 que es el cuadro se mostrará
        textView2 =findViewById(R.id.tvCuadrado);
        // mientras sea visible en el onResume
        textView2.setVisibility(View.VISIBLE);

    }

    @Override
    protected void onStop() {
        super.onStop();
        // La tercera variable textView3 será como la variable textView1 "[onResume]"
        textView3 = findViewById(R.id.textView2);
        // y la tercera variable textView3 será visible mientras este
        // en el onStop
        textView3.setVisibility(View.VISIBLE);
        // la variable anterior textView1 almacena el nombre [onResume]
        // y aqui le digo que la variable textView3 le pido que me muestre
        // el nombre ingresado con la propiedad set.Text y que me muestre [onStop]
        textView3.setText("[onStop]");
        // Y le digo que me le cambie de color anaranjado
        textView3.setTextColor(Color.parseColor("#ff6600"));
        // La cuarta variable textView4 que es el cuadro que cuando este en el onStop
        textView4 = findViewById(R.id.tvCuadrado);
        // Me lo cambie de color anaranjado.
        textView4.setBackgroundColor(Color.parseColor("#ff6600"));
    }
}