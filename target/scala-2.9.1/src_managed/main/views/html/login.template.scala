
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

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
        
        """),_display_(Seq[Any](/*14.10*/helper/*14.16*/.form(routes.Application.authenticate)/*14.54*/ {_display_(Seq[Any](format.raw/*14.56*/("""
            
            <h1>Sign in</h1>
            
            """),_display_(Seq[Any](/*18.14*/if(form.hasGlobalErrors)/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*20.22*/form/*20.26*/.globalError.message)),format.raw/*20.46*/("""
                </p>
            """)))})),format.raw/*22.14*/("""
            
            """),_display_(Seq[Any](/*24.14*/if(flash.contains("success"))/*24.43*/ {_display_(Seq[Any](format.raw/*24.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*26.22*/flash/*26.27*/.get("success"))),format.raw/*26.42*/("""
                </p>
            """)))})),format.raw/*28.14*/("""
            
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*31.78*/form("email")/*31.91*/.value)),format.raw/*31.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
        """)))})),format.raw/*40.10*/("""
        
        <p class="note">
            Try <em>guillaume@sample.com</em> with <em>secret</em> as password.
        </p>
            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.Login]) = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 23:43:53 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/login.scala.html
                    HASH: 88d25df7c4ab1f803782d27339ec22c08ba083be
                    MATRIX: 772->1|880->32|1028->145|1042->151|1095->183|1202->255|1216->261|1273->296|1374->361|1389->367|1427->383|1540->460|1555->466|1602->504|1642->506|1747->575|1780->599|1820->601|1913->658|1926->662|1968->682|2035->717|2098->744|2136->773|2176->775|2270->833|2284->838|2321->853|2388->888|2531->995|2553->1008|2581->1014|2853->1254
                    LINES: 27->1|30->1|35->6|35->6|35->6|36->7|36->7|36->7|40->11|40->11|40->11|43->14|43->14|43->14|43->14|47->18|47->18|47->18|49->20|49->20|49->20|51->22|53->24|53->24|53->24|55->26|55->26|55->26|57->28|60->31|60->31|60->31|69->40
                    -- GENERATED --
                */
            