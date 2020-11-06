package com.example.dictionary.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;
import com.example.dictionary.model.DictionaryWord;

import java.util.List;

public class DictionaryListFragment extends Fragment {
    private RecyclerView mRecyclerView;

    private DictionaryAdapter mDictionaryAdapter;

    public DictionaryListFragment() {
        // Required empty public constructor
    }

    public static DictionaryListFragment newInstance() {
        DictionaryListFragment fragment = new DictionaryListFragment();
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
        View view = inflater.inflate(R.layout.fragment_dictionary_list, container, false);
        findView(view);
        initView(view);
        return view;
    }

    private void findView(View view) {
        mRecyclerView = view.findViewById(R.id.recycler_view_dictionary_list);
    }

    private void initView(View view) {

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
    }

    public void updateUI() {


    }



    private class DictionaryHolder extends RecyclerView.ViewHolder {

        private TextView mTextViewWord;
        private TextView mTextViewMeaning;
        private DictionaryWord mDictionaryWord;

        public DictionaryHolder(@NonNull View itemView) {
            super(itemView);

            mTextViewWord = itemView.findViewById(R.id.row_item_textView_word);
            mTextViewMeaning = itemView.findViewById(R.id.row_item_textView_meaning);

        }

        public void bindCrime(DictionaryWord dictionaryWord) {
            mDictionaryWord = dictionaryWord;
            mTextViewWord.setText(dictionaryWord.getEnglish());
            mTextViewMeaning.setText(dictionaryWord.getPersian());
        }
    }

    private class DictionaryAdapter extends RecyclerView.Adapter<DictionaryHolder> {

        private List<DictionaryWord> mDictionaryWords;

        public List<DictionaryWord> getDictionaryWords() {
            return mDictionaryWords;
        }

        public void setDictionaryWords(List<DictionaryWord> dictionaryWords) {
            mDictionaryWords = dictionaryWords;
        }

        public DictionaryAdapter(List<DictionaryWord> dictionaryWords) {
            mDictionaryWords = dictionaryWords;
        }

        @Override
        public int getItemCount() {
            return mDictionaryWords.size();
        }

        @NonNull
        @Override
        public DictionaryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.dictionary_row_list, parent, false);
            DictionaryHolder dictionaryHolder = new DictionaryHolder(view);
            return dictionaryHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull DictionaryHolder holder, int position) {

            DictionaryWord dictionaryWord = mDictionaryWords.get(position);
            holder.bindCrime(dictionaryWord);
        }
    }
}
