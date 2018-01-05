package com.pllug.course.tkachuk.basicandroidsocialapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pllug.course.tkachuk.basicandroidsocialapp.R;
import com.pllug.course.tkachuk.basicandroidsocialapp.model.Profile;


public class ProfileFragment extends Fragment {

    private View root;

    private TextView name_tv;
    private TextView username_tv;
    private TextView id_tv;

    private TextView city_tv;

    private TextView email_tv;
    private TextView phone_tv;

    private TextView company_tv;

    private Profile profile;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_profile, container, false);

        Log.i("onCreateView", "START");

        name_tv = root.findViewById(R.id.profile_name);
        username_tv = root.findViewById(R.id.profile_username);
        id_tv = root.findViewById(R.id.profile_id);
        city_tv = root.findViewById(R.id.profile_city);
        email_tv = root.findViewById(R.id.profile_email);
        phone_tv = root.findViewById(R.id.profile_mobile_tv);
        company_tv = root.findViewById(R.id.profile_company);


        setData(profile);
        Log.i("onCreateView", "STOP");
        return root;
    }


    public void setData(Profile profile){

        Log.i("name = ", profile.getName());

        name_tv.setText(profile.getName());
        username_tv.setText(profile.getUsername());
        id_tv.setText(String.valueOf(profile.getId()));

        city_tv.setText(profile.getCity());

        email_tv.setText(profile.getEmail());

        phone_tv.setText(profile.getPhone());

        company_tv.setText(profile.getNameofCompany());
    }

    public void setProfile(Profile profile){
        this.profile = profile;
    }


    //Todo передавати сюди дані юзера і показувати фрагмент з його даними
}
