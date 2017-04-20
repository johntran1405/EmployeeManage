package ccwav.blogspot.com.employeemanager;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView txtForgotPassword, txtCreateNewAccount;
    EditText edtEmail, edtPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        addControl();
        addEvent();

    }

    private void addControl() {
        txtForgotPassword = (TextView) findViewById(R.id.lForgotPassword);
        txtCreateNewAccount= (TextView) findViewById(R.id.lCreateNewAccount);
        btnSignIn = (Button) findViewById(R.id.lSignIn);
        edtEmail = (EditText) findViewById(R.id.lEmail);
        edtPassword = (EditText) findViewById(R.id.lPassword);
    }

    private void addEvent() {

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if ((edtEmail.getText().toString().equalsIgnoreCase("admin")) && edtPassword.getText().toString().equalsIgnoreCase("admin")) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
//                } else if ((edtEmail.getText().toString().equalsIgnoreCase("")) && edtPassword.getText().toString().equalsIgnoreCase(""))            {
//                    Toast alert = Toast.makeText(LoginActivity.this, "Please enter a username or password", Toast.LENGTH_SHORT);
//                    alert.show();
//                } else {
//                    Toast.makeText(LoginActivity.this, "Try again !!", Toast.LENGTH_LONG).show();
//                }

            }
        });
        txtCreateNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
        txtForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onPasswordLoginFail(Context context , Intent intent){
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService(context.DEVICE_POLICY_SERVICE);
        int counttime = devicePolicyManager.getCurrentFailedPasswordAttempts();
        if(counttime >= 3){
            
        }
    }
}
