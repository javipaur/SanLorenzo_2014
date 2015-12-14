package javipaur.fiestassanlorenzo2014;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

/**
 * Created by Javipaur on 22/07/2014.
 */
public class Conciertos extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.conciertos);

        final ImageButton congresos = (ImageButton)findViewById(R.id.congresos);
        //Implementamos el evento “click” del botón
        congresos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, congresos.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton navarra = (ImageButton)findViewById(R.id.navarra);
        //Implementamos el evento “click” del botón
        navarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, navarra.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton inter = (ImageButton)findViewById(R.id.inter);
        //Implementamos el evento “click” del botón
        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, inter.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton lopez = (ImageButton)findViewById(R.id.lopez);
        //Implementamos el evento “click” del botón
        lopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, lopez.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }
    }
