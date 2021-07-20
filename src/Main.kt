/*
Interface
 - Kotlin 은 다중 상속을 지원하지 않습니다.
 - 이 때문에 자기 타입의 변수나 부모형 타입 변수에만 담을 수 있습니다.
 - 만약 생성된 객체의 주소 값을 다양한 타입의 변수에 담을 수 있도록 한다면 Interface 를 활용하면 됩니다.
 - Interface 는 객체가 아니므로 객체를 생성할 때 사용할 수 없습니다.
 - Class 는 한 개 이상의 Interface 를 구현할 수 있으며 생성된 객체는 구현한 Interface 형 참조 변수에 담을 수 있습니다.
 - Interface 는 추상 Method 와 일반 Method 모두를 구현해서 사용할 수 있습니다.
 - Interface 를 추상 Class 와 목적이 비슷하지만 하나의 Class 에 여러 Interface 를 구현할 수 있는 장점을 갖고 있습니다.
 */

fun main() {

    // 추상 Class 1 을 상속 받은 TestClass1 을 Obj1 에 초기화한다.
    val obj1 = TestClass1()
    // 추상 Class 2 를 상속 받은 TestClass2 을 Obj2 에 초기화한다.
    val obj2 = TestClass2()

    // Class 외부에 있는 Method testFunction1 을 실행시킨다.
    testFunction1(obj1)
    // Class 외부에 있는 Method testFunction2 를 실행시킨다.
    testFunction2(obj2)

}

// 추상 Class 1 생성
open abstract class AbstractClass1 {
    open abstract fun abstractMethod1()
}

// 추상 Class 2 생성
open abstract class AbstractClass2 {
    open abstract fun abstractMethod2()
}

// Test Method1 생성 (AbstractClass1 타입의 매개변수를 받는 Method) // 실행용 Method
fun testFunction1(obj1:AbstractClass1) {

    // 해당 추상 Class 를 호출하는 Method
    obj1.abstractMethod1()
}

// Test Method2 생성 (AbstractClass2 타입의 매개변수를 받는 Method) // 실행용 Method
fun testFunction2(obj2:AbstractClass2) {

    // 해당 추상 Class 를 호출하는 Method
    obj2.abstractMethod2()
}

// AbstractClass 를 상속 받는 Class 생성
class TestClass1 : AbstractClass1() {

    // AbstractClass1 의 Method 인 abstractMethod1 을 Overriding (재정의) 한 Method
    override fun abstractMethod1() {
        println("TestClass1 의 abstractMethod1")
    }
}

// AbstractClass 를 상속 받는 Class 생성
class TestClass2 : AbstractClass2() {

    // AbstractClass2 의 Method 인 abstractMethod2 를 Overriding (재정의) 한 Method
    override fun abstractMethod2() {
        println("TestClass2 의 abstractMethod2")
    }
}

// Interface /////////////////////
interface Inter1 {
    fun inter1Method1() {
        println("Inter1 의 inter1Method1 입니다.")
    }
    fun inter1Method2()
}

interface Inter2 {
    fun inter1Method1() {
        println("Inter1 의 inter1Method1 입니다.")
    }
    fun inter1Method2()
}

fun testFun3(obj1:Inter1) {

}



