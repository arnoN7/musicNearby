// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:76ca4f7d9ded14394237d0189c50c5f290eceb28
// @DATE:Sun Nov 11 23:50:04 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_login0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:9
val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:10
val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:13
val controllers_SoundProjects_index4 = Route("GET", PathPattern(List(StaticPart("/soundProjects"))))
                    

// @LINE:14
val controllers_SoundProjects_add5 = Route("POST", PathPattern(List(StaticPart("/soundProjects"))))
                    

// @LINE:15
val controllers_SoundProjects_delete6 = Route("POST", PathPattern(List(StaticPart("/soundProjects/"),DynamicPart("project", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:18
val controllers_Application_javascriptRoutes7 = Route("GET", PathPattern(List(StaticPart("/assets/javascripts/routes"))))
                    

// @LINE:21
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.login()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""POST""","""/login""","""controllers.Application.authenticate()"""),("""GET""","""/logout""","""controllers.Application.logout()"""),("""GET""","""/soundProjects""","""controllers.SoundProjects.index()"""),("""POST""","""/soundProjects""","""controllers.SoundProjects.add()"""),("""POST""","""/soundProjects/$project<[^/]+>/delete""","""controllers.SoundProjects.delete(project:Long)"""),("""GET""","""/assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_login0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil))
   }
}
                    

// @LINE:13
case controllers_SoundProjects_index4(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Nil))
   }
}
                    

// @LINE:14
case controllers_SoundProjects_add5(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.add(), HandlerDef(this, "controllers.SoundProjects", "add", Nil))
   }
}
                    

// @LINE:15
case controllers_SoundProjects_delete6(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.SoundProjects.delete(project), HandlerDef(this, "controllers.SoundProjects", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_Application_javascriptRoutes7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil))
   }
}
                    

// @LINE:21
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                