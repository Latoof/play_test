// @SOURCE:/mnt/Programmes/UNIX/Code/play_test/conf/routes
// @HASH:b1d58e923ba237c71b2a01891a15f2bce8d5b144
// @DATE:Wed Oct 03 19:24:29 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_mmm1 = Route("GET", PathPattern(List(StaticPart("/mmm"))))
                    

// @LINE:8
val controllers_Application_testid2 = Route("GET", PathPattern(List(StaticPart("/testid/"),DynamicPart("id", """[0-9]+"""))))
                    

// @LINE:9
val controllers_Application_connecter3 = Route("GET", PathPattern(List(StaticPart("/connect/"),DynamicPart("username", """[^/]+"""))))
                    

// @LINE:12
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/mmm""","""controllers.Application.mmm()"""),("""GET""","""/testid/$id<[0-9]+>""","""controllers.Application.testid(id:Long)"""),("""GET""","""/connect/$username<[^/]+>""","""controllers.Application.connecter(username:String)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_mmm1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.mmm(), HandlerDef(this, "controllers.Application", "mmm", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_testid2(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.testid(id), HandlerDef(this, "controllers.Application", "testid", Seq(classOf[Long])))
   }
}
                    

// @LINE:9
case controllers_Application_connecter3(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(_root_.controllers.Application.connecter(username), HandlerDef(this, "controllers.Application", "connecter", Seq(classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                