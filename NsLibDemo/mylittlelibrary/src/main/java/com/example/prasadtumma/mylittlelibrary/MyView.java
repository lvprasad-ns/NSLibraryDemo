package com.example.prasadtumma.mylittlelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by prasad.tumma on 01-02-2016.
 */
public class MyView extends LinearLayout {
    public MyView(Context context) {
        super(context);
        initialize(context);

    }
    public MyView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context,R.layout.my_view,this);
    }
}
