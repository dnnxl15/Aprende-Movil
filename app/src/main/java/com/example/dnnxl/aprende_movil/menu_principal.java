package com.example.dnnxl.aprende_movil;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class menu_principal extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void abrirBuscador (View v){
        startActivity(new Intent(menu_principal.this, buscador_web.class));
    }

    public void abrirAyuda (View v){
        startActivity(new Intent(menu_principal.this, consejos_ayuda.class));
    }

    public void abrirEmergencia (View v){
        startActivity(new Intent(menu_principal.this, emergencia.class));
    }

    public void abrirCalendario (View v){
        startActivity(new Intent(menu_principal.this, calendario.class));
    }

    public void abrirCarta (View v){
        Intent myIntent = new Intent(menu_principal.this, contactos.class);
        myIntent.putExtra("tipoComunicacion", 0);
        startActivity(myIntent);
    }

    public void abrirMensajes (View v){
        Intent myIntent = new Intent(menu_principal.this, contactos.class);
        myIntent.putExtra("tipoComunicacion", 1);
        startActivity(myIntent);
    }

    public void abrirLlamadas (View v){
        startActivity(new Intent(menu_principal.this, menu_llamadas.class));
    }
}
