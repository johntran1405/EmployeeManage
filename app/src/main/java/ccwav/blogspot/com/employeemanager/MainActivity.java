package ccwav.blogspot.com.employeemanager;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int TIME_DELAY_SCALE_IMG = 10;
    private final int TIME_DELAY_SCALE_TV = 150;
    ImageView imgLogo;
    TextView txtEmployeeManager;
    private Animation scale,translate;
    Thread timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setBackgroundtranlenbar(true);


        addControl();
        addEvent();
    }

    private void addControl() {
        imgLogo = (ImageView) findViewById(R.id.mImageLogo);
        txtEmployeeManager = (TextView) findViewById(R.id.mEmployeeManager);
        scale = AnimationUtils.loadAnimation(this, R.anim.scale);
        translate = AnimationUtils.loadAnimation(this,R.anim.translate);
    }


    private void addEvent() {
        // Animation Time delay textview Learn English
        boolean imageview = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imgLogo.startAnimation(scale);

            }
        }, TIME_DELAY_SCALE_IMG);

        boolean txtdelay = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtEmployeeManager.startAnimation(translate);
            }
        },TIME_DELAY_SCALE_TV);


        timer=new Thread()
        {
            public void run()
            {


                try
                {
                    sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent splash= new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(splash);
                }
            }

        };

        timer.start();
    }
}
