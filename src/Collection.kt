// Collection.kt - Часть 4: Maps

fun main() {
    println("=== МАССИВЫ (ARRAYS) ===\n")
    
    val solarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println("Размер массива: ${solarSystem.size}")
    println("Третья планета: ${solarSystem[2]}")
    
    solarSystem[3] = "Mars (Red Planet)"
    println("Изменённый Mars: ${solarSystem[3]}")
    
    println("\nВсе планеты:")
    for (planet in solarSystem) {
        println(planet)
    }
    
    println("\n=== СПИСКИ (LISTS) ===\n")
    
    val solarSystemList = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println("Размер списка: ${solarSystemList.size}")
    println("Первый элемент: ${solarSystemList[0]}")
    println("Индекс Earth: ${solarSystemList.indexOf("Earth")}")
    
    val mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars")
    println("\nНачальный список: $mutableSolarSystem")
    
    mutableSolarSystem.add("Jupiter")
    println("После добавления: $mutableSolarSystem")
    
    mutableSolarSystem.add(2, "Earth (Home)")
    println("После вставки: $mutableSolarSystem")
    
    mutableSolarSystem[3] = "Mars (Red Planet)"
    println("После замены: $mutableSolarSystem")
    
    mutableSolarSystem.removeAt(2)
    println("После удаления по индексу: $mutableSolarSystem")
    
    mutableSolarSystem.remove("Mercury")
    println("После удаления по значению: $mutableSolarSystem")
    
    println("\n=== МНОЖЕСТВА (SETS) ===\n")
    
    val planetsSet = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println("Размер множества: ${planetsSet.size}")
    
    planetsSet.add("Pluto")
    println("После добавления Плутона: $planetsSet")
    
    planetsSet.add("Pluto")
    println("После повторного добавления: $planetsSet")
    
    planetsSet.remove("Pluto")
    println("После удаления: $planetsSet")
    
    println("\n=== СЛОВАРИ (MAPS) ===\n")
    
    val satellites = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2
    )
    
    println("Размер карты: ${satellites.size}")
    println("Спутники Земли: ${satellites["Earth"]}")
    
    satellites["Jupiter"] = 79
    satellites["Saturn"] = 83
    println("После добавления: $satellites")
    
    satellites.remove("Mars")
    println("После удаления Марса: $satellites")
    
    satellites["Earth"] = 2
    println("После обновления Земли: $satellites")
}