/**
 * 属性和字段
 */
class TestMain20191129 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
        }

        //变量使用 var表示
        //常量使用 val表示

        //调用对象字段 or 方法和java一样，创建对象实例并点出来
        //例如
        //var a = A()
        //a.test()

        //备用属性
        //相当于给对象赋初始值

        //延迟初始化属性 lateinit 关键字
        //例如 lateinit var a : A
        //解析: 这是只是定义了一个类型为a的属性（实例），这时候他没有值
        //需要在使用这个a之前对它进行初始化

        //by lazy 也就是java中的懒加载
        //by lazy 的实例只有在调用该实例的时候才会对它进行初始化，且只会创建一个实例对象


    }
}