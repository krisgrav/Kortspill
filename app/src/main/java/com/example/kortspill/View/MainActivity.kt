package com.example.kortspill.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kortspill.Model.Card
import com.example.kortspill.R
import com.example.kortspill.Util.CardAdapter
import com.example.kortspill.ViewModel.MainActivityViewModel
import com.example.kortspill.databinding.CardLayoutBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    val viewModel = MainActivityViewModel()
    lateinit var adapter: CardAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cardStack = viewModel.createStack()
        for(card in cardStack.stack) Log.d(TAG, card.toString())


        adapter = CardAdapter(cardStack.stack)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    fun createCardUI(card: Card){
        val binding = CardLayoutBinding.inflate(layoutInflater)
        var cardNumber = card.number.toString()

        when(cardNumber){
            "1" -> {cardNumber = "A"}
            "11" -> {cardNumber = "J"}
            "12" -> {cardNumber = "Q"}
            "13" -> {cardNumber = "K"}
        }
        when(card.suit){
            "hearts" -> {
                binding.cardTopText.text = cardNumber

                binding.cardImage.setImageResource(R.drawable.hearts)
                binding.cardBottomText.text = cardNumber
            }
            "diamonds" -> {
                binding.cardTopText.text = cardNumber
                binding.cardImage.setImageResource(R.drawable.diamonds)
                binding.cardBottomText.text = cardNumber
            }
            "clubs" -> {
                binding.cardTopText.text = cardNumber
                binding.cardImage.setImageResource(R.drawable.clubs)
                binding.cardBottomText.text = cardNumber
            }
            "spades" -> {
                binding.cardTopText.text = cardNumber
                binding.cardImage.setImageResource(R.drawable.spades)
                binding.cardBottomText.text = cardNumber
            }
        }
    }

}