
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
                    DATE: Sun Nov 11 23:36:38 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/mySoundProjects.scala.html
                    HASH: 7a1f3bad3db43e42280f15c05023cce704692c83
                    MATRIX: 801->1|948->71|985->74|1015->96|1053->97|1238->247|1270->270|1310->272|1349->276|1391->302|1431->304|1480->318|1496->325|1523->330|1561->332|1577->339|1605->345|1652->356|1668->363|1702->375|1743->381|1758->387|1815->435|1855->437|1962->512|2008->527|2043->531|2107->560|2122->566|2162->597|2202->599|2265->626|2298->650|2338->652|2431->709|2444->713|2486->733|2553->768|2616->795|2654->824|2694->826|2788->884|2802->889|2839->904|2906->939|3046->1043|3067->1055|3095->1061|3362->1296|3400->1303
                    LINES: 27->1|30->1|32->3|32->3|32->3|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|46->17|46->17|46->17|46->17|48->19|51->22|52->23|55->26|55->26|55->26|55->26|57->28|57->28|57->28|59->30|59->30|59->30|61->32|63->34|63->34|63->34|65->36|65->36|65->36|67->38|70->41|70->41|70->41|79->50|81->52
                    -- GENERATED --
                */
            