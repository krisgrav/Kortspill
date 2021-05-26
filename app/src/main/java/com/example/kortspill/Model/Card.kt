package com.example.kortspill.Model

data class Card(val number: Int, val suit: String){
    override fun toString(): String {
        return "$suit $number"
    }
}
