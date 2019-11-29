/**
 * 基本类型
 */
class TestMain20191129 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(12.inv())
        }

        //显示转换
        //低精度类型不会隐式转换成高精度类型,所以需要显示转换才能把Int赋值给Byte
        val b = 1.toByte()

        //运算符
        //一下运算操作符只能用在Int和Long类型
//        shl(bits) - 有符号左移（相当于java <<）
//        shr(bits) - 有符号右移（相当于java >>）
//        ushr(bits) - 无符号右移（相当于java >>>）
//        and(bits) - 与
//        or(bits) - 或
//        xor(bits) - 异或
//        inv(bits) - 翻转

        //when 表达式
        fun testWhen() {
            var x = 1
            when (x) {
                1 -> {
                }
                2 -> {
                }
                in 0..10 -> { //是否是0到10之间
                }
                !in 0..20 -> {
                    //不在0到20之间
                }
                else -> {
                    //当上面都不成立时执行else方法
                }
            }
        }


        //返回与跳转
        fun testBackOrJump(){
            var a = ""
            val message = a.isEmpty() ?: return
        }

        //其余和java基本一致
    }
}