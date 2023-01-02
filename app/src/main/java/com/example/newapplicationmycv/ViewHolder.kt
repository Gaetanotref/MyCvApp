package com.example.newapplicationmycv

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title : TextView = itemView.findViewById(R.id.title1)
    val textView: TextView = itemView.findViewById(R.id.textView2)
    val data : TextView = itemView.findViewById(R.id.data1)
}