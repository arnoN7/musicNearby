
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
object myJobOffers extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[JobOffer],User,Form[JobOffer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(myJobOffers: List[JobOffer], user: User, form: Form[JobOffer]):play.api.templates.Html = {
        _display_ {
def /*3.2*/OfferOverview/*3.15*/(jobOffer: JobOffer):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.39*/("""
<tr>
	<td>
		<a href=""""),_display_(Seq[Any](/*6.13*/routes/*6.19*/.JobOffers.editJobs(jobOffer.id))),format.raw/*6.51*/("""">"""),_display_(Seq[Any](/*6.54*/jobOffer/*6.62*/.jobName)),format.raw/*6.70*/("""</a>
	</td>
	<td>"""),_display_(Seq[Any](/*8.7*/jobOffer/*8.15*/.companyName)),format.raw/*8.27*/("""</td>
	<td><a href=""""),_display_(Seq[Any](/*9.16*/jobOffer/*9.24*/.jobURL)),format.raw/*9.31*/("""" target="_blank">"""),_display_(Seq[Any](/*9.50*/jobOffer/*9.58*/.jobURL)),format.raw/*9.65*/("""</a></td>
	<td>
      <div class="dropdown">
        <a class="dropdown-toggle" id="drop5" role="button" data-toggle="dropdown" href="#">
        	"""),_display_(Seq[Any](/*13.11*/jobOffer/*13.19*/.status.toString())),format.raw/*13.37*/(""" <b class="caret"></b></a>
        <ul id="menu2" class="dropdown-menu" role="menu" aria-labelledby="drop5">
          <li><a tabindex="-1" href="#">"""),_display_(Seq[Any](/*15.42*/Status/*15.48*/.New.toString())),format.raw/*15.63*/("""</a></li>
          <li><a tabindex="-1" href="#">"""),_display_(Seq[Any](/*16.42*/Status/*16.48*/.Applied.toString())),format.raw/*16.67*/("""</a></li>
          <li><a tabindex="-1" href="#">"""),_display_(Seq[Any](/*17.42*/Status/*17.48*/.Interview_Scheduled.toString())),format.raw/*17.79*/("""</a></li>
          <li><a tabindex="-1" href="#">"""),_display_(Seq[Any](/*18.42*/Status/*18.48*/.Declined.toString())),format.raw/*18.68*/("""</a></li>
        </ul>
      </div>
	</td>
	<td>
	"""),_display_(Seq[Any](/*23.3*/helper/*23.9*/.form(routes.JobOffers.delete( jobOffer.id ))/*23.54*/ {_display_(Seq[Any](format.raw/*23.56*/("""
		<input type="submit" value="Supprimer">
    """)))})),format.raw/*25.6*/("""
	</td>
</tr>
""")))};def /*33.2*/header/*33.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*33.38*/("""
    <th class=""""),_display_(Seq[Any](/*34.17*/key/*34.20*/.replace(".","_"))),format.raw/*34.37*/(""" header">
        <a href="#">"""),_display_(Seq[Any](/*35.22*/title)),format.raw/*35.27*/("""</a>
    </th>
""")))};
Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*28.2*/("""

"""),format.raw/*32.37*/("""
"""),format.raw/*37.2*/("""

"""),_display_(Seq[Any](/*39.2*/main(user)/*39.12*/{_display_(Seq[Any](format.raw/*39.13*/("""
    
    <header>
        <hgroup>
            <h1>Mes offres d'emploi</h1>
        </hgroup>
    </header>
	<div class="row">
		<div class="span6">
        	<form action="#" method="GET">
          	  <input type="search" id="searchbox" name="f" placeholder="Filtrer les offres par nom">
           	  <input type="submit" id="searchsubmit" value="Filtrer par nom" class="btn primary">
       		</form>
       	</div>
       	<div class="span3">
       		"""),_display_(Seq[Any](/*54.11*/newOffer(user, form))),format.raw/*54.31*/("""
        </div>
    </div>
    <table class="table table-striped table-hover">
    <thead>
    	<tr>
        	"""),_display_(Seq[Any](/*60.11*/header("name", "Nom du poste"))),format.raw/*60.41*/("""
            """),_display_(Seq[Any](/*61.14*/header("introduced", "Entreprise"))),format.raw/*61.48*/("""
            """),_display_(Seq[Any](/*62.14*/header("company.name", "Lien vers l'offre"))),format.raw/*62.57*/("""
            """),_display_(Seq[Any](/*63.14*/header("discontinued", "Statut"))),format.raw/*63.46*/("""
            """),_display_(Seq[Any](/*64.14*/header("company.name", ""))),format.raw/*64.40*/("""
		</tr>
	</thead>
    	"""),_display_(Seq[Any](/*67.7*/if( myJobOffers != null)/*67.31*/ {_display_(Seq[Any](format.raw/*67.33*/("""
		"""),_display_(Seq[Any](/*68.4*/for(jobOffer <- myJobOffers) yield /*68.32*/ {_display_(Seq[Any](format.raw/*68.34*/("""
				"""),_display_(Seq[Any](/*69.6*/OfferOverview(jobOffer))),format.raw/*69.29*/("""
		""")))})),format.raw/*70.4*/("""
		""")))})),format.raw/*71.4*/("""
	</table>   
""")))})),format.raw/*73.2*/("""

"""))}
    }
    
    def render(myJobOffers:List[JobOffer],user:User,form:Form[JobOffer]) = apply(myJobOffers,user,form)
    
    def f:((List[JobOffer],User,Form[JobOffer]) => play.api.templates.Html) = (myJobOffers,user,form) => apply(myJobOffers,user,form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 23:43:53 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/myJobOffers.scala.html
                    HASH: 6024e73384e23da6c63960d130a9e410b5ed14c8
                    MATRIX: 789->1|912->67|933->80|1020->104|1079->128|1093->134|1146->166|1184->169|1200->177|1229->185|1281->203|1297->211|1330->223|1386->244|1402->252|1430->259|1484->278|1500->286|1528->293|1712->441|1729->449|1769->467|1955->617|1970->623|2007->638|2094->689|2109->695|2150->714|2237->765|2252->771|2305->802|2392->853|2407->859|2449->879|2536->931|2550->937|2604->982|2644->984|2723->1032|2761->1159|2775->1165|2869->1195|2922->1212|2934->1215|2973->1232|3040->1263|3067->1268|3122->64|3151->1047|3181->1157|3209->1284|3247->1287|3266->1297|3305->1298|3799->1756|3841->1776|3988->1887|4040->1917|4090->1931|4146->1965|4196->1979|4261->2022|4311->2036|4365->2068|4415->2082|4463->2108|4523->2133|4556->2157|4596->2159|4635->2163|4679->2191|4719->2193|4760->2199|4805->2222|4840->2226|4875->2230|4921->2245
                    LINES: 27->1|29->3|29->3|31->3|34->6|34->6|34->6|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|37->9|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|51->23|51->23|53->25|56->33|56->33|58->33|59->34|59->34|59->34|60->35|60->35|63->1|65->28|67->32|68->37|70->39|70->39|70->39|85->54|85->54|91->60|91->60|92->61|92->61|93->62|93->62|94->63|94->63|95->64|95->64|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|101->70|102->71|104->73
                    -- GENERATED --
                */
            