// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:112fa5161867ade4e4d98144a97894c7c679af19
// @DATE:Wed Nov 07 23:27:19 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
package controllers {

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseSoundProjects {
    


 
// @LINE:15
def add() = {
   Call("POST", "/soundProjects")
}
                                                        
 
// @LINE:16
def delete(project:Long) = {
   Call("DELETE", "/soundProjects/" + implicitly[PathBindable[Long]].unbind("project", project))
}
                                                        
 
// @LINE:14
def index() = {
   Call("GET", "/soundProjects")
}
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseApplication {
    


 
// @LINE:10
def authenticate() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:11
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:9
// @LINE:7
def login() = {
   () match {
// @LINE:7
case () if true => Call("GET", "/")
                                                                
// @LINE:9
case () if true => Call("GET", "/login")
                                                                    
   }
}
                                                        
 
// @LINE:19
def javascriptRoutes() = {
   Call("GET", "/assets/javascripts/routes")
}
                                                        

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
package controllers.javascript {

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseSoundProjects {
    


 
// @LINE:15
def add = JavascriptReverseRoute(
   "controllers.SoundProjects.add",
   """
      function() {
      return _wA({method:"POST", url:"/soundProjects"})
      }
   """
)
                                                        
 
// @LINE:16
def delete = JavascriptReverseRoute(
   "controllers.SoundProjects.delete",
   """
      function(project) {
      return _wA({method:"DELETE", url:"/soundProjects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project)})
      }
   """
)
                                                        
 
// @LINE:14
def index = JavascriptReverseRoute(
   "controllers.SoundProjects.index",
   """
      function() {
      return _wA({method:"GET", url:"/soundProjects"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseApplication {
    


 
// @LINE:10
def authenticate = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:11
def logout = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:9
// @LINE:7
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
                                                        
 
// @LINE:19
def javascriptRoutes = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"/assets/javascripts/routes"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
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
                    


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
package controllers.ref {

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseSoundProjects {
    


 
// @LINE:15
def add() = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.add(), HandlerDef(this, "controllers.SoundProjects", "add", Seq())
)
                              
 
// @LINE:16
def delete(project:Long) = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.delete(project), HandlerDef(this, "controllers.SoundProjects", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:14
def index() = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:19
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
class ReverseApplication {
    


 
// @LINE:10
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq())
)
                              
 
// @LINE:11
def logout() = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq())
)
                              
 
// @LINE:7
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:19
def javascriptRoutes() = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq())
)
                              

                      
    
}
                            

// @LINE:22
class ReverseAssets {
    


 
// @LINE:22
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                