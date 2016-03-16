package com.mvp.tools.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mvp.R
import java.util.*

/**
 * Created by ZG
 */
class LoadAdapter(list: ArrayList<HashMap<String, Any>>) : RecyclerView.Adapter<LoadAdapter.ViewHolder>() {
    var mList: ArrayList<HashMap<String, Any>> = list


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayoutView = LayoutInflater.from(parent.context).inflate(
                R.layout.recyclerview_load_item, null)
        return ViewHolder(itemLayoutView)
    }

    override fun onBindViewHolder(holder: LoadAdapter.ViewHolder, position: Int) {
        holder.mTextView_name.text = mList[position]["person_name"].toString()
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val mTextView_name: TextView
        val mCardView: CardView

        init {
            mTextView_name = itemView.findViewById(R.id.textview_name) as TextView
            mCardView = itemView.findViewById(R.id.cardview_load) as CardView

        }
    }

}