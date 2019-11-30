/**
 * 类和继承
 */
class TestMain20191129 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
        }

        //构造函数
//        constructor(){}

        //代码初始化
        init {
        }

        //创建类的实例,注意kotlin里面没有new关键字
        var entity = TestMain20191129

        //密封类，必须在class 之前加上sealed 修饰
        //用语代表严格的类格式，值只能是有限集合中的某种类型，不可以是任何其他类型

        //继承父类方法 or 实现接口都是通过 : 来操作的
        //比如 class a : A{}

        //嵌套类
        //类可以嵌套在其他类中
        //例如
        TestMain20191129.test().getMessage()

        

    }
    class test{
            fun getMessage() = 2
        }
}