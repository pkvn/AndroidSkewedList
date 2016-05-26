package com.pkvn.skew;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends TextView {

	Context context;
	
	public CustomTextView(Context context) {
		super(context);
		this.context = context;
	}

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//canvas.skew(-0.3f, 0f);
	}
	
}
