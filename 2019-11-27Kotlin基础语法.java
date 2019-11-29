class TestMain {

    /**
     * 在所在的类被初始化的时候调用
     */
    companion object {
        //伴生对象
        //静态代码块，类似java的static方法

        /**
         * main函数
         */
        @JvmStatic
        fun main(args: Array<String>) {
            //用中缀注解调用扩展函数
            val i = 2 shls 3
            val b = 2.shls(2)

            val read = 2.read()

            System.out.println("i=$i")
            System.out.println("b=$b")
            System.out.println("read=$read")
        }

        /**
         * 相当于静态代码块，类初始化的时候调用，一般存放对象初始化参数
         * 在伴生对象之后调用，例如： test()
         * 会先调用companion object（伴生对象）
         * 然后才会调用init方法
         */
        init {

        }
        /**
         * infix    关键字,必须是成员函数或者扩展函数，他们必须只有一个参数
         *          中缀函数调用的优先级低于算术操作符，类型转换以及rangeTo操作符
         *          中缀函数调用的优先级高于布尔操作符&&与||，is-与in-检测以及其他一些操作符
         * this = Int
         *
         */
        infix fun Int.shls(x: Int): Int {
            return this + x
        }

        /**
         * 函数参数是用Pascak符号定义的，x:Int。参数之间用逗号隔开，每个参数必须指明类型
         * x:Int = 0,当参数使用默认值时，不传递参数会使用默认值，这样相比其他语言可以减少重载
         *
         * return Int
         */
        fun Int.read(a: Int? = 0) = a

        /**
         * Unit不带返回参数的函数,Unit也可以直接省略不写
         */
        fun helloUnit(): Unit {

        }

        /**
         * 方法中可以传递方法参数
         */
        fun methd(test: () -> Unit) {
            test()
        }



    }


}
