package com.example.spinnerdropdawen

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spinnerdropdawen.rv.SpinnerAdapter
import com.example.spinnerdropdawen.rv.SpinnerModel

class SpinnerDropDawn(context: Context, attrs: AttributeSet): LinearLayout(context, attrs){

    private val layout: LinearLayout
    private val text: TextView
    private val hide: TextView
    private val image: ImageView
    private val recycler: RecyclerView
    private lateinit var adapters : SpinnerAdapter
    private var list : ArrayList<SpinnerModel> = arrayListOf()

    init {
        inflate(context, R.layout.spinner_drop_dawn, this)

        layout = findViewById(R.id.layoutSpin)
        text = findViewById(R.id.testView)
        hide = findViewById(R.id.textHide)
        image = findViewById(R.id.imageView)
        recycler = findViewById(R.id.recyclerView)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.DownSpinner)
        hide.text = attributes.getText(0)
        text.text = attributes.getText(0)
        attributes.recycle()

        initRv()
    }

    private fun initRv() {
        adapters = SpinnerAdapter(object : SpinnerAdapter.Listener{
            override fun setOnClickSpinner(item: SpinnerModel) {
                text.text = item.text
                list.clear()
                recycler.visible(list.isNotEmpty())
                hide.visible(text.text.isNotEmpty())
                image.visible(text.text.isNotEmpty())
            }
        })
    }

    fun setOnClick(item: ArrayList<SpinnerModel>){
        adapters.update(item)
        recycler.visible(item.isNotEmpty())
        recycler.adapter = adapters
        list = item
    }


    fun View.visible(visible: Boolean, invisibleState: Int = View.GONE) {
        visibility = if (visible) View.VISIBLE else invisibleState
    }
}