package com.example.spinnerdropdawen

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class SpinnerDropDawn(context: Context, attrs: AttributeSet): LinearLayout(context, attrs){

    init {
        inflate(context, R.layout.spinner_drop_dawn, this)

//        val attributes = context.obtainStyledAttributes(attrs, R.styleable.DropDownList)
//        attributes.recycle()
    }
}