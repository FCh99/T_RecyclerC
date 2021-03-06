package udemy.fausto.com.t_recyclerc.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import udemy.fausto.com.t_recyclerc.Adapters.PersonsAdapter
import udemy.fausto.com.t_recyclerc.Model.DataService
import udemy.fausto.com.t_recyclerc.Model.Person
import udemy.fausto.com.t_recyclerc.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerID.adapter = PersonsAdapter(this, DataService().persons)
        recyclerID.layoutManager = LinearLayoutManager(this)
        recyclerID.setHasFixedSize(true)


    }

}
