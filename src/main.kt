fun main() {
   //question 1
    school()

    //question2
    myNames()

    //question 3
   noOfchar("assignmemt")

    //question4
    myIdentity("sarah")
    myIdentity("joana")


}


//question1
fun school(){
var campus = "akirachix"
var char1 = campus[0]
var char2 = campus[2]
var char3 = campus[3]
var result = campus[0].toString() + campus[2] + campus[3]
println(result)
}


//question2
fun myNames(){
var fullName = "joana"
var age = 16
println("Hi, my name is $fullName and I am $age years old.")
}

//question3
fun noOfchar(x:String):Int{
return x.length
}

fun myIdentity(name:String){
    if (name == "sarah") {
        println("That's me!")
    } else{
        println("I don’t know who that is")
    }

}
   

