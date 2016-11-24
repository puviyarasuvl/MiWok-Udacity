package com.vlpuvi.android.miwok;

/**
 * Created by Puvi VL on 25-Nov-16.
 */
public class Word
{
    private String mEnglishTranslation;

    private String mMiWokTranslation;

    public Word(String englishTranslation,String miWokTranslation)
    {
        mEnglishTranslation = englishTranslation;
        mMiWokTranslation = miWokTranslation;
    }

    public String getEnglishTranslation()
    {
        return mEnglishTranslation;
    }

    public String getMiWokTranslation()
    {
        return mMiWokTranslation;
    }
}
