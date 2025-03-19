package com.example.sweetslice

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DashboardActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cakeAdapter: CakeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewCakes)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        // Set up the cake list
        val cakeList = createCakeList()

        // Initialize and set adapter
        cakeAdapter = CakeAdapter(cakeList) { selectedCake ->
            if (selectedCake.name == "Black Forest Cake") {
                val intent = Intent(this, CakeDetailsActivity::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
            if (selectedCake.name == "Chocolate Cake") {
                val intent = Intent(this, CakeDetailsActivity1::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
            if (selectedCake.name == "Happy Birthday Icing Cake") {
                val intent = Intent(this, CakeDetailsActivity2::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
            if (selectedCake.name == "Wedding Cake") {
                val intent = Intent(this, CakeDetailsActivity3::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
            if (selectedCake.name == "Red Velvet Cake") {
                val intent = Intent(this, CakeDetailsActivity4::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
            if (selectedCake.name == "Carrot Cake") {
                val intent = Intent(this, CakeDetailsActivity5::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
            if (selectedCake.name == "Cheese Cake") {
                val intent = Intent(this, CakeDetailsActivity6::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
            if (selectedCake.name == "Coffee Cake") {
                val intent = Intent(this, CakeDetailsActivity7::class.java)
                intent.putExtra("cakeName", selectedCake.name)
                intent.putExtra("cakeImage", selectedCake.imageResId)
                intent.putExtra("cakeRating", selectedCake.rating)
                startActivity(intent)
            }
        }


        recyclerView.adapter = cakeAdapter

        // Initialize bottom navigation buttons
        val homeButton = findViewById<ImageView>(R.id.buttonHome)
        val profileButton = findViewById<ImageView>(R.id.buttonProfile)
        val cartButton = findViewById<ImageView>(R.id.buttonCart)
        val favoritesButton = findViewById<ImageView>(R.id.buttonFavorites)

        // Navigate to ProfileActivity when profile button is clicked
        profileButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    // Create sample cake data
    private fun createCakeList(): List<Cake> {
        return listOf(
            Cake("Black Forest Cake", 4.9f, R.drawable.black_forest_cake, false),
            Cake("Chocolate Cake", 4.8f, R.drawable.cake_chocolate, false),
            Cake("Happy Birthday Icing Cake", 4.6f, R.drawable.cake_birthday, false),
            Cake("Wedding Cake", 4.5f, R.drawable.cake_wedding, false),
            Cake("Red Velvet Cake", 4.9f, R.drawable.cake_red_velvet, false),
            Cake("Carrot Cake", 4.8f, R.drawable.cake_carrot, false),
            Cake("Cheese Cake", 4.6f, R.drawable.cake_cheese, false),
            Cake("Coffee Cake", 4.5f, R.drawable.cake_coffee, false)
        )
    }
}