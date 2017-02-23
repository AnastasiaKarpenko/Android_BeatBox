package ws.tilda.anastasia.beatbox;

import android.content.Context;
import android.content.res.AssetManager;

public class BeatBox {
    public static final String TAG = "BeatBox";

    public static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;

    public BeatBox(Context context) {
        mAssets = context.getAssets();
    }

}
