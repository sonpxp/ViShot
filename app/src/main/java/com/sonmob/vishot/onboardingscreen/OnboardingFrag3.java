package com.sonmob.vishot.onboardingscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.sonmob.vishot.MainActivity;
import com.sonmob.vishot.R;


public class OnboardingFrag3 extends Fragment {

    private Button btnGetStart;
    private View mView;

    public OnboardingFrag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_onboarding_frag3, container, false);

        btnGetStart = mView.findViewById(R.id.btn_start);

        btnGetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return mView;
    }
}