# Observer Design Pattern

|Name|Type|A.K.A.|
|---|---|---|
|Observer|Behavioral|<ul><li>Dependents</li><li>Publish-Subscribe</li></ul>|

### Explanation

Observer pattern is used to

### In Plain Words

> Add observers to receive state changes in the object

### Wikipedia says

> The observer pattern is a software design pattern in which an object, named the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

### Example

Item is an observable class and any PriceObserver instances can be register in Item object to notify when any price
changes.

```kotlin
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

}

class Discount(val percentage: Float, val hour: UInt)

```

```kotlin
interface PriceObserver {

    fun update(discount: Discount, item: Item)

}

class UpdateDiscountedItemListObserver(val discountedItemList: MutableList<Item>) : PriceObserver {

    override fun update(discount: Discount, item: Item) {
        if (!discountedItemList.contains(item)) {
            discountedItemList.add(item)
            println("Item ${item.name} is added to discounted list")
        }
    }

}

class SendNotificationObserver(private val threshold: Float) : PriceObserver {

    override fun update(discount: Discount, item: Item) {
        if (threshold <= discount.percentage)
            println("Notification: ${item.name} is now ${item.price}\$, ${discount.percentage * 100}% discount for ${discount.hour} hour")
        else
            println("Notification: ${item.name} is now ${item.price}\$")
    }

}
```

Main Function

```kotlin
fun main() {

    val discountedItemList: MutableList<Item> = mutableListOf()

    val item = Item("Knife", 10f)
    item.addObserver(UpdateDiscountedItemListObserver(discountedItemList))
    item.addObserver(SendNotificationObserver(0.2f))

    item.updatePrice(Discount(0.10f, 2u))
    item.updatePrice(Discount(0.50f, 5u))
    item.updatePrice(Discount(0.25f, 4u))

}
```

Program Output

```
Item Knife is added to discounted list
Notification: Knife is now 9.0
Notification: Knife is now 4.5$, 50.0% discount for 4 hour
Notification: Knife is now 3.375$, 25.0% discount for 5 hour
```

### Real World Examples

- java.util.Observer
- java.util.EventListener
- [RxJava](https://github.com/ReactiveX/RxJava)
- [Reactor](https://github.com/reactor/reactor)
