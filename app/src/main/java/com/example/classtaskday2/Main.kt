package com.example.classtaskday2

fun main(){


    val name : String = "Mohammed";
    val age: Int = 24;
    val decimalNumber : Double = 132.43;
    val isEmployee : Boolean = false;

    println("My Name is $name my age is $age random number is $decimalNumber am I employee $isEmployee")


    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers[4])


    val fruits = mutableListOf("Apple", "Banana", "Watermelon")
    fruits.add("Blueburry")
    println(fruits)


    val uniqueNumbers = setOf(10,20,30, 10, 20)
    println(uniqueNumbers);

    val studentMarks = mapOf("Mohammed" to 90,"Abdulaziz" to 95 )
    println(studentMarks["Mohammed"])


    val  studentGrade: Int = 24;

    if(studentGrade >= 60){
        println("pass")
    }
    else{
        println("Fail")
    }

    val sum: (Int, Int) -> Int = {a,b -> a+b}
    println(sum(5, 3))


}

