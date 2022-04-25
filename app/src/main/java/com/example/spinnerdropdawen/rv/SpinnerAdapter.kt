package com.example.spinnerdropdawen.rv

import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spinnerdropdawen.R
import com.timelysoft.tsjdomcom.common.GenericRecyclerAdapter
import com.timelysoft.tsjdomcom.common.ViewHolder

class SpinnerAdapter(var listener: Listener, item: ArrayList<SpinnerModel> = arrayListOf()): GenericRecyclerAdapter<SpinnerModel>(item) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return super.onCreateViewHolder(parent, R.layout.item_spinner)
    }

    override fun bind(item: SpinnerModel, holder: ViewHolder) = with(holder.itemView) {
        this.findViewById<TextView>(R.id.textSpinner).text = item.text
        this.findViewById<LinearLayout>(R.id.layoutItem).setOnClickListener {
            listener.setOnClickSpinner(item)
        }
    }

    interface Listener{
        fun setOnClickSpinner(item: SpinnerModel)
    }
}