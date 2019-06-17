package client

import java.awt.FlowLayout
import java.util.*
import javax.swing.*


class Client{

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val thread: ThreadDraw = ThreadDraw()
            thread.start()
        }
    }

}


class ThreadDraw: Thread(){

    private var window: JFrame? = null
    private val x: Int = 400
    private val y: Int = 400
    private val width: Int = 1200
    private val height: Int = 800

    override fun run(){
        init()
    }


    private fun init(){
        window = JFrame("安卓手机助手😁😍")
        window!!.setBounds(x,y,width,height)
        window!!.isResizable = false

        val menus = JMenuBar()

        val menu1 = JMenu("开始")
        val menu2 = JMenu("编辑")
        val menu3 = JMenu("工具")
        val menu4 = JMenu("设置")
        val menu5 = JMenu("关于")
        val menu6 = JMenu("退出")

        val menu11png = this.javaClass.
                getResource("/images/outline_info_black_18.png")!!
        val menu12png = this.javaClass.
                getResource("/images/baseline_bookmark_black_18.png")!!
        val menu41png = this.javaClass.
                getResource("/images/outline_build_black_18.png")!!

        val menu11 = JMenuItem("导航",ImageIcon(menu11png))
        val menu12 = JMenuItem("打开",ImageIcon(menu12png))

        val menu41 = JMenuItem("偏好设置",ImageIcon(menu41png))

        menu1.add(menu11)
        menu1.add(menu12)

        menu4.add(menu41)

        menus.add(menu1)
        menus.add(menu2)
        menus.add(menu3)
        menus.add(menu4)
        menus.add(menu5)
        menus.add(menu6)

        val flowLayout = FlowLayout()

        window!!.layout = flowLayout


        val checkBox1 = JCheckBox("喜欢音乐")
        val checkBox2 = JCheckBox("喜欢运动")

        val comBox = JComboBox<String>()

        val group = ButtonGroup()
        val radioM = JRadioButton("男")
        val radioF = JRadioButton("女")
        group.add(radioM)
        group.add(radioF)

        comBox.addItem("游戏天地")
        comBox.addItem("武术世界")


        window!!.add(checkBox1)
        window!!.add(checkBox2)

        window!!.add(comBox)
        window!!.add(radioF)
        window!!.add(radioM)

        window!!.jMenuBar = menus

        window!!.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        window!!.isVisible = true






    }
}