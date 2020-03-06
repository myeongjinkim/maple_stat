package com.example.maple_stat.ui.calculator;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.maple_stat.R;

import java.util.ArrayList;

public class CalculatorFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] VIEW_MAPNTOP_TITLES = {"TAB1","TAB2","TAB3"};
    private ArrayList<Fragment> fList;

    // 아답터 생성자
    public CalculatorFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> fList) {
        super(fm);
        this.fList = fList;
    }

    // tab title를 반환 함수.
    @Override
    public CharSequence getPageTitle(int position) {

        return VIEW_MAPNTOP_TITLES[position];

    }

    // 해당 프라그먼트 호출 함수.
    @Override
    public Fragment getItem(int position) {
        return this.fList.get(position);
    }

    @Override
    public int getCount() {
        return fList.size();
    }
}
