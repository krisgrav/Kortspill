package com.example.kortspill.Model

data class CardStack(val stack: MutableList<Card>){

    /*
    Method that ensures that 52 cards are made, and added to the stack
     */
    fun sizeCheck(): Boolean {
        if(stack.size != 52){
            throw Exception("Stack size is wrong: ${stack.size}")
        }
        return true
    }
}
