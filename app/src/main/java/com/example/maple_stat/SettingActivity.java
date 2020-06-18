package com.example.maple_stat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.NavigationUI;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.maple_stat.ui.setting.SettingFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterFragment;
import com.google.android.material.appbar.AppBarLayout;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar setting_toolbar = (Toolbar)findViewById(R.id.setting_toolbar);
        setSupportActionBar(setting_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        final AppBarLayout setting_appBarLayout = (AppBarLayout) findViewById(R.id.setting_app_bar);
        final ScrollView scrollViewTest = (ScrollView) findViewById(R.id.setting_scrollView);
        //app bar 기본 설정
        setting_appBarLayout.setSelected(false);
        scrollViewTest.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override public void onScrollChanged() {
                if(scrollViewTest.getScrollY()!=0){
                    setting_appBarLayout.setSelected(true);
                }else{
                    setting_appBarLayout.setSelected(false);
                }
            }
        });

        changeFragment(R.string.spec_setting);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

                onBackPressed();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back button pressed.", Toast.LENGTH_SHORT).show();
        if(getSupportFragmentManager().getBackStackEntryCount()!=0){
            setActionBarTitle(R.string.spec_setting);
        }

        super.onBackPressed();

    }

    public void setActionBarTitle(int title) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    public void changeFragment(int fragmentId){

        setActionBarTitle(fragmentId);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (fragmentId){
            case R.string.spec_setting: {
                Fragment settingFragment = new SettingFragment();
                transaction.replace(R.id.frameLayout_setting_replace, settingFragment);
                break;
            }
            case R.string.character_setting: {
                Fragment settingCharacterFragment = new SettingCharacterFragment();
                transaction.replace(R.id.frameLayout_setting_replace, settingCharacterFragment);
                transaction.addToBackStack(null);
                break;
            }
        }

        transaction.commit();
        return;

    }

}
