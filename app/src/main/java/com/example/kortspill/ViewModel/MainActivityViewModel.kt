package com.example.kortspill.ViewModel

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.kortspill.Model.Card
import com.example.kortspill.Model.CardStack
import com.example.kortspill.databinding.CardLayoutBinding

class MainActivityViewModel: ViewModel() {
    private val TAG = "MainActivityViewModel"

    /*
    Method that creates 13*2 cards and returns a CardStack object.
     */
    fun createStack(): CardStack{
        val stack = mutableListOf<Card>()
        var counter = 1
        while(counter < 14){
            stack.add(Card(counter, "hearts"))
            counter++
        }
        counter = 1
        while(counter < 14){
            stack.add(Card(counter, "diamonds"))
            counter++
        }
        counter = 1
        while(counter < 14){
            stack.add(Card(counter, "clubs"))
            counter++
        }
        counter = 1
        while(counter < 14){
            stack.add(Card(counter, "spades"))
            counter++
        }
        val completedStack = CardStack(stack)
        completedStack.sizeCheck()
        Log.d(TAG, "Created stack of ${completedStack.stack.size} cards.")
        return completedStack
    }


}