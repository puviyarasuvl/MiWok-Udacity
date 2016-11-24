package com.vlpuvi.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Puvi VL on 25-Nov-16.
 */
public class WordAdapter extends ArrayAdapter<Word>
{
    public WordAdapter(Activity context, ArrayList<Word> words)
    {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getEnglishTranslation());

        TextView miWokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miWokTextView.setText(currentWord.getMiWokTranslation());

        return listItemView;
    }
}
