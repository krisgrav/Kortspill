package com.example.kortspill.Util

import android.app.Application
import android.content.res.Resources
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kortspill.Model.Card
import com.example.kortspill.R
import com.example.kortspill.View.MainActivity
import java.security.AccessController.getContext
import kotlin.coroutines.coroutineContext

class CardAdapter (private var cards: MutableList<Card>): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.updateCard(cards[position])
    }

    override fun getItemCount(): Int {
        return cards.size
    }

}
class ViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
    private var topText: TextView = itemview.findViewById(R.id.card_top_text)
    private var image: ImageView = itemview.findViewById(R.id.card_image)
    private var bottomText: TextView = itemview.findViewById(R.id.card_bottom_text)

    fun updateCard(card: Card){
        var cardNumber = card.number.toString()
        when(cardNumber){
            "1" -> {cardNumber = "A"}
            "11" -> {cardNumber = "J"}
            "12" -> {cardNumber = "Q"}
            "13" -> {cardNumber = "K"}
        }
        when(card.suit){
            "hearts" -> {
                topText.text = cardNumber
                topText.setTextColor(Color.parseColor("#c10808"))
                bottomText.text = cardNumber
                bottomText.setTextColor(Color.parseColor("#c10808"))
                image.setImageResource(R.drawable.hearts)
            }
            "diamonds" -> {
                topText.text = cardNumber
                topText.setTextColor(Color.parseColor("#c10808"))
                bottomText.text = cardNumber
                bottomText.setTextColor(Color.parseColor("#c10808"))
                image.setImageResource(R.drawable.diamonds)

            }
            "clubs" -> {
                topText.text = cardNumber
                topText.setTextColor(Color.parseColor("#FF000000"))
                bottomText.text = cardNumber
                bottomText.setTextColor(Color.parseColor("#FF000000"))
                image.setImageResource(R.drawable.clubs)

            }
            "spades" -> {
                topText.text = cardNumber
                topText.setTextColor(Color.parseColor("#FF000000"))
                bottomText.text = cardNumber
                bottomText.setTextColor(Color.parseColor("#FF000000"))
                image.setImageResource(R.drawable.spades)
            }
        }
    }

}
