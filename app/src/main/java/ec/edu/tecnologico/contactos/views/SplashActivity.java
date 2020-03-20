package ec.edu.tecnologico.contactos.views;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import ec.edu.tecnologico.contactos.R;

public class SplashActivity extends AppCompatActivity {
    private final int DURACION_SPLASH = 2000;

    protected void onCreate(Bundle savedInstancedState) {
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, ListActivity.class);
                startActivity(intent);
                finish();

            }

            ;
        }, DURACION_SPLASH);
    }
}