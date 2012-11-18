
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
object newOffer extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,Form[JobOffer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User, form: Form[JobOffer]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

<a href="#myModal" role="button" class="btn" data-toggle="modal">Ajouter une offre d'emploi</a>
 
<!-- Modal -->
<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-header">
    	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    		<h3 id="myModalLabel">Ajouter ici une offre d'emploi</h3>
	"""),_display_(Seq[Any](/*10.3*/offerForm(form, FormType.New))),format.raw/*10.32*/("""
</div>
    

"""))}
    }
    
    def render(user:User,form:Form[JobOffer]) = apply(user,form)
    
    def f:((User,Form[JobOffer]) => play.api.templates.Html) = (user,form) => apply(user,form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 23:43:53 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/newOffer.scala.html
                    HASH: 6a5b2e30adf182b943b6f90574e730a47e68d0bc
                    MATRIX: 771->1|882->35|1339->457|1390->486
                    LINES: 27->1|30->1|39->10|39->10
                    -- GENERATED --
                */
            