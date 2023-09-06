
import kotlin.math.*
import kotlin.math.sqrt
import kotlin.text.format as format1

fun main(args: Array<String>)
{
                     // 1 задача
    val  exercises: Int = 13 // обьявляю константу
    var exercisesSolved: Int = 0 // обьявляю переменную
    exercisesSolved +=1 //увеличиваю переменную  на  с каждой решенной задачей 1
                    // 2 задача
    val personAge: Int = 18 // обьявляю переменную
    println(personAge)
    exercisesSolved +=1
                      // 3 задача
    var  ageOfThePerson: Double = 18.0 // обьявляю константу
    println((ageOfThePerson + 30 )/2) // среднее арифметическое для возраста человека
    //24.0
    exercisesSolved +=1
                           //4 задача
    val testNumber: Int = 32
    val evenOdd: Int = (testNumber % 2)
     println(evenOdd)//0 , четный
     exercisesSolved +=1
                           //5 задача
     var answer : Int= 0
     answer += 1
     answer += 10
     answer *= 10 // в
     answer = answer shr 3 // присваиваю ответу сместиться на 3
     println( answer ) //13
     exercisesSolved +=1
                      //6 задача
     var age: Int
     age = 16
     println(age)
     age = 30
     println(age)
     //var так как в строчке 39 изменяется число и это переменная , а константы используются для значений не изменяемых
    exercisesSolved +=1
                 //7 задача
    val a: Int = 46
    val b: Int = 10
           //1
    val  answer1: Int = (a*100) + b //4610
          //2
    val  answer2: Int = (a*100) + (b*100) //5600
          //3
    val  answer3: Int = (a*100) + (b/10) //4601
    exercisesSolved +=1
                //8 задача
    (5*3)-((4/2)*2) //11
    exercisesSolved +=1
               //9 задача
    val a1: Double = 5.0
    val b1: Double = 9.5
    val average: Double = (a1+b1)/2 //вывожу среднее арифметическое
    println(average)
    exercisesSolved +=1
                   //10 задача
    val fahrenheit: Double = 104.5
    val celcius: Double = (fahrenheit - 32) / 1.8  // считаю температуру по цельсию  и из фарингейта вычитаю последующие увелечения на 32 и делю на 1.8
        // то есть делаю обратное фаренгейту
    println(celcius)
    exercisesSolved +=1
                     // 11 задача
    val position: Int = 33
    val row: Int = (position/8) // вычисляю строку их от 0 до 7
    val column: Int = (position%8) // вычисляю столб
    println(row)
    println(column)
    exercisesSolved +=1
                      //12 задача
    val degress: Double = 360.0
    val radians: Double = ( degress/180 )/PI // по формуле перехода от градусной меры к радианной
    println(radians)
    exercisesSolved +=1
                       //13 задача
    val x1: Double =( 1.5)
        val x2: Double =(4.0)
        val y1: Double =(3.7)
        val y2: Double =(6.0)
    val   xx: Double = (x2-x1)
    val yy: Double=(y2-y1)
            val distance: Double =sqrt(xx*xx+yy*yy) //возведение в степень
    println(distance)
    exercisesSolved +=1
}