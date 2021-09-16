package com.semihbkgr.observer

class Item(val name: String, var price: Float) {

    val observerList: MutableList<PriceObserver> = mutableListOf<PriceObserver>()

    fun addObserver(priceObserver: PriceObserver) {
        this.observerList.add(priceObserver)
    }

    fun removeObserver(priceObserver: PriceObserver) {
        this.observerList.remove(priceObserver)
    }

    fun updatePrice(discount: Discount) {
        price *= (1f - discount.percentage)
        observerList.forEach { it.update(discount, this) }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

}