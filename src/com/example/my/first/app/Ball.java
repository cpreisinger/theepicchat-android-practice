package com.example.my.first.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class Ball extends View {
	private final float x;
	private final float y;
	private final float r;
	private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
	
	public Ball(Context context, float x, float y, int r) {
		super(context);
		mPaint.setColor(0xFFFF0000);
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public boolean onTouchEvent(MotionEvent e) {
		setBackgroundColor(Color.BLUE);
		return false;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawCircle(x, y, r, mPaint);
	}
}
