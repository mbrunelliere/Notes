package crm.gobelins.notes;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;



public class SplashActivity extends FragmentActivity {
    private static final int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                // start Home Activity
                startActivity(i);
                // close the splashscreen
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
