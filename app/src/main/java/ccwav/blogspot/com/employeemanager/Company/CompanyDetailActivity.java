package ccwav.blogspot.com.employeemanager.Company;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import ccwav.blogspot.com.employeemanager.Adapter.LisViewAdapter;
import ccwav.blogspot.com.employeemanager.Department.DepartmentActivity;
import ccwav.blogspot.com.employeemanager.Department.NewDepartmentActivity;
import ccwav.blogspot.com.employeemanager.R;

/**
 * Created by John on 4/19/2017.
 */

public class CompanyDetailActivity extends AppCompatActivity {
    ListView listView;
    Button btnCreateDepartment;
    LisViewAdapter lisViewAdapter;
    String[] nameDepartment ={"DepartmentActivity A","DepartmentActivity B","DepartmentActivity C"};
    int[] avatar = {R.drawable.profile,R.drawable.company_icon,R.drawable.logout_icon} ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_detail_layout);
        Init();
        lisViewAdapter = new LisViewAdapter(getApplicationContext(),avatar,nameDepartment);
        listView.setAdapter(lisViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),DepartmentActivity.class);
                startActivity(intent);
            }
        });
        btnCreateDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NewDepartmentActivity.class);
                startActivity(intent);
            }
        });
    }
    private void Init(){
        addControl();
    }

    private void addControl() {
        listView = (ListView) findViewById(R.id.cdDepartment);
        btnCreateDepartment = (Button) findViewById(R.id.cdCreateDepartment);
    }
}
