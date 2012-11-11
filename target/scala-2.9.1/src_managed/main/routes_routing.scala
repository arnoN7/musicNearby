// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:112fa5161867ade4e4d98144a97894c7c679af19
// @DATE:Wed Nov 07 23:27:19 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:7
val controllers_Application_login0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:10
val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:11
val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:14
val controllers_SoundProjects_index4 = Route("GET", PathPattern(List(StaticPart("/soundProjects"))))
                    

// @LINE:15
val controllers_SoundProjects_add5 = Route("POST", PathPattern(List(StaticPart("/soundProjects"))))
                    

// @LINE:16
val controllers_SoundProjects_delete6 = Route("DELETE", PathPattern(List(StaticPart("/soundProjects/"),DynamicPart("project", """[^/]+"""))))
                    

// @LINE:19
val controllers_Application_javascriptRoutes7 = Route("GET", PathPattern(List(StaticPart("/assets/javascripts/routes"))))
                    

// @LINE:22
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.login()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""POST""","""/login""","""controllers.Application.authenticate()"""),("""GET""","""/logout""","""controllers.Application.logout()"""),("""GET""","""/soundProjects""","""controllers.SoundProjects.index()"""),("""POST""","""/soundProjects""","""controllers.SoundProjects.add()"""),("""DELETE""","""/soundProjects/$project<[^/]+>""","""controllers.SoundProjects.delete(project:Long)"""),("""GET""","""/assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:7
case controllers_Application_login0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil))
   }
}
                    

// @LINE:14
case controllers_SoundProjects_index4(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Nil))
   }
}
                    

// @LINE:15
case controllers_SoundProjects_add5(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.add(), HandlerDef(this, "controllers.SoundProjects", "add", Nil))
   }
}
                    

// @LINE:16
case controllers_SoundProjects_delete6(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.SoundProjects.delete(project), HandlerDef(this, "controllers.SoundProjects", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Application_javascriptRoutes7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil))
   }
}
                    

// @LINE:22
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                