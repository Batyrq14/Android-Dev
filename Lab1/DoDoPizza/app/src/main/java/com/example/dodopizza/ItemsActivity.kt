//package com.example.dodopizza
//
//import android.annotation.SuppressLint
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.Recycler
//
//class ItemsActivity : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_items)
//
//        val itemsList: RecyclerView = findViewById(R.id.itemsList)
//        val items = arrayListOf<Item>()
//
//
//        items.add(Item(1,"wowkebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(2,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(3,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(4,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(5,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(6,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(7,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(8,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(9,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//        items.add(Item(10,"Wow! Kebab", "a", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce", "m", 100))
//
//        itemsList.layoutManager = LinearLayoutManager(this)
//        itemsList.adapter = ItemsAdapter(items, this)
//
//    }
//}