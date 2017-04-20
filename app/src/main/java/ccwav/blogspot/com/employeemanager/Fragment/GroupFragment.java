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
import ccwav.blogspot.com.employeemanager.Group.GroupDetailActivity;
import ccwav.blogspot.com.employeemanager.Group.NewGroupActivity;
import ccwav.blogspot.com.employeemanager.R;

/**
 * Created by John on 4/13/2017.
 */

public class GroupFragment extends Fragment{
    ListView listView;
    LisViewAdapter lisViewAdapter;
    String[] name ={"Group A","Group B","Group C"};
    int[] avatar ={R.drawable.logout_icon,R.drawable.company_icon,R.drawable.profile};
    Button btnCreateGroup;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Group");
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group_fragment_layout,container,false);

        listView = (ListView) view.findViewById(R.id.gfGroup);
        lisViewAdapter = new LisViewAdapter(getActivity(),avatar,name);
        btnCreateGroup = (Button) view.findViewById(R.id.gfCreateGroup);
        listView.setAdapter(lisViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), GroupDetailActivity.class);
                startActivity(intent);
            }
        });
        btnCreateGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewGroupActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
