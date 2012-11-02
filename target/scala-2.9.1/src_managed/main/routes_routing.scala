// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:375bc9c0b1543cd2717f4e496c5d058168e56ff4
// @DATE:Fri Nov 02 00:40:51 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_SoundProjects_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:10
val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:11
val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:14
val controllers_Application_tasks4 = Route("GET", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:15
val controllers_Application_newTask5 = Route("POST", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:16
val controllers_Application_deleteTask6 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:19
val controllers_SoundProjects_index7 = Route("GET", PathPattern(List(StaticPart("/soundProjects"))))
                    

// @LINE:22
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.SoundProjects.index()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""POST""","""/login""","""controllers.Application.authenticate()"""),("""GET""","""/logout""","""controllers.Application.logout()"""),("""GET""","""/tasks""","""controllers.Application.tasks()"""),("""POST""","""/tasks""","""controllers.Application.newTask()"""),("""POST""","""/tasks/$id<[^/]+>/delete""","""controllers.Application.deleteTask(id:Long)"""),("""GET""","""/soundProjects""","""controllers.SoundProjects.index()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_SoundProjects_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Nil))
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
case controllers_Application_tasks4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Nil))
   }
}
                    

// @LINE:15
case controllers_Application_newTask5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Nil))
   }
}
                    

// @LINE:16
case controllers_Application_deleteTask6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_SoundProjects_index7(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Nil))
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
                