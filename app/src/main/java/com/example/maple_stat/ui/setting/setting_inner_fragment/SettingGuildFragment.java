package com.example.maple_stat.ui.setting.setting_inner_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.maple_stat.R;
import com.example.maple_stat.SettingActivity;
import com.example.maple_stat.databinding.FragmentSettingGuildBinding;

public class SettingGuildFragment extends Fragment {

    public FragmentSettingGuildBinding binding;

    public static SettingGuildFragment newInstance(){
        SettingGuildFragment fragment = new SettingGuildFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_guild, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);
        ((SettingActivity) getActivity()).setActionBarTitle(getString(R.string.guild_setting));

        return root;
    }
    public void pressGuildPassiveButton(View view){

        ((SettingActivity) getActivity()).changeFragment(((Button)view).getText().toString());
    }

    public void pressGuildActiveButton(View view){

        ((SettingActivity) getActivity()).changeFragment(((Button)view).getText().toString());
    }
}
