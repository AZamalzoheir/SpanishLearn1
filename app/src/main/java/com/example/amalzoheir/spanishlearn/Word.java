package com.example.amalzoheir.spanishlearn;

/**
 * Created by Amalzoheir on 12/1/2017.
 */

public class Word {
    private String defualtTranslation;
    private String spanishTranslation;
    private int imageResourceId;
    private int audioResourceId;
    private static final int NO_IMAGE_PROVIDED=-1;
    private static final int NO_AUDIO_PROVIDED=-1;
    public Word(String defaultTranslation, String spanishTranslation) {
        this.defualtTranslation= defaultTranslation;
        this.spanishTranslation=spanishTranslation;
    }

    public Word(String defaultTranslation, String spanishTranslation, int audioResourceId) {
        this.defualtTranslation= defaultTranslation;
        this.spanishTranslation=spanishTranslation;
        this.audioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String spanishTranslation, int imageResourceId, int audioResourceId) {
        this.defualtTranslation= defaultTranslation;
        this.spanishTranslation=spanishTranslation;
        this.imageResourceId=imageResourceId;
        this.audioResourceId = audioResourceId;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDefaultTranslation() {
        return defualtTranslation;
    }

    public String getSpanishTranslation() {
        return spanishTranslation;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "defultTranslation'" + defualtTranslation+ '\'' +
                ",spanishtranslation='" + spanishTranslation + '\'' +
                ", mImageResourceId=" +imageResourceId +
                ", mAudioResourceId=" + audioResourceId +
                '}';
    }
}

