fun main() {
    //question1
    
    var campus = "akirachix"
    var char1 = campus[0]
    var char2 = campus[2]
    var char3 = campus[3]
    var result = campus[0].toString() + campus[2] + campus[3]
    println(result)
    
    //question2

    var fullName = "joana"
    var age = 16
    println("Hi, my name is $fullName and I am $age years old.")

    //question3
    
    val hoMwk = "assignment"
    println("The lenght of the string is: " + hoMwk.length)

    //question4
    var myName = "sarah"
    if (myName == "mike") {
        println("That's me!")
    } else{
        println("I don’t know who that is")
    }
    var fName = "sarah"
    if (myName == "sarah") {
        println("That's me!")
    } else{
        println("I don’t know who that is")
    }
}
