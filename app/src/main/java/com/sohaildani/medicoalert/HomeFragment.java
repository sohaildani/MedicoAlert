package com.sohaildani.medicoalert;

import android.Manifest;
import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
       // getActivity().setContentView(R.layout.fragment_home);
        Button b=(Button)rootView.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                next();
            }
        });
        ImageView i=(ImageView)rootView.findViewById(R.id.image);
        i.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

               call();

            }
        });

        return rootView;
    }
    public void call(){
        Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:8860761317"));
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(in);
    }
    public void next(){
        Intent intent=new Intent(getActivity(),AddNumber.class);
        startActivity(intent);
    }
}
