package com.example.maple_stat.ui.setting;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;
import com.example.maple_stat.databinding.FragmentSettingBinding;
import com.example.maple_stat.ui.calculator.calculator_inner_fragment.CalculatorPotentialArmorFragment;
import com.google.android.material.appbar.AppBarLayout;

import static android.content.ContentValues.TAG;

public class SettingFragment extends Fragment {

    private SettingViewModel settingViewModel;
    public FragmentSettingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting, container, false);

        final ScrollView scrollViewTest = (ScrollView) root.findViewById(R.id.setting_scrollView);
        final AppBarLayout appBarLayout = (AppBarLayout) getActivity().findViewById(R.id.app_bar);

        //app bar 기본 설정
        appBarLayout.setSelected(false);
        scrollViewTest.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override public void onScrollChanged() {

                if(scrollViewTest.getScrollY()!=0){
                    appBarLayout.setSelected(true);
                }else{
                    appBarLayout.setSelected(false);
                }
            }
        });

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }
    public void pressCharacterButton(View view){

        /*FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        Fragment settingCharacterFragment = new SettingCharacterFragment();
        transaction.replace(R.id.replace, settingCharacterFragment);
        transaction.addToBackStack(null);
        transaction.commit();*/
        System.out.println("Farm");

    }

    public void pressItemButton(View view){

        System.out.println("Item");

    }

    public void pressEtcButton(View view){

        System.out.println("Etc");

    }

    public void pressLinkButton(View view){

        System.out.println("Link");

    }

    public void pressUnionButton(View view){

        System.out.println("Union");

    }

    public void pressFarmButton(View view){


    }
}