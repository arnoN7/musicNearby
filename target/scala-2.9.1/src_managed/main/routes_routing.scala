// @SOURCE:C:/play-2.0.3/musicNearby/conf/routes
// @HASH:30576add4d0c8e4df46ee929e51cd9c47589a631
// @DATE:Sun Nov 18 00:02:27 CET 2012

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
val controllers_JobOffers_index4 = Route("GET", PathPattern(List(StaticPart("/jobOffers"))))
                    

// @LINE:14
val controllers_JobOffers_addJobOffer5 = Route("GET", PathPattern(List(StaticPart("/jobOffers/new"))))
                    

// @LINE:15
val controllers_JobOffers_saveOffer6 = Route("POST", PathPattern(List(StaticPart("/jobOffers/save"))))
                    

// @LINE:16
val controllers_JobOffers_delete7 = Route("POST", PathPattern(List(StaticPart("/jobOffers/"),DynamicPart("jobId", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:17
val controllers_JobOffers_editJobs8 = Route("GET", PathPattern(List(StaticPart("/jobOffers/"),DynamicPart("jobId", """[^/]+"""),StaticPart("/edit"))))
                    

// @LINE:18
val controllers_ReviewManagement_upload9 = Route("GET", PathPattern(List(StaticPart("/jobOffers/upload"))))
                    

// @LINE:21
val controllers_ReviewOffers_index10 = Route("GET", PathPattern(List(StaticPart("/reviewOffers"))))
                    

// @LINE:24
val controllers_SoundProjects_index11 = Route("GET", PathPattern(List(StaticPart("/soundProjects"))))
                    

// @LINE:25
val controllers_SoundProjects_add12 = Route("POST", PathPattern(List(StaticPart("/soundProjects"))))
                    

// @LINE:26
val controllers_SoundProjects_delete13 = Route("POST", PathPattern(List(StaticPart("/soundProjects/"),DynamicPart("project", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:29
val controllers_Application_javascriptRoutes14 = Route("GET", PathPattern(List(StaticPart("/assets/javascripts/routes"))))
                    

// @LINE:32
val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:34
val controllers_Administration_index16 = Route("GET", PathPattern(List(StaticPart("/admin"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.login()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""POST""","""/login""","""controllers.Application.authenticate()"""),("""GET""","""/logout""","""controllers.Application.logout()"""),("""GET""","""/jobOffers""","""controllers.JobOffers.index()"""),("""GET""","""/jobOffers/new""","""controllers.JobOffers.addJobOffer()"""),("""POST""","""/jobOffers/save""","""controllers.JobOffers.saveOffer()"""),("""POST""","""/jobOffers/$jobId<[^/]+>/delete""","""controllers.JobOffers.delete(jobId:Long)"""),("""GET""","""/jobOffers/$jobId<[^/]+>/edit""","""controllers.JobOffers.editJobs(jobId:Long)"""),("""GET""","""/jobOffers/upload""","""controllers.ReviewManagement.upload()"""),("""GET""","""/reviewOffers""","""controllers.ReviewOffers.index()"""),("""GET""","""/soundProjects""","""controllers.SoundProjects.index()"""),("""POST""","""/soundProjects""","""controllers.SoundProjects.add()"""),("""POST""","""/soundProjects/$project<[^/]+>/delete""","""controllers.SoundProjects.delete(project:Long)"""),("""GET""","""/assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/admin""","""controllers.Administration.index()"""))
             
    
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
case controllers_JobOffers_index4(params) => {
   call { 
        invokeHandler(_root_.controllers.JobOffers.index(), HandlerDef(this, "controllers.JobOffers", "index", Nil))
   }
}
                    

// @LINE:14
case controllers_JobOffers_addJobOffer5(params) => {
   call { 
        invokeHandler(_root_.controllers.JobOffers.addJobOffer(), HandlerDef(this, "controllers.JobOffers", "addJobOffer", Nil))
   }
}
                    

// @LINE:15
case controllers_JobOffers_saveOffer6(params) => {
   call { 
        invokeHandler(_root_.controllers.JobOffers.saveOffer(), HandlerDef(this, "controllers.JobOffers", "saveOffer", Nil))
   }
}
                    

// @LINE:16
case controllers_JobOffers_delete7(params) => {
   call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        invokeHandler(_root_.controllers.JobOffers.delete(jobId), HandlerDef(this, "controllers.JobOffers", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_JobOffers_editJobs8(params) => {
   call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        invokeHandler(_root_.controllers.JobOffers.editJobs(jobId), HandlerDef(this, "controllers.JobOffers", "editJobs", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_ReviewManagement_upload9(params) => {
   call { 
        invokeHandler(_root_.controllers.ReviewManagement.upload(), HandlerDef(this, "controllers.ReviewManagement", "upload", Nil))
   }
}
                    

// @LINE:21
case controllers_ReviewOffers_index10(params) => {
   call { 
        invokeHandler(_root_.controllers.ReviewOffers.index(), HandlerDef(this, "controllers.ReviewOffers", "index", Nil))
   }
}
                    

// @LINE:24
case controllers_SoundProjects_index11(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.index(), HandlerDef(this, "controllers.SoundProjects", "index", Nil))
   }
}
                    

// @LINE:25
case controllers_SoundProjects_add12(params) => {
   call { 
        invokeHandler(_root_.controllers.SoundProjects.add(), HandlerDef(this, "controllers.SoundProjects", "add", Nil))
   }
}
                    

// @LINE:26
case controllers_SoundProjects_delete13(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(_root_.controllers.SoundProjects.delete(project), HandlerDef(this, "controllers.SoundProjects", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:29
case controllers_Application_javascriptRoutes14(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil))
   }
}
                    

// @LINE:32
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:34
case controllers_Administration_index16(params) => {
   call { 
        invokeHandler(_root_.controllers.Administration.index(), HandlerDef(this, "controllers.Administration", "index", Nil))
   }
}
                    
}
    
}
                