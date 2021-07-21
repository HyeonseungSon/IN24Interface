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

    // Interface ////////////////////////////////////////////////////////////////////////

    // Interface 는 Class 가 아니기 때문에 객체를 생성할 수 없습니다.
    // val obj3 = Inter1
    // val obj4 = Inter2

    // Interface 를 구현한 TestClass3 과 TestClass4 를 객체화합니다.
    val obj3 = TestClass3()
    val obj4 = TestClass4()

    // 일반 Method 를 호출하면서 객체화한 Class 를 넣습니다.
    testFun3(obj3)
    testFun4(obj4)

    val obj5 = TestClass5()
    testFun3(obj5)
    testFun4(obj5)
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

// Interface /////////////////////////////////////////////////////////////////////////

interface Inter1 {
    fun inter1Method1() {
        println("Inter1 의 inter1Method1 입니다.")

    }
    fun inter1Method2() {
        println("Inter1 의 inter1Method2 입니다.")
    }
}

interface Inter2 {
    fun inter2Method1() {
        println("Inter2 의 inter2Method1 입니다.")
    }
    fun inter2Method2() {
        println("Inter2 의 inter2Method2 입니다.")
    }
}

fun testFun3 (obj1:Inter1) { // Inter1 을 구현한 TestClass3 = obj1
    obj1.inter1Method1()
    obj1.inter1Method2()
}

fun testFun4 (obj1:Inter2) {
    obj1.inter2Method1()
    obj1.inter2Method2()
}

// Interface1 을 구현한 Class 를 생성합니다. (Interface 를 객체로 생성하기 위해 Class 를 생성하는 것입니다.)
class TestClass3 : Inter1 {

    // Interface 의 Method 를 Overriding 합니다.
    override fun inter1Method2() {
        println("TestClass3 의 inter1Method2 입니다.")
    }

    override fun inter1Method1() {
        println("TestClass3 의 inter1Method1 입니다.")
    }
}

// Interface2 를 구현한 Class 를 생성합니다. (Interface 를 객체로 생성하기 위해 Class 를 생성하는 것입니다.)
class TestClass4 : Inter2 {

    // Interface 의 Method 를 Overriding 합니다.
    override fun inter2Method2() {
        println("TestClass4 의 inter2Method2 입니다.")
    }
}

class TestClass5 : Inter1, Inter2 {

    override fun inter1Method2() {
        println("testClass5 의 inter1Method2 입니다.")
    }

    override fun inter2Method2() {
        println("testClass5 의 inter2Method2 입니다.")
    }
}









