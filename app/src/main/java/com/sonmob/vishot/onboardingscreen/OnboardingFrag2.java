package com.sonmob.vishot.onboardingscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.sonmob.vishot.R;


public class OnboardingFrag2 extends Fragment {
    private View mView;

    public OnboardingFrag2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_onboarding_frag2, container, false);

        return mView;
    }
}