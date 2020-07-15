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
import com.example.maple_stat.custom.CustomTextOutLine;
import com.example.maple_stat.databinding.FragmentSettingItemBinding;

public class SettingItemFragment extends Fragment {

    public FragmentSettingItemBinding binding;

    public static SettingItemFragment newInstance(){
        SettingItemFragment fragment = new SettingItemFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setting_item, container, false);

        binding = DataBindingUtil.bind(root);
        binding.setFragment(this);

        return root;
    }

    public void pressItemRing4Button(View view){

        ((SettingActivity) getActivity()).changeFragment(((CustomTextOutLine)view).getText().toString());
        System.out.println("클맄ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
    }
}
