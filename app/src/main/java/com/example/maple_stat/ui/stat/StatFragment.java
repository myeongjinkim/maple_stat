package com.example.maple_stat.ui.stat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.maple_stat.R;

public class StatFragment extends Fragment {

    private StatViewModel statViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        statViewModel =
                ViewModelProviders.of(this).get(StatViewModel.class);
        View root = inflater.inflate(R.layout.fragment_stat, container, false);

        return root;
    }
}