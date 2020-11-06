package com.example.dictionary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class DictionaryDetailFragment extends Fragment {
    public DictionaryDetailFragment() {
        // Required empty public constructor
    }

    public static DictionaryDetailFragment newInstance(long mWordID, String mFrom, String mTo) {
        DictionaryDetailFragment fragment = new DictionaryDetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dictionary_detail, container, false);

        return view;
    }
}
