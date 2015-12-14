package javipaur.fiestassanlorenzo2014;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

/**
 * Created by Javipaur on 22/07/2014.
 */
public class Programa extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.programa);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("día 9");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("dia 10");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("día 11");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab4");
        spec.setContent(R.id.tab4);
        spec.setIndicator("día 12");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab5");
        spec.setContent(R.id.tab5);
        spec.setIndicator("día 13");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab6");
        spec.setContent(R.id.tab6);
        spec.setIndicator("día 14");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab7");
        spec.setContent(R.id.tab7);
        spec.setIndicator("día 15");
        tabs.addTab(spec);


        tabs.setCurrentTab(0);
    }
}
