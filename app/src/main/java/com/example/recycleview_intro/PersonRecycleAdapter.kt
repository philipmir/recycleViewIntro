package com.example.recycleview_intro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonRecycleAdapter(val context: Context, val persons : List<Person>) : RecyclerView.Adapter<PersonRecycleAdapter.ViewHolder>() {

    var layoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)

        return  ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = persons[position]

        holder.nameTextView.text = person.name
        holder.nameTextView.text = person.age.toString()
    }

    override fun getItemCount(): Int {
        return  persons.size

    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        var ageTextView = itemView.findViewById<TextView>(R.id.ageTextView)

    }


}