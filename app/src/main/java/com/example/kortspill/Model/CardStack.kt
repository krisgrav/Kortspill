package com.example.kortspill.Model

data class CardStack(val stack: MutableList<Card>){
    fun sizeCheck(): Boolean {
        if(stack.size != 52){
            throw Exception("Stack size is wrong: ${stack.size}")
        }
        return true
    }
}
