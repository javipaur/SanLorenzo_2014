package javipaur.fiestassanlorenzo2014;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Javipaur on 28/07/2014.
 */
public class inter extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.inter);
    }
}
