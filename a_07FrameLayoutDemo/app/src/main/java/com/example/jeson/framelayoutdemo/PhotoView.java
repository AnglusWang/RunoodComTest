package com.example.jeson.framelayoutdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Jeson on 2016/4/30.
 * 图片View
 */
public class PhotoView extends View {

    public float bitmapX;
    public float bitmapY;
    public PhotoView(Context context) {
        super(context);
        //图片初始坐标
        bitmapX = 0;
        bitmapY = 100;
    }

    //重写View类的onDraw方法
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建，并且实例化Paint的对象
        Paint paint = new Paint();
        //根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.photo);
        //绘制图片
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
        //判断图片是否回收，没有回收的话强制回收图片
        if (bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
