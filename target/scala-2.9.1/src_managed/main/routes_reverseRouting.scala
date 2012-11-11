// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:76ca4f7d9ded14394237d0189c50c5f290eceb28
// @DATE:Sun Nov 11 23:50:04 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:15
// @LINE:14
// @LINE:13
class ReverseSoundProjects {
    


 
// @LINE:14
def add() = {
   Call("POST", "/soundProjects")
}
                                                        
 
// @LINE:15
def delete(project:Long) = {
   Call("POST", "/soundProjects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/delete")
}
                                                        
 
// @LINE:13
def index() = {
   Call("GET", "/soundProjects")
}
                                                        

                      
    
}
                            

// @LINE:18
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def authenticate() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:10
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:8
// @LINE:6
def login() = {
   () match {
// @LINE:6
case () if true => Call("GET", "/")
                                                                
// @LINE:8
case () if true => Call("GET", "/login")
                                                                    
   }
}
                                                        
 
// @LINE:18
def javascriptRoutes() = {
   Call("GET", "/assets/javascripts/routes")
}
                                                        

                      
    
}
                            

// @LINE:21
class ReverseAssets {
    


 
// @LINE:21
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:15
// @LINE:14
// @LINE:13
class ReverseSoundProjects {
    


 
// @LINE:14
def add = JavascriptReverseRoute(
   "controllers.SoundProjects.add",
   """
      function() {
      return _wA({method:"POST", url:"/soundProjects"})
      }
   """
)
                                                        
 
// @LINE:15
def delete = JavascriptReverseRoute(
   "controllers.SoundProjects.delete",
   """
      function(project) {
      return _wA({method:"POST", url:"/soundProjects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:13
def index = JavascriptReverseRoute(
   "controllers.SoundProjects.index",
   """
      function() {
      return _wA({method:"GET", url:"/soundProjects"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:18
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def authenticate = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:10
def logout = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:8
// @LINE:6
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"/"})
      }
      if (true) {
      return _wA({method:"GET", url:"/login"})
      }
      }
   """
)
                                                        
 
// @LINE:18
def javascriptRoutes = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"/assets/javascripts/routes"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:21
class ReverseAssets {
    


 
// @LINE:21
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
                    


// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:15
// @LINE:14
// @LINE:13
class ReverseSoundProjects {
    


 
// @LINE:14
def add() = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.add(), HandlerDef(this, "controllers.SoundProjects", "add", Seq())
)
                              
 
// @LINE:15
def delete(project:Long) = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.delete(project), HandlerDef(this, "controllers.SoundProjects", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def index() = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:18
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq())
)
                              
 
// @LINE:10
def logout() = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq())
)
                              
 
// @LINE:6
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:18
def javascriptRoutes() = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq())
)
                              

                      
    
}
                            

// @LINE:21
class ReverseAssets {
    


 
// @LINE:21
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                