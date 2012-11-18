
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

"""),_display_(Seq[Any](/*3.2*/main(user)/*3.12*/{_display_(Seq[Any](format.raw/*3.13*/("""
    
    <header>
        <hgroup>
            <h1>My Projects</h1>
        </hgroup>
    </header>
    
    <article  class="tasks">
    <ul>
    	"""),_display_(Seq[Any](/*13.7*/if( myProjects != null)/*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
		"""),_display_(Seq[Any](/*14.4*/for(project <- myProjects) yield /*14.30*/ {_display_(Seq[Any](format.raw/*14.32*/("""
			<li>
				"""),_display_(Seq[Any](/*16.6*/project/*16.13*/.name)),format.raw/*16.18*/(""" """),_display_(Seq[Any](/*16.20*/project/*16.27*/.sound)),format.raw/*16.33*/(""" owned by """),_display_(Seq[Any](/*16.44*/project/*16.51*/.owner.email)),format.raw/*16.63*/("""
				"""),_display_(Seq[Any](/*17.6*/helper/*17.12*/.form(routes.SoundProjects.delete( project.id ))/*17.60*/ {_display_(Seq[Any](format.raw/*17.62*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*19.18*/("""

			</li>	
		""")))})),format.raw/*22.4*/("""
		""")))})),format.raw/*23.4*/("""
	</ul>
    </article>
     """),_display_(Seq[Any](/*26.7*/helper/*26.13*/.form(routes.SoundProjects.add)/*26.44*/ {_display_(Seq[Any](format.raw/*26.46*/("""
            
            """),_display_(Seq[Any](/*28.14*/if(form.hasGlobalErrors)/*28.38*/ {_display_(Seq[Any](format.raw/*28.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*30.22*/form/*30.26*/.globalError.message)),format.raw/*30.46*/("""
                </p>
            """)))})),format.raw/*32.14*/("""
            
            """),_display_(Seq[Any](/*34.14*/if(flash.contains("success"))/*34.43*/ {_display_(Seq[Any](format.raw/*34.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*36.22*/flash/*36.27*/.get("success"))),format.raw/*36.42*/("""
                </p>
            """)))})),format.raw/*38.14*/("""
            
            <p>
                <input type="name" name="name" placeholder="Name" value=""""),_display_(Seq[Any](/*41.75*/form("name")/*41.87*/.value)),format.raw/*41.93*/("""">
            </p>
            <p>
                <input type="sound" name="sound" placeholder="sound">
            </p>
            <p>
                <button type="submit">Add Sound</button>
            </p>
            
        """)))})),format.raw/*50.10*/("""
    
""")))})),format.raw/*52.2*/("""

"""))}
    }
    
    def render(myProjects:List[SoundProject],user:User,form:Form[SoundProject]) = apply(myProjects,user,form)
    
    def f:((List[SoundProject],User,Form[SoundProject]) => play.api.templates.Html) = (myProjects,user,form) => apply(myProjects,user,form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 23:43:53 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/mySoundProjects.scala.html
                    HASH: 55c8b680b8445183042fde9a85ae778a2ac3def5
                    MATRIX: 801->1|948->71|985->74|1003->84|1041->85|1226->235|1258->258|1298->260|1337->264|1379->290|1419->292|1468->306|1484->313|1511->318|1549->320|1565->327|1593->333|1640->344|1656->351|1690->363|1731->369|1746->375|1803->423|1843->425|1950->500|1996->515|2031->519|2095->548|2110->554|2150->585|2190->587|2253->614|2286->638|2326->640|2419->697|2432->701|2474->721|2541->756|2604->783|2642->812|2682->814|2776->872|2790->877|2827->892|2894->927|3034->1031|3055->1043|3083->1049|3350->1284|3388->1291
                    LINES: 27->1|30->1|32->3|32->3|32->3|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|46->17|46->17|46->17|46->17|48->19|51->22|52->23|55->26|55->26|55->26|55->26|57->28|57->28|57->28|59->30|59->30|59->30|61->32|63->34|63->34|63->34|65->36|65->36|65->36|67->38|70->41|70->41|70->41|79->50|81->52
                    -- GENERATED --
                */
            