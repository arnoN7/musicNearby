// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:375bc9c0b1543cd2717f4e496c5d058168e56ff4
// @DATE:Fri Nov 02 00:40:51 CET 2012

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
// @LINE:6
package controllers {

// @LINE:19
// @LINE:6
class ReverseSoundProjects {
    


 
// @LINE:19
// @LINE:6
def index() = {
   () match {
// @LINE:6
case () if true => Call("GET", "/")
                                                                
// @LINE:19
case () if true => Call("GET", "/soundProjects")
                                                                    
   }
}
                                                        

                      
    
}
                            

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:15
def newTask() = {
   Call("POST", "/tasks")
}
                                                        
 
// @LINE:9
def login() = {
   Call("GET", "/login")
}
                                                        
 
// @LINE:11
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:16
def deleteTask(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:10
def authenticate() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:14
def tasks() = {
   Call("GET", "/tasks")
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
// @LINE:6
package controllers.javascript {

// @LINE:19
// @LINE:6
class ReverseSoundProjects {
    


 
// @LINE:19
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.SoundProjects.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"/"})
      }
      if (true) {
      return _wA({method:"GET", url:"/soundProjects"})
      }
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:15
def newTask = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"/tasks"})
      }
   """
)
                                                        
 
// @LINE:9
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
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
                                                        
 
// @LINE:16
def deleteTask = JavascriptReverseRoute(
   "controllers.Application.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:10
def authenticate = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:14
def tasks = JavascriptReverseRoute(
   "controllers.Application.tasks",
   """
      function() {
      return _wA({method:"GET", url:"/tasks"})
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
// @LINE:6
package controllers.ref {

// @LINE:19
// @LINE:6
class ReverseSoundProjects {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    


 
// @LINE:15
def newTask() = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Seq())
)
                              
 
// @LINE:9
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:11
def logout() = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq())
)
                              
 
// @LINE:16
def deleteTask(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]))
)
                              
 
// @LINE:10
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq())
)
                              
 
// @LINE:14
def tasks() = new play.api.mvc.HandlerRef(
   controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Seq())
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
                    
                