/**
 * kotlin的习惯用语
 */
class TestMain20191128 {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            var list = ArrayList<String>()
            list.add("a")
            list.add("b")
            list.add("c")

            //过滤list, return list里面非a的值
            val posivives = list.filter { it != "a" }
            System.out.println("过滤之后的list值=$posivives")

            //字符串插值
            val name = "小明"
            println("我的名字是$name")

            //when 循环(实例检查)
            val x = "a"
            when (x) {
                "a" -> {
                    println("这是a")
                }
                "b" -> {
                    println("这是b")
                }
            }

            //遍历map/list键值对,其中i = key j = value 可以随便命名
            var map = HashMap<String, String>()
            map["one"] = "a"
            map["two"] = "b"
            map["three"] = "c"
            for ((i, j) in map) {
                println("key=$i,value=$j")
            }

            //使用ranges循环
            //闭区间 包括3
            for (a in 1..3) {
                println("闭区间--$a")
            }
            //半开区间，不包括3
            for (a in 1 until 3) {
                println("半开区间--$a")
            }
            //当为2时直接执行下一个
            for (a in 1..3 step 2) {
                println("step--$a")
            }
            //正序遍历从2开始到3
            for (a in 3 downTo 2) {
                println("downTo--$a")
            }

            //只可读的list
            val listOf = listOf("a", "b", "c")

            //只可读的map
            val mapOf = mapOf("a" to "0", "b" to "1")

            //懒加载(延迟加载)当使用到的时候才会去初始化
            val lazyTest: String by lazy { "1" }

            //扩展函数
            fun String.test(message: String): String {
                return this + message
            }
            println("这是扩展函数".test("---哈哈哈"))

            println(Tests.name)

            //如果不为空则...的简写
            val files = File("Test").listFiles()
            println(files?.size)

            //如果不为空...否则...的简写
            println(files?.size ?: "empty")

            //如果生命为空执行某操作
            var date = "11"
            date?.let {
                println("date不为空")//如果不为空执行该语句块
            }

            //返回when判断
            fun transForm(messag: String): Int {
                return when (messag) {
                    "1" -> 0
                    else -> throw IllegalArgumentException("Invalid color param value")
                }
            }
            println(transForm("1"))
//            println(transForm(""))

            //try-catch 表达式
            fun test(){
                val result = try {
                    transForm("1")
                    //...执行操作
                }catch (e:ArithmeticException){
                    throw IllegalStateException(e)
                }
                println(result)
            }
            test()

            //if表达式
            fun foot(messag:Int){
                val result = if (messag==1){
                    "one"
                }else if (messag==2){
                    "two"
                    //...执行操作
                }else{
                    "three"
                    //...执行操作
                }
            }

            //使用生成器模式返回Unit
            fun arrayOfMinusOnes(message:Int):IntArray{
                return IntArray(message).apply { fill(-1) }
            }
            println(arrayOfMinusOnes(3))

            //单表达式函数
            fun testAnswer() = "单表达式函数"
            println(testAnswer())




        }

        //创建单例模式
        object Tests {
            val name = "my name is 小明"
        }

    }
}