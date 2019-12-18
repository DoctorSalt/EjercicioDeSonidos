package es.studium.comentaridgeracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
                Reproducir(1);
                break;
            case R.id.bnt2:
                Reproducir(2);
                break;
            case R.id.btn3:
                Reproducir(3);
                break;
            case R.id.btn4:
                Reproducir(4);
                break;
            case R.id.btn5:
                Reproducir(5);
                break;
            case R.id.btn6:
                Reproducir(6);
                break;
            case R.id.btn7:
                Reproducir(7);
                break;
            case R.id.btn8:
                Reproducir(8);
                break;
        }
    }

    private void Reproducir(int i) {
        play(i);
}
    public void play (int x){
        MiSerivicioMusica miSerivicioMusica = new MiSerivicioMusica(x);
        Intent i = new Intent(this, MiSerivicioMusica.class);
        startService(i);
    }
}
