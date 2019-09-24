package com.anand.sept9.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anand.sept9.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    private val list = mutableListOf<Contact>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        list.add(Contact("Gaurav Bordoloi", "gmonetix@gmail.com", "https://image.freepik.com/free-vector/doctor-character-background_1270-84.jpg"))
        list.add(Contact("Shiva", "Shivasis@gmail.com", "https://www.patientpop.com/wp-content/uploads/national-doctors-day-1-920x518.jpg"))
        list.add(Contact("Ram Nath", "immudtable@gmail.com", "https://previews.123rf.com/images/luismolinero/luismolinero1505/luismolinero150500345/39800585-kid-dressed-as-doctor-with-thumb-up.jpg"))
        list.add(Contact("Naresh Balani", "nbalani@gmail.com", "https://c8.alamy.com/comp/KD4T9C/kid-doctor-KD4T9C.jpg"))
        list.add(Contact("Lucks Swati", "Luckswati@gmail.com", "https://c8.alamy.com/comp/KD4T99/kid-doctor-KD4T99.jpg"))
        list.add(Contact("Naisa", "naisa@gmail.com", "https://thumbs.dreamstime.com/z/kid-playing-doctor-toy-plush-34298785.jpg"))

        recyclerView.adapter = ContactAdapter(this, list)


    }

    private fun returnMyName(): String = list.toString()

}
