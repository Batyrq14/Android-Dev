package com.example.dodopizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()


        items.add(Item(1,"wowkebab", "Wow! Kebab", "Beef kebab, ranch sauce, mozarella cheese, sweet pepper, tomatoes, red onion, marinara sauce","from 2900 tg", false))
        items.add(Item(2,"withmushrooms", "Pepperoni with mushrooms", "Chicken pepperoni, mozarella cheese, mushrooms, alfredo sauce","from 2000 tg", false))
        items.add(Item(3,"hampickes", "Ham&Pickles", "Ranch sauce, chicken ham, mozarella cheese, pickles, red onion","from 2000 tg", false))
        items.add(Item(4, "combo1", "KikoRiki Combo", "Approved by cartoon characters: small pizza of any flavor and young gardener's kit Combo price depends on the selected pizzas and may change.", "2200 tg", true))
        items.add(Item(5,"cheesy", "Cheesy", "Mozzarella cheese, cheddar cheese, parmesan cheese, Alfredo sauce","from 1900 tg", false))
        items.add(Item(6,"pepperonifresh", "Pepperoni Fresh", "Chicken pepperoni, extra mozzarella cheese, tomatoes, marinara sauce","from 1900 tg", false))
        items.add(Item(7,"doublecincken", "Double Chicken", "Double chicken, mozzarella cheese, Alfredo sauce","from 2100 tg", false))
        items.add(Item(8, "combo3", "Bavarian", "Spicy chorizo sausages, pickled cucumbers, red onions, tomatoes, mustard sauce, mozzarella, signature tomato sauce", "from 2400 tg", true))
        items.add(Item(9,"chorizo", "Chorizo fresh", "Spicy chorizo, sweet pepper, mozzarella cheese, marinara sauce","from 1900 tg", false))
        items.add(Item(10,"hamcheese", "Ham & Cheese", "Chicken ham, mozzarella cheese, Alfredo sauce","from 2000 tg", false))
        items.add(Item(11,"carbonara", "Carbonara", "Chicken ham, cheddar cheese, parmesan cheese, tomatoes, red onion, mozzarella cheese, Alfredo sauce, garlic, Italian seasoning","from 2400 tg", false))
        items.add(Item(12,"chessychicken", "Cheesy chicken", "Chicken, mozzarella cheese, cheddar cheese, parmesan cheese, cheese sauce, tomatoes, Alfredo sauce, garlic","from 2900 tg", false))


        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}