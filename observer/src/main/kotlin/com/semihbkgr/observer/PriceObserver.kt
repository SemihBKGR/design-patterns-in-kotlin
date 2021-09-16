package com.semihbkgr.observer

interface PriceObserver {

    fun update(discount:Discount,item:Item)

}

class UpdateDiscountedItemListObserver(val discountedItemList:MutableList<Item>) : PriceObserver{

    override fun update(discount: Discount, item: Item) {
        if(!discountedItemList.contains(item)){
            discountedItemList.add(item)
            println("Item ${item.name} is added to discounted list")
        }
    }

}

class SendNotificationObserver(private val threshold:Float): PriceObserver {

    override fun update(discount: Discount, item: Item) {
        if(threshold<=discount.percentage)
            println("Notification: ${item.name} is now ${item.price}\$, ${discount.percentage*100}% discount for ${discount.hour} hour")
    }

}


