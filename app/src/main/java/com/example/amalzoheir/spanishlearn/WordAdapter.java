package com.example.amalzoheir.spanishlearn;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amalzoheir on 12/1/2017.
 */

public class WordAdapter  extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Word currentword=getItem(position);
        TextView defuleTranslationTextView=(TextView)listItemView.findViewById(R.id.default_text_view);
        defuleTranslationTextView.setText(currentword.getDefaultTranslation());
        TextView spanishTranslationTextView=(TextView)listItemView.findViewById(R.id.spanish_text_view);
        spanishTranslationTextView.setText(currentword.getSpanishTranslation());
        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        if(currentword.hasImage()) {
            imageView.setImageResource(currentword.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }




}
