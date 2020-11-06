package com.example.dictionary.activity;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.example.dictionary.DictionaryDetailFragment;

public class DictionaryDetailActivity extends SingleFragmentActivity {
    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, DictionaryDetailFragment.class);
        return intent;
    }
    @Override
    public Fragment createFragment() {
        DictionaryDetailFragment dictionaryDetailFragment = DictionaryDetailFragment.newInstance();
        return dictionaryDetailFragment;
    }
}
