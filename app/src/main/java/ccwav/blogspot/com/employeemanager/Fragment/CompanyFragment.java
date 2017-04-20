package ccwav.blogspot.com.employeemanager.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


import ccwav.blogspot.com.employeemanager.Adapter.LisViewAdapter;
import ccwav.blogspot.com.employeemanager.Company.CompanyDetailActivity;
import ccwav.blogspot.com.employeemanager.Company.NewCompanyActivity;
import ccwav.blogspot.com.employeemanager.R;

/**
 * Created by John on 4/13/2017.
 */

public class CompanyFragment extends Fragment {
    ListView listView ;
    LisViewAdapter adapter ;
    Button btnCreateCompany;
    int[] ava = {R.drawable.company_icon,R.drawable.profile,R.drawable.logout_icon};
    String[] NameCompany = {"Cty A","Cty B","Cty C"};

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Company");    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.company_fragment_layout,container,false);
        listView = (ListView) view.findViewById(R.id.cfCompany);
        btnCreateCompany = (Button) view.findViewById(R.id.cfCreateCompany);
        adapter = new LisViewAdapter(getActivity(),ava,NameCompany);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), CompanyDetailActivity.class);
                startActivity(intent);
            }
        });
        btnCreateCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewCompanyActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
