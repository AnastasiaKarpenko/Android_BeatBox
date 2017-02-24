package ws.tilda.anastasia.beatbox.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ws.tilda.anastasia.beatbox.model.BeatBox;
import ws.tilda.anastasia.beatbox.model.Sound;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }



}
