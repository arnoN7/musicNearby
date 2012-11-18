
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
object admin extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(users: List[User]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

<html>
    <head>
        <title>CoFindMyJob</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.JobOffers.index)),format.raw/*11.45*/("""" id="logo"><span>Co</span>FindMyJob</a>
        </header>
        """),_display_(Seq[Any](/*13.10*/for(user <- users) yield /*13.28*/ {_display_(Seq[Any](format.raw/*13.30*/("""
        	"""),_display_(Seq[Any](/*14.11*/user/*14.15*/.email)),format.raw/*14.21*/("""
        """)))})),format.raw/*15.10*/("""
        
        <p class="note">
            Try <em>guillaume@sample.com</em> with <em>secret</em> as password.
        </p>
            
    </body>
</html>
    


"""))}
    }
    
    def render(users:List[User]) = apply(users)
    
    def f:((List[User]) => play.api.templates.Html) = (users) => apply(users)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 23:43:53 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/admin.scala.html
                    HASH: ee506576abd42250b390a25b769ce7ce4f0f2c60
                    MATRIX: 759->1|855->20|1003->133|1017->139|1070->171|1177->243|1191->249|1248->284|1349->349|1364->355|1402->371|1506->439|1540->457|1580->459|1627->470|1640->474|1668->480|1710->490
                    LINES: 27->1|30->1|35->6|35->6|35->6|36->7|36->7|36->7|40->11|40->11|40->11|42->13|42->13|42->13|43->14|43->14|43->14|44->15
                    -- GENERATED --
                */
            