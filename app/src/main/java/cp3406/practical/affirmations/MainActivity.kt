package cp3406.practical.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import cp3406.practical.affirmations.adapter.ItemAdapter
import cp3406.practical.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Store returned list
        val myDataset = Datasource().loadAffirmations()
        // Look for view in layout and return reference to it
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        // Assign ItemAdapter object to the adapter property of recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)
        // Size is fixed to improve performance - use if no change in layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}