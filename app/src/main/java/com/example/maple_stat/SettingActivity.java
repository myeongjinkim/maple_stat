package com.example.maple_stat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import com.example.maple_stat.ui.setting.SettingFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterAbilityFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterBlessingFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterCashFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterGuildFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterNormalFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterSymbolFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterTendencyFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingCharacterTitleFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingEtcFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingFarmFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingHyperFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingItemFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingLinkFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingPetFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingUnionArrangementFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingUnionFragment;
import com.example.maple_stat.ui.setting.setting_inner_fragment.SettingUnionRaidFragment;
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

        changeFragment(getString(R.string.spec_setting));

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
        if(getSupportFragmentManager().getBackStackEntryCount()!=0){
            getSupportFragmentManager().popBackStack();
        }else{
            super.onBackPressed();
        }
    }

    public void setScrollY0(){
        ScrollView scrollViewTest = (ScrollView) findViewById(R.id.setting_scrollView);
        scrollViewTest.setScrollY(0);
    }

    public void setActionBarTitle(String title) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            setScrollY0();
            getSupportActionBar().setTitle(title);
        }
    }

    public void changeFragment(String fragmentTitle){

        setActionBarTitle(fragmentTitle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(fragmentTitle.equals(getString(R.string.spec_setting))){
            Fragment settingFragment = new SettingFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingFragment);
        }else if(fragmentTitle.equals(getString(R.string.character_setting))){
            Fragment settingCharacterFragment = new SettingCharacterFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_normal_setting))){
            Fragment settingCharacterNormalFragment = new SettingCharacterNormalFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterNormalFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_ability_setting))){
            Fragment settingCharacterAbilityFragment = new SettingCharacterAbilityFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterAbilityFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_tendency_setting))){
            Fragment settingCharacterTendencyFragment = new SettingCharacterTendencyFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterTendencyFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_symbol_setting))){
            Fragment settingCharacterSymbolFragment = new SettingCharacterSymbolFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterSymbolFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_guild_setting))){
            Fragment settingCharacterGuildFragment = new SettingCharacterGuildFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterGuildFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_blessing_setting))){
            Fragment settingCharacterBlessingFragment = new SettingCharacterBlessingFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterBlessingFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_cash_setting))){
            Fragment settingCharacterCashFragment = new SettingCharacterCashFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterCashFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.character_title_setting))){
            Fragment settingCharacterTitleFragment = new SettingCharacterTitleFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingCharacterTitleFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.item_setting))){
            Fragment settingItemFragment = new SettingItemFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingItemFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.pet_setting))){
            Fragment settingPetFragment = new SettingPetFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingPetFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.hyper_setting))){
            Fragment settingHyperFragment = new SettingHyperFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingHyperFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.etc_setting))){
            Fragment settingEtcFragment = new SettingEtcFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingEtcFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.link_setting))){
            Fragment settingLinkFragment = new SettingLinkFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingLinkFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.union_setting))){
            Fragment settingUnionFragment = new SettingUnionFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingUnionFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.union_arrangement_setting))){
            Fragment settingUnionArrangementFragment = new SettingUnionArrangementFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingUnionArrangementFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.union_raid_setting))){
            Fragment settingUnionRaidFragment = new SettingUnionRaidFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingUnionRaidFragment);
            transaction.addToBackStack(null);
        }else if(fragmentTitle.equals(getString(R.string.farm_setting))){
            Fragment settingFarmFragment = new SettingFarmFragment();
            transaction.replace(R.id.frameLayout_setting_replace, settingFarmFragment);
            transaction.addToBackStack(null);
        }

        transaction.commit();
        return;

    }

}
