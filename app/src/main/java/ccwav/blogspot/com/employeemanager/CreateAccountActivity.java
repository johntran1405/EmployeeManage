package ccwav.blogspot.com.employeemanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by John on 3/28/2017.
 */

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{
    Button btnRegister;
    EditText edtEmail, edtPassword, edtRe_Password, edtFullName, edtPhone, edtMobilePhone, edtAddress;
    Spinner spHealth;
    ArrayAdapter arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_layout);
        Init();
        arrayAdapter = ArrayAdapter.createFromResource(this,R.array.Health,android.R.layout.simple_spinner_item);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spHealth.setAdapter(arrayAdapter);

    }

    public void Init() {
        addControl();
    }

    private void addControl() {
        edtEmail = (EditText) findViewById(R.id.cEmail);
        edtPassword = (EditText) findViewById(R.id.cPassword);
        edtRe_Password = (EditText) findViewById(R.id.cRe_Password);
        edtFullName = (EditText) findViewById(R.id.cFullName);
        edtPhone = (EditText) findViewById(R.id.cPhone);
        edtAddress = (EditText) findViewById(R.id.cAddress);
        spHealth = (Spinner) findViewById(R.id.spcHealth);


   //     btnRegister.setOnClickListener(this);
        edtEmail.setOnClickListener(this);
        edtPassword.setOnClickListener(this);
        edtRe_Password.setOnClickListener(this);
        edtFullName.setOnClickListener(this);
        edtPhone.setOnClickListener(this);
        edtAddress.setOnClickListener(this);
        spHealth.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView select = (TextView) view;
        Toast.makeText(getBaseContext(),select.getText().toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
