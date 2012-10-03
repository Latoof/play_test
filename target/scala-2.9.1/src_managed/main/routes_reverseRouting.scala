// @SOURCE:/mnt/Programmes/UNIX/Code/play_test/conf/routes
// @HASH:b1d58e923ba237c71b2a01891a15f2bce8d5b144
// @DATE:Wed Oct 03 19:24:29 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def mmm() = {
   Call("GET", "/mmm")
}
                                                        
 
// @LINE:8
def testid(id:Long) = {
   Call("GET", "/testid/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:9
def connecter(username:String) = {
   Call("GET", "/connect/" + implicitly[PathBindable[String]].unbind("username", username))
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def mmm = JavascriptReverseRoute(
   "controllers.Application.mmm",
   """
      function() {
      return _wA({method:"GET", url:"/mmm"})
      }
   """
)
                                                        
 
// @LINE:8
def testid = JavascriptReverseRoute(
   "controllers.Application.testid",
   """
      function(id) {
      return _wA({method:"GET", url:"/testid/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:9
def connecter = JavascriptReverseRoute(
   "controllers.Application.connecter",
   """
      function(username) {
      return _wA({method:"GET", url:"/connect/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", username)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def mmm() = new play.api.mvc.HandlerRef(
   controllers.Application.mmm(), HandlerDef(this, "controllers.Application", "mmm", Seq())
)
                              
 
// @LINE:8
def testid(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.testid(id), HandlerDef(this, "controllers.Application", "testid", Seq(classOf[Long]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:9
def connecter(username:String) = new play.api.mvc.HandlerRef(
   controllers.Application.connecter(username), HandlerDef(this, "controllers.Application", "connecter", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                