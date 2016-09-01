package com.sohaildani.medicoalert;

import android.app.Fragment;
import android.content.Intent;
import android.location.GpsStatus;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.json.JSONArray;
import org.json.JSONObject;

public class PhotosFragment extends Fragment {
	
	public PhotosFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
        ImageView i=(ImageView)rootView.findViewById(R.id.image);


        i.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                next();
            }
        });
        return rootView;
    }
    public void next(){
        //Intent intent=new Intent(getActivity(),MainActivity2.class);
        //startActivity(intent);
    }
}
