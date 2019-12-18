package es.studium.comentaridgeracer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MiSerivicioMusica extends Service {
    MediaPlayer mediaPlayer;
    int localizador;
    public MiSerivicioMusica(int local) {
        localizador=local;
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String archivo ="rrn"+localizador;
        mediaPlayer.create(getApplicationContext(),R.raw.rrn1);
        /*switch(archivo){
            case "rrn1":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn1);
                break;
            case "rrn2":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn2);
                break;
            case "rrn3":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn3);
                break;
            case "rrn4":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn4);
                break;
            case "rrn5":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn5);
                break;
            case "rrn6":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn6);
                break;
            case "rrn7":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn7);
                break;
            case "rrn8":
                mediaPlayer.create(getApplicationContext(),R.raw.rrn8);
                break;
        }
         */
   mediaPlayer.start();
   return Service.START_NOT_STICKY;
    }
}
