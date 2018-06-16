package cn.augusto

import com.alibaba.fastjson.JSON

/**
  * @Author: Augusto
  * @Description:
  * @Date: Created in 9:59 2018/1/26
  *
  */
class LearnJSON {
  
}

object LearnJSON {
  def main(args: Array[String]): Unit = {
    //    val strArr : Array[String] = Array[String]("123","5555")
    //    println( JSON.toJSONString(strArr, Array[SerializeFilter]()) )
    //
    //    val jsStr = "[]"
    //    val arr = JSON.parseArray(jsStr, classOf[String])
    //    println(arr)
    //    println(arr.getClass)
    //
    //    val jsStr2 = JSON.toJSONString(strArr, Array[SerializeFilter]())
    val arr2 = JSON.parseArray("[]", classOf[String]).toArray
    println(arr2)
    
    for (item <- arr2) {
      println(item)
    }
    println(Array[String]().getClass)
  }
}