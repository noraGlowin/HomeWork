fun main(args: Array<String>) {
    //qustion1
    print("please enter frist number here: ")
    var x = readLine()!! .toInt()
    print("please enter second number here: ")
    var y = readLine()!! .toInt()
    print("please enter operation (+, -, *, / , %) here: ")
    var operator = readLine()

    if (operator == "+"){
        println("the result is =${x + y} "  )
    }  else if (operator == "-"){
        println("the result is =${x - y}" )
    } else if (operator == "*"){
        println("the result is =${x * y} ")
    } else if (operator == "/"){
        println("the result is =${x / y} ")
    } else if (operator == "%"){
        println("the result is =${x % y} ")    }

    //qustion2
    println("please enter employee salary")
var salary = readLine()!!.toDouble()
    println("please enter employee rate from 1 to 3")
    var rate : Int= readLine()!!.toInt()
    var newSalary : Double = 1.0
    if (rate >=1 && rate<=3){
        if (rate==1){
            newSalary= salary/100 *6
            newSalary+=salary
            println(newSalary)
        } else if (rate==2){
            newSalary= salary/100 *4
            newSalary+=salary
            println(newSalary)
        }else if (rate==3){
            newSalary= salary/100 *1.5
            newSalary+=salary
            println(newSalary)
        }
    }else{
        println("please enter vaild rate from 1 to 3")
    }


}