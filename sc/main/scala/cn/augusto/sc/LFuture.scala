package cn.augusto.sc

import java.time.{LocalDateTime, LocalTime}

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.SerializeFilter

import scala.collection.mutable
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
/**
  * @Author: Augusto
  * @Description:
  * @Date: Created in 14:36 2018/2/7
  *
  */
class LFuture {
  
}

object LFuture {
  
  
  
  def main(args: Array[String]): Unit = {
    
    var arr = mutable.ArrayBuffer[Array[String]]()
    arr.append(Array("fdaklf", "fdakl", "fdakl"))
    arr.append(Array("b", "c", "d"))
    
    println(JSON.toJSONString(arr.toArray, Array[SerializeFilter]()))
  
    run(5)
    
    while(true){
      println(s"${LocalDateTime.now.toString} main thread -> ${Thread.currentThread().getId}")
      Thread.sleep(10 * 1000)
    }
  
  }
  
  def run(s: Int): mutable.Map[Int, Future[Int]] = {
    val map = mutable.Map[Int, Future[Int]]()
    runFuture(s)
    
    def runFuture(id: Int): Unit = {
      map.put(id, Future {
        Thread.sleep(1 * 1000)
        println(s"${LocalDateTime.now.toString} ${id} --> ${Thread.currentThread().getId}")
       
        id
      })
      
      map.get(id).get.onComplete{
        case Success(v1) => {
          println(s"${LocalDateTime.now.toString} ${map.get(id).get.isCompleted} -> ${id}, thread --> ${Thread.currentThread().getId}")
          runFuture(id + 1)
        }
        case Failure(v1) => {
          v1.printStackTrace()
        }
      }
    }
    
    map
  }
  
}