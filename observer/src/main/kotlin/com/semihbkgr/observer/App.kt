package com.semihbkgr.observer

fun main(){

    val discountedItemList:MutableList<Item> = mutableListOf()

    val item=Item("Knife",10f)
    item.addObserver(UpdateDiscountedItemListObserver(discountedItemList))
    item.addObserver(SendNotificationObserver(0.2f))

    item.updatePrice(Discount(0.10f,2u))
    item.updatePrice(Discount(0.50f,5u))
    item.updatePrice(Discount(0.25f,4u))

}