package com.pkvn.skew;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SimpleSkewLayout extends RelativeLayout{

	Context context;
	
	public SimpleSkewLayout(Context context) {
		super(context);
		this.context = context;
	}

	public SimpleSkewLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	public SimpleSkewLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		this.context = context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// skew the canvas over X
		canvas.skew(0.3f, 0f);
	}
}
