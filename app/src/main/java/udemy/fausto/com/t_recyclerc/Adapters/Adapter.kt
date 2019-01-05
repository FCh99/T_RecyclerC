package udemy.fausto.com.t_recyclerc.Adapters

import android.app.Person
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.person_main.view.*

class Adapter(val context: Context, val persons: Array<Person>): RecyclerView.Adapter<Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        TODO("not implemented") //To change body of created functions us File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return persons.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {



    }


    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameView = itemView.nameID
        val ageView = itemView.ageID

        fun bindPerson(person: Person, context: Context) {

            val myPerson = person
            println(myPerson.name)

        }


    }

}