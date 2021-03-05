package com.sonmob.vishot.onboardingscreen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OnboardingFrag1();
            case 1:
                return new OnboardingFrag2();
            case 2:
                return new OnboardingFrag3();
            default:
                return new OnboardingFrag1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
