import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecoration = false))
    println(canAddFish(9.0, listOf(1,1,3),3))
    println(canAddFish(10.0, listOf(),7, true))
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thuesday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thuesday"-> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "other food"
    }
}

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20) : Boolean {
    return true
}
fun canAddFish(
        size: Double,
        list: List<Int>,
        fishSize: Int = 2,
        hasDecoration: Boolean = true
        ): Boolean {
    return (if(hasDecoration) size*0.8 else size).minus(list.sum()).minus(fishSize)>=0
}