package com.anand.sept9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val arr = arrayOf("Number 1", "Number 2", "Number 3", "Number 4", "Number 12", "Number 31", "Number 15", "Number 16", "Number 17", "Number 18", "Number 19")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter = ArrayAdapter<String>(this, R.layout.item_row, R.id.text_view, arr)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { _, _, position, _ ->

            Toast.makeText(this, arr[position], Toast.LENGTH_SHORT).show()

        }

    }
}
