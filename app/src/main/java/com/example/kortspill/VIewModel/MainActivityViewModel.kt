package com.example.kortspill.VIewModel

import androidx.lifecycle.ViewModel
import com.example.kortspill.Model.Card
import com.example.kortspill.Model.CardStack

class MainActivityViewModel: ViewModel() {

    fun createStack(): CardStack{
        val stack = mutableListOf<Card>()
        var counter = 1
        while(counter > 14){
            stack.add(Card(counter, "hearts"))
            counter++
        }
        counter = 0
        while(counter > 14){
            stack.add(Card(counter, "diamonds"))
            counter++
        }
        counter = 0
        while(counter > 14){
            stack.add(Card(counter, "clubs"))
            counter++
        }
        counter = 0
        while(counter > 14){
            stack.add(Card(counter, "spades"))
            counter++
        }
        val completedStack = CardStack(stack)
        completedStack.sizeCheck()
        return completedStack
    }
}