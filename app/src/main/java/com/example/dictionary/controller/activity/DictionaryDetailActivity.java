package com.example.dictionary.controller.activity;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.example.dictionary.DictionaryDetailFragment;

public class DictionaryDetailActivity extends SingleFragmentActivity {
    public static final String EXTRA_WORD_ID = "Extra_WordID.com.example.dictionary.controller.activity";
    public static final String EXTRA_FROM = "Extra_FROM.com.example.dictionary.controller.activity";
    public static final String EXTRA_TO = "Extra_TO.com.example.dictionary.controller.activity";
    private static long mWordID;
    private static String mFrom,mTo;
    public static Intent newIntent(Context context,long wordId,String from,String to) {
        mWordID = wordId;
        mFrom = from;
        mTo = to;
        Intent intent = new Intent(context, DictionaryDetailActivity.class);
        intent.putExtra(EXTRA_WORD_ID,wordId);
        intent.putExtra(EXTRA_FROM,mFrom);
        intent.putExtra(EXTRA_TO,mTo);
        return intent;
    }
    @Override
    public Fragment createFragment() {
        DictionaryDetailFragment dictionaryDetailFragment = DictionaryDetailFragment.newInstance(mWordID,mFrom,mTo);
        return dictionaryDetailFragment;
    }
}
