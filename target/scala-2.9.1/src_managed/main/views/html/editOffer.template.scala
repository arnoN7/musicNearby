
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
object editOffer extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[User,Form[JobOffer],JobOffer,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User, form: Form[JobOffer], offer: JobOffer):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/main(user)/*3.12*/{_display_(Seq[Any](format.raw/*3.13*/("""
    
    <header>
        <hgroup>
            <h1>Détail de l'offre</h1>
        </hgroup>
    </header>
	"""),_display_(Seq[Any](/*10.3*/offerForm(form, FormType.Display))),format.raw/*10.36*/("""   
	
	"""),_display_(Seq[Any](/*12.3*/helper/*12.9*/.form(action = routes.ReviewManagement.upload(), 'enctype -> "multipart/form-data", 'method -> "POST")/*12.111*/ {_display_(Seq[Any](format.raw/*12.113*/("""
    
    	<input type="file" name="picture">
    	<p>
        	<input type="submit" value="Ajout Fichier">
    	</p>
    
	""")))})),format.raw/*19.3*/("""
""")))})),format.raw/*20.2*/("""

"""))}
    }
    
    def render(user:User,form:Form[JobOffer],offer:JobOffer) = apply(user,form,offer)
    
    def f:((User,Form[JobOffer],JobOffer) => play.api.templates.Html) = (user,form,offer) => apply(user,form,offer)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 18 19:58:30 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/editOffer.scala.html
                    HASH: ff907e8a48ecb4c43bd18a30b8986ac5cf312bd1
                    MATRIX: 781->1|909->52|948->57|966->67|1004->68|1155->184|1210->217|1255->227|1269->233|1381->335|1422->337|1585->469|1619->472
                    LINES: 27->1|30->1|32->3|32->3|32->3|39->10|39->10|41->12|41->12|41->12|41->12|48->19|49->20
                    -- GENERATED --
                */
            