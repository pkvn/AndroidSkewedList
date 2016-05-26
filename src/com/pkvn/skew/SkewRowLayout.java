package com.pkvn.skew;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SkewRowLayout extends LinearLayout {

	Context context;
	
	public SkewRowLayout(Context context) {
		super(context);
		this.context = context;
	}

	public SkewRowLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	public SkewRowLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		this.context = context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// skew to offset row
		canvas.skew(-0.3f, 0f);
	}

}
