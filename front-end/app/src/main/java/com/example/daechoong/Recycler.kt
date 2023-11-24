import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.daechoong.R
import com.example.daechoong.UpdateActivity


data class YourData(val text: String)
class YourAdapter(private val dataList: List<YourData>) :
    RecyclerView.Adapter<YourAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView4)
        val textView: TextView = itemView.findViewById(R.id.textView13)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = dataList[position]

        // Set your data to views
        holder.imageView.setImageResource(R.drawable.coffee) // You may need to change this based on your actual data
        holder.textView.text = currentItem.text
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}

var dataList = mutableListOf(
    YourData("Item 1"),
)
class Recycler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sleep_change) // Replace with the actual layout file name

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adding: Button = findViewById(R.id.button5)
        adding.setOnClickListener {
            val intent = Intent(applicationContext, UpdateActivity::class.java)
            startActivity(intent)

        }
        // Sample data for testing

    }
}
