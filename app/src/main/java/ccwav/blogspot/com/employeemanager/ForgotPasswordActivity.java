package ccwav.blogspot.com.employeemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by John on 3/28/2017.
 */

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSubmit;
    Thread timer;
    EditText edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_layout);

        Init();

    }
    private void Init(){
        addControl();
    }

    private void addControl() {
        edtEmail = (EditText) findViewById(R.id.fForgotPassword);
        btnSubmit = (Button) findViewById(R.id.fSubmit);

        edtEmail.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

    }

    private void addEvent() {
        timer=new Thread()
        {
            public void run()
            {


                try
                {
                    sleep(300000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent splash= new Intent(ForgotPasswordActivity.this,LoginActivity.class);
                    startActivity(splash);
                }
            }

        };

        timer.start();
    }

    @Override
    public void onClick(View v) {

    }
}
