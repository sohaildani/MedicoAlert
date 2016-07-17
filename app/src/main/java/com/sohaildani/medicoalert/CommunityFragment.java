package com.sohaildani.medicoalert;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class CommunityFragment extends Fragment {

    public CommunityFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container ,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_community, container, false);

        ImageView image = (ImageView) rootView.findViewById(R.id.reminder);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openApp(getActivity(),"com.sohaildani.remindme");
            }
        });

        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }



    public  boolean openApp(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();

            Intent i = manager.getLaunchIntentForPackage(packageName);
            if (i == null) {
                Toast.makeText(getActivity(), "No App", Toast.LENGTH_SHORT).show();
                return false;
                //throw new PackageManager.NameNotFoundException();
            }
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);
            return true;

    }
}
