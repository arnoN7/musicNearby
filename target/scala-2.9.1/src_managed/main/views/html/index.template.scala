
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

    <h1>"""),_display_(Seq[Any](/*7.10*/tasks/*7.15*/.size())),format.raw/*7.22*/(""" task(s)</h1>
    
    <ul>
    	"""),_display_(Seq[Any](/*10.7*/for(task <- tasks) yield /*10.25*/ {_display_(Seq[Any](format.raw/*10.27*/("""
    		<li>
    			"""),_display_(Seq[Any](/*12.9*/task/*12.13*/.label)),format.raw/*12.19*/("""
    			
    			"""),_display_(Seq[Any](/*14.9*/form(routes.Application.deleteTask(task.id))/*14.53*/ {_display_(Seq[Any](format.raw/*14.55*/("""
    				<input type="submit" value="Delete">
    			""")))})),format.raw/*16.9*/("""
    		</li>
    	""")))})),format.raw/*18.7*/("""
    </ul>
    
    <h2> add new task </h2>
    
    """),_display_(Seq[Any](/*23.6*/form(routes.Application.newTask())/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
    	"""),_display_(Seq[Any](/*24.7*/inputText(taskForm("label")))),format.raw/*24.35*/("""
    	
    	<input type="submit" value="Create">
    
    """)))})),format.raw/*28.6*/("""
""")))})),format.raw/*29.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]) = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 02 00:26:49 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/index.scala.html
                    HASH: 2aed788af0952e2eda3673386c9dde9a09cc26bf
                    MATRIX: 770->1|904->42|932->61|968->63|993->80|1032->82|1078->93|1091->98|1119->105|1188->139|1222->157|1262->159|1317->179|1330->183|1358->189|1410->206|1463->250|1503->252|1588->306|1638->325|1727->379|1770->413|1810->415|1852->422|1902->450|1992->509|2025->511
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|47->18|52->23|52->23|52->23|53->24|53->24|57->28|58->29
                    -- GENERATED --
                */
            