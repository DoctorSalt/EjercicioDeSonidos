package es.studium.comentaridgeracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static public int cancion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chequeaMusica(View view) {
        Button bntSeleccionado = (Button) view;
        int seleccion = bntSeleccionado.getId();
        switch(seleccion){
            case R.id.btn1:
                cancion=1;
                break;
            case R.id.bnt2:
                cancion=2;
                break;
            case R.id.btn3:
                cancion=3;
                break;
            case R.id.btn4:
                cancion=4;
                break;
            case R.id.btn5:
                cancion=5;
                break;
            case R.id.btn6:
                cancion=6;
                break;
            case R.id.btn7:
                cancion=7;
                break;
            case R.id.btn8:
                cancion=8;
                break;
        }
        play(view);
    }
    public void play (View view){
        Intent i = new Intent(this, MiSerivicioMusica.class);
        startService(i);
    }
}
