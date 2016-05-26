package com.pkvn.skew;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CustomImageView extends ImageView {

	Context context;
	
	public CustomImageView(Context context) {
		super(context);
		this.context = context;
	}

	public CustomImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	public CustomImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		//canvas.skew(-0.3f, 0f);
	}

}
