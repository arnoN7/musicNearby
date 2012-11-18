// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:30576add4d0c8e4df46ee929e51cd9c47589a631
// @DATE:Sun Nov 18 00:02:27 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:34
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:32
class ReverseAssets {
    


 
// @LINE:32
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:34
class ReverseAdministration {
    


 
// @LINE:34
def index() = {
   Call("GET", "/admin")
}
                                                        

                      
    
}
                            

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseJobOffers {
    


 
// @LINE:14
def addJobOffer() = {
   Call("GET", "/jobOffers/new")
}
                                                        
 
// @LINE:15
def saveOffer() = {
   Call("POST", "/jobOffers/save")
}
                                                        
 
// @LINE:16
def delete(jobId:Long) = {
   Call("POST", "/jobOffers/" + implicitly[PathBindable[Long]].unbind("jobId", jobId) + "/delete")
}
                                                        
 
// @LINE:17
def editJobs(jobId:Long) = {
   Call("GET", "/jobOffers/" + implicitly[PathBindable[Long]].unbind("jobId", jobId) + "/edit")
}
                                                        
 
// @LINE:13
def index() = {
   Call("GET", "/jobOffers")
}
                                                        

                      
    
}
                            

// @LINE:26
// @LINE:25
// @LINE:24
class ReverseSoundProjects {
    


 
// @LINE:25
def add() = {
   Call("POST", "/soundProjects")
}
                                                        
 
// @LINE:26
def delete(project:Long) = {
   Call("POST", "/soundProjects/" + implicitly[PathBindable[Long]].unbind("project", project) + "/delete")
}
                                                        
 
// @LINE:24
def index() = {
   Call("GET", "/soundProjects")
}
                                                        

                      
    
}
                            

// @LINE:29
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
                                                        
 
// @LINE:29
def javascriptRoutes() = {
   Call("GET", "/assets/javascripts/routes")
}
                                                        

                      
    
}
                            

// @LINE:18
class ReverseReviewManagement {
    


 
// @LINE:18
def upload() = {
   Call("GET", "/jobOffers/upload")
}
                                                        

                      
    
}
                            

// @LINE:21
class ReverseReviewOffers {
    


 
// @LINE:21
def index() = {
   Call("GET", "/reviewOffers")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:34
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:32
class ReverseAssets {
    


 
// @LINE:32
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:34
class ReverseAdministration {
    


 
// @LINE:34
def index = JavascriptReverseRoute(
   "controllers.Administration.index",
   """
      function() {
      return _wA({method:"GET", url:"/admin"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseJobOffers {
    


 
// @LINE:14
def addJobOffer = JavascriptReverseRoute(
   "controllers.JobOffers.addJobOffer",
   """
      function() {
      return _wA({method:"GET", url:"/jobOffers/new"})
      }
   """
)
                                                        
 
// @LINE:15
def saveOffer = JavascriptReverseRoute(
   "controllers.JobOffers.saveOffer",
   """
      function() {
      return _wA({method:"POST", url:"/jobOffers/save"})
      }
   """
)
                                                        
 
// @LINE:16
def delete = JavascriptReverseRoute(
   "controllers.JobOffers.delete",
   """
      function(jobId) {
      return _wA({method:"POST", url:"/jobOffers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("jobId", jobId) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:17
def editJobs = JavascriptReverseRoute(
   "controllers.JobOffers.editJobs",
   """
      function(jobId) {
      return _wA({method:"GET", url:"/jobOffers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("jobId", jobId) + "/edit"})
      }
   """
)
                                                        
 
// @LINE:13
def index = JavascriptReverseRoute(
   "controllers.JobOffers.index",
   """
      function() {
      return _wA({method:"GET", url:"/jobOffers"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:26
// @LINE:25
// @LINE:24
class ReverseSoundProjects {
    


 
// @LINE:25
def add = JavascriptReverseRoute(
   "controllers.SoundProjects.add",
   """
      function() {
      return _wA({method:"POST", url:"/soundProjects"})
      }
   """
)
                                                        
 
// @LINE:26
def delete = JavascriptReverseRoute(
   "controllers.SoundProjects.delete",
   """
      function(project) {
      return _wA({method:"POST", url:"/soundProjects/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("project", project) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:24
def index = JavascriptReverseRoute(
   "controllers.SoundProjects.index",
   """
      function() {
      return _wA({method:"GET", url:"/soundProjects"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:29
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
                                                        
 
// @LINE:29
def javascriptRoutes = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"/assets/javascripts/routes"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:18
class ReverseReviewManagement {
    


 
// @LINE:18
def upload = JavascriptReverseRoute(
   "controllers.ReviewManagement.upload",
   """
      function() {
      return _wA({method:"GET", url:"/jobOffers/upload"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:21
class ReverseReviewOffers {
    


 
// @LINE:21
def index = JavascriptReverseRoute(
   "controllers.ReviewOffers.index",
   """
      function() {
      return _wA({method:"GET", url:"/reviewOffers"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:34
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:32
class ReverseAssets {
    


 
// @LINE:32
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:34
class ReverseAdministration {
    


 
// @LINE:34
def index() = new play.api.mvc.HandlerRef(
   controllers.Administration.index(), HandlerDef(this, "controllers.Administration", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseJobOffers {
    


 
// @LINE:14
def addJobOffer() = new play.api.mvc.HandlerRef(
   controllers.JobOffers.addJobOffer(), HandlerDef(this, "controllers.JobOffers", "addJobOffer", Seq())
)
                              
 
// @LINE:15
def saveOffer() = new play.api.mvc.HandlerRef(
   controllers.JobOffers.saveOffer(), HandlerDef(this, "controllers.JobOffers", "saveOffer", Seq())
)
                              
 
// @LINE:16
def delete(jobId:Long) = new play.api.mvc.HandlerRef(
   controllers.JobOffers.delete(jobId), HandlerDef(this, "controllers.JobOffers", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:17
def editJobs(jobId:Long) = new play.api.mvc.HandlerRef(
   controllers.JobOffers.editJobs(jobId), HandlerDef(this, "controllers.JobOffers", "editJobs", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def index() = new play.api.mvc.HandlerRef(
   controllers.JobOffers.index(), HandlerDef(this, "controllers.JobOffers", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:26
// @LINE:25
// @LINE:24
class ReverseSoundProjects {
    


 
// @LINE:25
def add() = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.add(), HandlerDef(this, "controllers.SoundProjects", "add", Seq())
)
                              
 
// @LINE:26
def delete(project:Long) = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.delete(project), HandlerDef(this, "controllers.SoundProjects", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:24
def index() = new play.api.mvc.HandlerRef(
   controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:29
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
                              
 
// @LINE:29
def javascriptRoutes() = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq())
)
                              

                      
    
}
                            

// @LINE:18
class ReverseReviewManagement {
    


 
// @LINE:18
def upload() = new play.api.mvc.HandlerRef(
   controllers.ReviewManagement.upload(), HandlerDef(this, "controllers.ReviewManagement", "upload", Seq())
)
                              

                      
    
}
                            

// @LINE:21
class ReverseReviewOffers {
    


 
// @LINE:21
def index() = new play.api.mvc.HandlerRef(
   controllers.ReviewOffers.index(), HandlerDef(this, "controllers.ReviewOffers", "index", Seq())
)
                              

                      
    
}
                            
}
                    
                