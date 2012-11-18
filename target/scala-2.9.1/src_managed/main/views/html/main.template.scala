
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User)(body: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>CoFindMyJob</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link  href=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*13.64*/("""" rel="stylesheet">
    <style type="text/css">
      body """),format.raw("""{"""),format.raw/*15.13*/("""
        padding-top: 60px;
        padding-bottom: 40px;
      """),format.raw("""}"""),format.raw/*18.8*/("""
    </style>
    <link href=""""),_display_(Seq[Any](/*20.18*/routes/*20.24*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*20.74*/("""" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*28.55*/routes/*28.61*/.Assets.at("images/favicon.png"))),format.raw/*28.93*/("""">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <body>
      <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">Co Find my Job</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href=""""),_display_(Seq[Any](/*47.44*/routes/*47.50*/.JobOffers.index())),format.raw/*47.68*/("""">Mes Offres d'emploi</a></li>
              <li><a href=""""),_display_(Seq[Any](/*48.29*/routes/*48.35*/.ReviewOffers.index())),format.raw/*48.56*/("""">Relecteurs</a></li>
              <li><a href="#">"""),_display_(Seq[Any](/*49.32*/user/*49.36*/.name)),format.raw/*49.41*/("""</a></li> 
              <li><a href=""""),_display_(Seq[Any](/*50.29*/routes/*50.35*/.Application.logout())),format.raw/*50.56*/("""">Logout</a></li> 
            </ul>
           	<!-- <form class="navbar-form pull-right">
              <input class="span2" type="text" placeholder="Email">
              <input class="span2" type="password" placeholder="Password">
              <button type="submit" class="btn">Sign in</button>
            </form> -->
            
          </div><!--/.nav-collapse -->
        </div>
      </div>
      </div>

	<div class="container">
            """),_display_(Seq[Any](/*64.14*/body)),format.raw/*64.18*/("""
	</div>
	
	    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src=""""),_display_(Seq[Any](/*70.19*/routes/*70.25*/.Assets.at("javascripts/jquery.js"))),format.raw/*70.60*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*71.19*/routes/*71.25*/.Assets.at("javascripts/bootstrap-transition.js"))),format.raw/*71.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*72.19*/routes/*72.25*/.Assets.at("javascripts/bootstrap-alert.js"))),format.raw/*72.69*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*73.19*/routes/*73.25*/.Assets.at("javascripts/bootstrap-modal.js"))),format.raw/*73.69*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*74.19*/routes/*74.25*/.Assets.at("javascripts/bootstrap-dropdown.js"))),format.raw/*74.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*75.19*/routes/*75.25*/.Assets.at("javascripts/bootstrap-scrollspy.js"))),format.raw/*75.73*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*76.19*/routes/*76.25*/.Assets.at("javascripts/bootstrap-tab.js"))),format.raw/*76.67*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*77.19*/routes/*77.25*/.Assets.at("javascripts/bootstrap-tooltip.js"))),format.raw/*77.71*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*78.19*/routes/*78.25*/.Assets.at("javascripts/bootstrap-popover.js"))),format.raw/*78.71*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*79.19*/routes/*79.25*/.Assets.at("javascripts/bootstrap-button.js"))),format.raw/*79.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*80.19*/routes/*80.25*/.Assets.at("javascripts/bootstrap-collapse.js"))),format.raw/*80.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*81.19*/routes/*81.25*/.Assets.at("javascripts/bootstrap-carousel.js"))),format.raw/*81.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*82.19*/routes/*82.25*/.Assets.at("javascripts/bootstrap-typeahead.js"))),format.raw/*82.73*/(""""></script>
    </body>
</html>

"""))}
    }
    
    def render(user:User,body:Html) = apply(user)(body)
    
    def f:((User) => (Html) => play.api.templates.Html) = (user) => (body) => apply(user)(body)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 23:43:53 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/main.scala.html
                    HASH: 75ca2920f0a3cf6372a8d270550ceffe47b7a264
                    MATRIX: 757->1|858->25|1190->321|1205->327|1266->366|1373->426|1484->491|1551->522|1566->528|1638->578|1964->868|1979->874|2033->906|3081->1918|3096->1924|3136->1942|3231->2001|3246->2007|3289->2028|3378->2081|3391->2085|3418->2090|3493->2129|3508->2135|3551->2156|4043->2612|4069->2616|4289->2800|4304->2806|4361->2841|4427->2871|4442->2877|4513->2926|4579->2956|4594->2962|4660->3006|4726->3036|4741->3042|4807->3086|4873->3116|4888->3122|4957->3169|5023->3199|5038->3205|5108->3253|5174->3283|5189->3289|5253->3331|5319->3361|5334->3367|5402->3413|5468->3443|5483->3449|5551->3495|5617->3525|5632->3531|5699->3576|5765->3606|5780->3612|5849->3659|5915->3689|5930->3695|5999->3742|6065->3772|6080->3778|6150->3826
                    LINES: 27->1|30->1|42->13|42->13|42->13|44->15|47->18|49->20|49->20|49->20|57->28|57->28|57->28|76->47|76->47|76->47|77->48|77->48|77->48|78->49|78->49|78->49|79->50|79->50|79->50|93->64|93->64|99->70|99->70|99->70|100->71|100->71|100->71|101->72|101->72|101->72|102->73|102->73|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|108->79|108->79|108->79|109->80|109->80|109->80|110->81|110->81|110->81|111->82|111->82|111->82
                    -- GENERATED --
                */
            