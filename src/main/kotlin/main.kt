fun main() {
    var userResponse: Int
    do {
        println("Pick a Starter Pokemon!")
        println("1) Squirtle")
        println("2) Charmander")
        println("3) Bulbasaur")
        println("4) Pikachu")
        println("5) Exit")
        userResponse = readln().toInt()
    }while (userResponse==0)
    if (userResponse==1)
        println("You picked Squirtle, the Water-Type!")
    else if (userResponse==2)
        println("You picked Charmander, the Fire-Type!")
    else if (userResponse==3)
        println("You picked Bulbasaur, the Grass-Type!")
    else if (userResponse==4)
        println("You picked Pikachu, the Electric-Type!")
    else
        println("...Well you're no fun.")

}