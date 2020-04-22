package com.example.maple_stat.ui.stat;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;
import com.google.android.material.appbar.AppBarLayout;

import static android.content.ContentValues.TAG;

public class StatFragment extends Fragment {

    private StatViewModel statViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_stat, container, false);
        final ScrollView scrollViewTest = (ScrollView) root.findViewById(R.id.stat_scrollView);
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

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.main_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        return root;
    }

}