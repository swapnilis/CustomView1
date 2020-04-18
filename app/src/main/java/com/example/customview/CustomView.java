package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class CustomView extends View {
    private static final int size=300;

    private Rect mrectsqure;
    private Paint mpiantsqure;


    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set){
        mrectsqure=new Rect();
        mpiantsqure=new Paint(Paint.ANTI_ALIAS_FLAG);
        mpiantsqure.setColor(Color.GREEN);




    }

    public void swapcolor(){
        mpiantsqure.setColor(mpiantsqure.getColor()== Color.GREEN ? Color.RED : Color.GREEN);

        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mrectsqure.left=80;
        mrectsqure.top=80;
        mrectsqure.right=mrectsqure.left+size;
        mrectsqure.bottom=mrectsqure.top+size;



        canvas.drawRect(mrectsqure, mpiantsqure);

    }
}
