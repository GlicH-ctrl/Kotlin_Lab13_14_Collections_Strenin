data class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

fun main() {
    val cookies = listOf(
        Cookie("Печенье с шоколадом", false, false, 1.69),
        Cookie("Ванильный крем", false, true, 1.59),
        Cookie("Нуга ореховая", true, true, 1.49),
        Cookie("Сникерс", true, true, 1.39),
        Cookie("Черничный пирог", true, true, 1.79),
        Cookie("Шоколадно-арахисовое масло", false, true, 1.49),
        Cookie("Сахар и посыпка", false, false, 1.39)
    )
    
    println("=== forEach() ===\n")
    
    cookies.forEach {
        println("${it.name} - $${it.price}")
    }
    
    println("\n=== map() ===\n")
    
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    
    fullMenu.forEach {
        println(it)
    }
    
    println("\n=== filter() ===\n")
    
    val softBakedMenu = cookies.filter {
        it.softBaked
    }
    
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    
    println("\n=== groupBy() ===\n")
    
    val groupedMenu = cookies.groupBy { it.softBaked }
    
    val softBaked = groupedMenu[true] ?: emptyList()
    val crunchy = groupedMenu[false] ?: emptyList()
    
    println("Мягкое печенье:")
    softBaked.forEach { println("  ${it.name} - $${it.price}") }
    
    println("\nХрустящее печенье:")
    crunchy.forEach { println("  ${it.name} - $${it.price}") }
    
    println("\n=== fold() ===\n")
    
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    
    println("Общая стоимость: $${"%.2f".format(totalPrice)}")
    
    println("\n=== sortedBy() ===\n")
    
    val alphabeticalMenu = cookies.sortedBy { it.name }
    
    println("Меню в алфавитном порядке:")
    alphabeticalMenu.forEach { println("  ${it.name}") }
}