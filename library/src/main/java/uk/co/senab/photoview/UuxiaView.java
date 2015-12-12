package uk.co.senab.photoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by uuxia-mac on 15/12/13.
 */
public class UuxiaView extends View {
    public UuxiaView(Context context) {
        super(context);
    }

    public UuxiaView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UuxiaView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public UuxiaView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
