package ccwav.blogspot.com.employeemanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by John on 4/19/2017.
 */

public class AddMemberActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAddMember;
    EditText edtEmailMember;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_member_layout);
        Init();
    }
    private void Init(){
        addControl();
    }

    private void addControl() {
//        btnAddMember.setOnClickListener(this);
//        edtEmailMember.setOnClickListener(this);


//        btnAddMember = (Button) findViewById(R.id.aAddmember);
//        edtEmailMember = (EditText) findViewById(R.id.aEmailMember);
    }

    @Override
    public void onClick(View v) {

    }
}
