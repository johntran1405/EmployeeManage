package ccwav.blogspot.com.employeemanager.Department;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ccwav.blogspot.com.employeemanager.AddMemberActivity;
import ccwav.blogspot.com.employeemanager.NewTaskActivity;
import ccwav.blogspot.com.employeemanager.R;

/**
 * Created by John on 4/19/2017.
 */

public class DepartmentActivity extends AppCompatActivity {
    Button btnAddMember,btnNewTask;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_layout);
        Init();
        btnAddMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddMemberActivity.class);
                startActivity(intent);
            }
        });
        btnNewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NewTaskActivity.class);
                startActivity(intent);
            }
        });
    }
    private void Init(){
        addControl();
    }

    private void addControl() {
        btnAddMember = (Button) findViewById(R.id.dAddmember);
        btnNewTask = (Button) findViewById(R.id.dNewTask);
    }
}
