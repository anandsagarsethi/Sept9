package com.anand.sept9.recyclerview

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.anand.sept9.MainActivity
import com.anand.sept9.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_recyclerview_row_1.view.*

class ContactAdapter(val context: Context, val list: List<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    private val glide = Glide.with(context)

    //runs one time if view type is single, else multiple times
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recyclerview_row_1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    //runs for every row
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val contact = list[position]

        holder.nameTextView.text = contact.name
        holder.emailTextView.text = contact.email
        glide.load(contact.image).into(holder.profileImage)

        holder.itemView.setOnClickListener {

            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
            (context as Activity).finish()

            //Toast.makeText(context, contact.name, Toast.LENGTH_SHORT).show()
        }

    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val profileImage = view.profile_image
        val emailTextView = view.text_view_email
        val nameTextView = view.text_view_name

    }

}