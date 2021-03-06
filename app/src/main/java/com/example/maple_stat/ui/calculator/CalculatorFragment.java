package com.example.maple_stat.ui.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.maple_stat.R;
import com.example.maple_stat.ui.calculator.calculator_inner_fragment.CalculatorAdditionalFragment;
import com.example.maple_stat.ui.calculator.calculator_inner_fragment.CalculatorOptionFragment;
import com.example.maple_stat.ui.calculator.calculator_inner_fragment.CalculatorSpellbookFragment;
import com.example.maple_stat.ui.calculator.calculator_inner_fragment.CalculatorPotentialFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class CalculatorFragment extends Fragment {

    private CalculatorViewModel calculatorViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        calculatorViewModel =
                ViewModelProviders.of(this).get(CalculatorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calculator, container, false);

        FragmentManager fm;
        fm = getChildFragmentManager();
        ArrayList<Fragment> fList;

        // 각 탭에 들어갈 프라그먼트 생성 및 추가
        fList = new ArrayList<Fragment>();
        fList.add(CalculatorOptionFragment.newInstance());
        fList.add(CalculatorSpellbookFragment.newInstance());
        fList.add(CalculatorPotentialFragment.newInstance());
        fList.add(CalculatorAdditionalFragment.newInstance());

        CalculatorFragmentPagerAdapter calculatorFragmentPagerAdapter = new CalculatorFragmentPagerAdapter(fm, fList);
        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(calculatorFragmentPagerAdapter);
        TabLayout tabs = root.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        return root;
    }

}