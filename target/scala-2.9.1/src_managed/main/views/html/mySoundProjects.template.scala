
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
object mySoundProjects extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[SoundProject],User,Form[SoundProject],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(myProjects: List[SoundProject], user: User, form: Form[SoundProject]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.72*/("""

"""),_display_(Seq[Any](/*3.2*/main(myProjects, user)/*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
    
    <header>
        <hgroup>
            <h1>MyProject</h1>
        </hgroup>
    </header>
    
    <article  class="tasks">
    <ul>
    	"""),_display_(Seq[Any](/*13.7*/if( myProjects != null)/*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
		"""),_display_(Seq[Any](/*14.4*/for(project <- myProjects) yield /*14.30*/ {_display_(Seq[Any](format.raw/*14.32*/("""
			<li>
				"""),_display_(Seq[Any](/*16.6*/project/*16.13*/.name)),format.raw/*16.18*/("""
			</li>	
		""")))})),format.raw/*18.4*/("""
		""")))})),format.raw/*19.4*/("""
	</ul>
    </article>
     """),_display_(Seq[Any](/*22.7*/helper/*22.13*/.form(routes.SoundProjects.add)/*22.44*/ {_display_(Seq[Any](format.raw/*22.46*/("""
            
            """),_display_(Seq[Any](/*24.14*/if(form.hasGlobalErrors)/*24.38*/ {_display_(Seq[Any](format.raw/*24.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*26.22*/form/*26.26*/.globalError.message)),format.raw/*26.46*/("""
                </p>
            """)))})),format.raw/*28.14*/("""
            
            """),_display_(Seq[Any](/*30.14*/if(flash.contains("success"))/*30.43*/ {_display_(Seq[Any](format.raw/*30.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*32.22*/flash/*32.27*/.get("success"))),format.raw/*32.42*/("""
                </p>
            """)))})),format.raw/*34.14*/("""
            
            <p>
                <input type="name" name="name" placeholder="Name" value=""""),_display_(Seq[Any](/*37.75*/form("name")/*37.87*/.value)),format.raw/*37.93*/("""">
            </p>
            <p>
                <input type="sound" name="sound" placeholder="sound">
            </p>
            <p>
                <button type="submit">Add Sound</button>
            </p>
            
        """)))})),format.raw/*46.10*/("""
    
""")))})),format.raw/*48.2*/("""

"""))}
    }
    
    def render(myProjects:List[SoundProject],user:User,form:Form[SoundProject]) = apply(myProjects,user,form)
    
    def f:((List[SoundProject],User,Form[SoundProject]) => play.api.templates.Html) = (myProjects,user,form) => apply(myProjects,user,form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 07 23:36:21 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/mySoundProjects.scala.html
                    HASH: a7b88f44064c8574f872567ac5a80ce448cbf34a
                    MATRIX: 801->1|948->71|985->74|1015->96|1053->97|1236->245|1268->268|1308->270|1347->274|1389->300|1429->302|1478->316|1494->323|1521->328|1566->342|1601->346|1665->375|1680->381|1720->412|1760->414|1823->441|1856->465|1896->467|1989->524|2002->528|2044->548|2111->583|2174->610|2212->639|2252->641|2346->699|2360->704|2397->719|2464->754|2604->858|2625->870|2653->876|2920->1111|2958->1118
                    LINES: 27->1|30->1|32->3|32->3|32->3|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|47->18|48->19|51->22|51->22|51->22|51->22|53->24|53->24|53->24|55->26|55->26|55->26|57->28|59->30|59->30|59->30|61->32|61->32|61->32|63->34|66->37|66->37|66->37|75->46|77->48
                    -- GENERATED --
                */
            