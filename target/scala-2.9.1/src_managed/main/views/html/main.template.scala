
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[SoundProject],User,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[SoundProject], user: User)(body: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""

<html>
    <head>
        <title>MusicNearby</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/main.css"))),format.raw/*7.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*9.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*10.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*11.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("javascripts/main.js"))),format.raw/*12.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Application.javascriptRoutes)),format.raw/*13.81*/(""""></script>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.SoundProjects.index)),format.raw/*17.49*/("""" id="logo"><span>Zen</span>tasks</a>
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*19.22*/user/*19.26*/.name)),format.raw/*19.31*/(""" <span>("""),_display_(Seq[Any](/*19.40*/user/*19.44*/.email)),format.raw/*19.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*21.31*/routes/*21.37*/.Application.logout())),format.raw/*21.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="soundProjects">
            	"""),_display_(Seq[Any](/*28.15*/if(projects != null)/*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""
            	
                """),_display_(Seq[Any](/*30.18*/for(project <- projects) yield /*30.42*/ {_display_(Seq[Any](format.raw/*30.44*/("""
                	<li>
                	"""),_display_(Seq[Any](/*32.19*/project/*32.26*/.name)),format.raw/*32.31*/("""
                	</li>
                """)))}))))})),format.raw/*34.19*/("""
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            """),_display_(Seq[Any](/*39.14*/body)),format.raw/*39.18*/("""
        </section>
    </body>
</html>

"""))}
    }
    
    def render(projects:List[SoundProject],user:User,body:Html) = apply(projects,user)(body)
    
    def f:((List[SoundProject],User) => (Html) => play.api.templates.Html) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 07 23:27:19 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/main.scala.html
                    HASH: 76bb408dbd8801d49a9ce61d328cee4722778ab2
                    MATRIX: 776->1|907->55|1055->168|1069->174|1122->206|1229->278|1243->284|1299->318|1382->366|1396->372|1458->413|1550->470|1564->476|1631->522|1724->579|1739->585|1804->628|1897->685|1912->691|1975->732|2068->789|2083->795|2138->828|2231->885|2246->891|2297->920|2407->994|2422->1000|2464->1020|2586->1106|2599->1110|2626->1115|2671->1124|2684->1128|2712->1134|2813->1199|2828->1205|2871->1226|3108->1427|3137->1447|3176->1448|3244->1480|3284->1504|3324->1506|3401->1547|3417->1554|3444->1559|3522->1601|3686->1729|3712->1733
                    LINES: 27->1|30->1|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|46->17|46->17|46->17|48->19|48->19|48->19|48->19|48->19|48->19|50->21|50->21|50->21|57->28|57->28|57->28|59->30|59->30|59->30|61->32|61->32|61->32|63->34|68->39|68->39
                    -- GENERATED --
                */
            