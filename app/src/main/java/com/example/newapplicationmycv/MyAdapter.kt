package com.example.newapplicationmycv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val experienceList: List<Experience>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = experienceList[position]
        holder.title.text = currentItem.title
        holder.textView.text = currentItem.text_view
        holder.data.text = currentItem.data
    }

    override fun getItemCount(): Int {
        return experienceList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val title : TextView = itemView.findViewById(R.id.title1)
        val textView : TextView = itemView.findViewById(R.id.textView2)
        val data : TextView = itemView.findViewById(R.id.data1)

    }
}