package ccwav.blogspot.com.employeemanager.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ccwav.blogspot.com.employeemanager.R;

/**
 * Created by John on 4/18/2017.
 */

public class LisViewAdapter extends BaseAdapter {
    Context context;
    int[] avatar;
    String[] nameCompany;

    public LisViewAdapter(Context context, int[] avatar, String[] nameCompany) {
        this.context = context;
        this.avatar = avatar;
        this.nameCompany = nameCompany;

    }

    @Override

    public int getCount() {
        return nameCompany.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.row_company_group_department,null);

        ImageView imgavatar = (ImageView) convertView.findViewById(R.id.imgAvatar);
        TextView txtNameCompany = (TextView) convertView.findViewById(R.id.txtNameCompany);



        imgavatar.setImageResource(avatar[position]);
        txtNameCompany.setText(nameCompany[position]);


        return convertView;
    }
}
