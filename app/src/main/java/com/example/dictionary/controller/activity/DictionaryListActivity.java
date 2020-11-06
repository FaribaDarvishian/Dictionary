package com.example.dictionary.controller.activity;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.example.dictionary.controller.fragment.DictionaryListFragment;

public class DictionaryListActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, DictionaryListActivity.class);
        return intent;
    }
    @Override
    public Fragment createFragment() {
        DictionaryListFragment dictionaryListFragment = DictionaryListFragment.newInstance();
        return dictionaryListFragment;
    }

}