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

public class NewTaskActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSelectAvatar, btnAddTask;
    EditText edtNameTask;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_task_layout);
        Init();
    }
    private void Init(){
        addControl();
    }

    private void addControl() {
//        btnSelectAvatar.setOnClickListener(this);
//        btnAddTask.setOnClickListener(this);
//        edtNameTask.setOnClickListener(this);
//
//        btnAddTask = (Button) findViewById(R.id.nAddTask);
//        btnSelectAvatar = (Button) findViewById(R.id.nSelectAvatar);
//        edtNameTask = (EditText) findViewById(R.id.nNameTask);
    }

    @Override
    public void onClick(View v) {

    }
}
