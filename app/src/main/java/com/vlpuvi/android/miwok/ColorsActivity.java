package com.vlpuvi.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Ren","weṭeṭṭi"));
        words.add(new Word("Green","chokokki"));
        words.add(new Word("Brown","ṭakaakki"));
        words.add(new Word("Gray","ṭopoppi"));
        words.add(new Word("Black","kululli"));
        words.add(new Word("White","kelelli"));
        words.add(new Word("Dusty Yellow","ṭopiisә"));
        words.add(new Word("Mustard Yellow","chiwiiṭә"));

        WordAdapter wordAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.words_list_view);

        listView.setAdapter(wordAdapter);
    }
}
