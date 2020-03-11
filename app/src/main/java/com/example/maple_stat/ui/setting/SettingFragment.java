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
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;
import com.google.android.material.appbar.AppBarLayout;

import static android.content.ContentValues.TAG;

public class SettingFragment extends Fragment {

    private SettingViewModel settingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        settingViewModel =
                ViewModelProviders.of(this).get(SettingViewModel.class);
        View root = inflater.inflate(R.layout.fragment_setting, container, false);
        final ScrollView scrollViewTest = (ScrollView) root.findViewById(R.id.setting_scrollView);
        final AppBarLayout appBarLayout = (AppBarLayout) getActivity().findViewById(R.id.app_bar);

        //app bar 기본 설정
        appBarLayout.setSelected(false);
        scrollViewTest.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override public void onScrollChanged() {

                Log.i(TAG,"scroll:"+scrollViewTest.getScrollY());

                if(scrollViewTest.getScrollY()!=0){
                    appBarLayout.setSelected(true);
                }else{
                    appBarLayout.setSelected(false);
                }
            }
        });

        return root;
    }
}