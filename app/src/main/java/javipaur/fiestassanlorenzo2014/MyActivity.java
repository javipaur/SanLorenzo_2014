package javipaur.fiestassanlorenzo2014;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_my);

        final ImageButton  desarrollador= (ImageButton)findViewById(R.id.desarrolladores);
        //Implementamos el evento “click” del botón
        desarrollador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, desarrollador.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
        final ImageButton  fuegos= (ImageButton)findViewById(R.id.fuegos);
        //Implementamos el evento “click” del botón
        fuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, fuegos.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton programa = (ImageButton)findViewById(R.id.programa);
        //Implementamos el evento “click” del botón
        programa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, Programa.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
        final ImageButton conciertos = (ImageButton)findViewById(R.id.conciertos);
        //Implementamos el evento “click” del botón
        conciertos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, Conciertos.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
        final ImageButton toros= (ImageButton)findViewById(R.id.toros);
        //Implementamos el evento “click” del botón
        toros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, Toros.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
