package Demo

import java.util.regex.Pattern

import org.scalatest.FunSuite

import scala.io.Source

class demoparseTest extends FunSuite {

  test("testParseFunction") {
//
//    def parseFunction(){
//      val file = Source.fromFile("FromWhereITakeLog.txt");
//      val line = file.getLines.toList;
//      file.close();
//
//      var i = 0;
//      var li = List[String]()
//      /*-----------------------------------------------Some Informations About The Regular Expression That I Use To parse The Log Given to me------------------------*/
//      val rexdt = "\\[([^\\]]+)\\]"; // something between [ and ]
//      val rexi = "(\\d+)"; // unsigned integer
//      val rexa = "(\\d+(?:\\.\\d+){3})"; // an IP address
//      val rexstr = "\"([^\"]*?)\""; // a quoted string
//      val rexs = "(\\S+)"; // a single token (no spaces)
//
//
//
//      val pattern = String.join(" ", rexa, rexs, rexs, rexdt, rexstr, rexi, rexi, rexs, rexstr);
//      val r = Pattern.compile(pattern)
//
//
//      while (i < line.size) {
//        val m = r.matcher(line.apply(i).toString())
//
//
//        if (m.find()) {
//          li ::= ("@IP: " + m.group(1)).toString + "\n" + ("Date&Time: " + m.group(4)).toString + "\n" + ("GET: " + m.group(5)).toString + "\n" + ("Port1: " + m.group(6)).toString + "\n" + ("Port2: " + m.group(7)).toString + "\n" + ("localhost@ " + m.group(8)).toString + "\n" + ("browser: " + m.group(9)).toString + "\n" + "\n" + "\n";
//          //        val S = ("@IP: " + m.group(1)).toString+"/n" + ("Date&Time: " + m.group(4)).toString+"/n" + ("GET: " + m.group(5)).toString+"/n" + ("P1: " + m.group(6)).toString+"/n" + ("P2: " + m.group(7)).toString+"/n" + ("localhost@ " + m.group(8)).toString+"/n" + ("browser: " + m.group(9)).toString+"/n" + "\n"
//        }
//
//        else {
//          System.out.println("NO MATCH");
//        }
//
//        i = i + 1
//
//        // println(li)//to display result on terminal using the command sbt-run
//      }}
  }

}
