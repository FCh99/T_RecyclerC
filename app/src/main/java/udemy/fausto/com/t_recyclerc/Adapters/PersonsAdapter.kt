package udemy.fausto.com.t_recyclerc.Adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.person_main_item.view.*
import udemy.fausto.com.t_recyclerc.Controllers.DetailActivity
import udemy.fausto.com.t_recyclerc.Model.Person
import udemy.fausto.com.t_recyclerc.R.layout.person_main_item


class PersonsAdapter(val context: Context, val persons: List<Person>): RecyclerView.Adapter<PersonsAdapter.PersonHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val view = LayoutInflater.from(context).inflate(person_main_item, parent, false)
        return PersonHolder(view)

    }

    override fun getItemCount(): Int {
        return persons.count()
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        holder.bindPerson(persons[position], context)

    }

    // can be inner class
    class PersonHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameView = itemView.nameID
        val ageView = itemView.ageID
        val imageView = itemView.imageViewID

        fun bindPerson(person: Person, context: Context) {
            nameView.text = person.name
            ageView.text = person.age

            val imageResourceId = context.resources.getIdentifier(person.image, "drawable", context.packageName)
            imageView.setImageResource(imageResourceId)

            // new onclick
            itemView.setOnClickListener {
                println("----->")
                println(person.name)

                // TODO: send by Intent

                var intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("person", person)
                context.startActivity(intent)




            }
      }
    }  // End of PersonHolder



}