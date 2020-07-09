package com.example.maple_stat.ui.setting.setting_inner_fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.example.maple_stat.R;
import com.example.maple_stat.databinding.FragmentSettingFarmBinding;

import static android.content.ContentValues.TAG;

public class SettingFarmFragment extends Fragment {

    public FragmentSettingFarmBinding binding;

    public static SettingFarmFragment newInstance(){
        SettingFarmFragment fragment = new SettingFarmFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_farm, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }
    public void pressFarmDeleteButton(View view) {
        Log.i(TAG,"지우기");
    }

    public void pressFarmAddButton(View view) {
        Log.i(TAG,"더하기");
    }
}
