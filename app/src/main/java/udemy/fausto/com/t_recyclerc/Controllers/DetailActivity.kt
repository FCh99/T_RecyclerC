package udemy.fausto.com.t_recyclerc.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import udemy.fausto.com.t_recyclerc.Model.Person
import udemy.fausto.com.t_recyclerc.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var person = intent.getSerializableExtra("person") as Person

        nameDetID.text = person.name
        ageDetID.text = person.age

        var resourceId = applicationContext.resources.getIdentifier(person.image, "drawable", applicationContext.packageName)
        imageViewDetID.setImageResource(resourceId)






    }
}
