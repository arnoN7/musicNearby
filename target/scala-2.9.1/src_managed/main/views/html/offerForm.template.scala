
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
object offerForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[JobOffer],FormType,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[JobOffer], formType: FormType):play.api.templates.Html = {
        _display_ {
def /*3.2*/formField/*3.11*/(text: String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.29*/("""
	"""),_display_(Seq[Any](/*4.3*/if((formType == FormType.New) || (formType == FormType.New))/*4.63*/ {_display_(Seq[Any](format.raw/*4.65*/("""
		<input type=""""),_display_(Seq[Any](/*5.17*/text)),format.raw/*5.21*/("""" name=""""),_display_(Seq[Any](/*5.30*/text)),format.raw/*5.34*/("""" placeholder=""""),_display_(Seq[Any](/*5.50*/text)),format.raw/*5.54*/("""" value=""""),_display_(Seq[Any](/*5.64*/form(text)/*5.74*/.value)),format.raw/*5.80*/("""">
	""")))}/*6.4*/else/*6.9*/{_display_(Seq[Any](format.raw/*6.10*/("""
		<span class="input-xlarge uneditable-input">"""),_display_(Seq[Any](/*7.48*/form(text)/*7.58*/.value)),format.raw/*7.64*/("""</span>	
	""")))})),format.raw/*8.3*/("""
""")))};
Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*9.2*/("""

	"""),_display_(Seq[Any](/*11.3*/if(formType == FormType.New)/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""
  		</div>
  		<div class="modal-body">
  	""")))})),format.raw/*14.5*/("""
    """),_display_(Seq[Any](/*15.6*/helper/*15.12*/.form(routes.JobOffers.saveOffer)/*15.45*/ {_display_(Seq[Any](format.raw/*15.47*/("""
    
    		"""),_display_(Seq[Any](/*17.8*/if(form.hasGlobalErrors)/*17.32*/ {_display_(Seq[Any](format.raw/*17.34*/(""" 
    		<p class="error">
    		"""),_display_(Seq[Any](/*19.8*/form/*19.12*/.globalError.message)),format.raw/*19.32*/("""
    		</p>
    		""")))})),format.raw/*21.8*/("""
    
    	 	"""),_display_(Seq[Any](/*23.9*/if(flash.contains("success"))/*23.38*/ {_display_(Seq[Any](format.raw/*23.40*/("""
    		<p class="success">
    			"""),_display_(Seq[Any](/*25.9*/flash/*25.14*/.get("success"))),format.raw/*25.29*/("""
        		</p>
        		""")))})),format.raw/*27.12*/("""
        
        		<p>
        			"""),_display_(Seq[Any](/*30.13*/formField("jobName"))),format.raw/*30.33*/("""
        		</p>
        		<p>
        			"""),_display_(Seq[Any](/*33.13*/formField("jobURL"))),format.raw/*33.32*/("""
        		</p>
        		<p>
        			"""),_display_(Seq[Any](/*36.13*/formField("companyName"))),format.raw/*36.37*/("""
            	</p>
            	<p>
            		<textarea 
            		class="field """),_display_(Seq[Any](/*40.29*/if((formType != FormType.New) && (formType != FormType.New))/*40.89*/ {_display_(Seq[Any](format.raw/*40.91*/("""span8""")))}/*40.98*/else/*40.103*/{_display_(Seq[Any](format.raw/*40.104*/("""span4""")))})),format.raw/*40.110*/("""" type="jobDescription" name="jobDescription" placeholder=""""),_display_(Seq[Any](/*40.170*/form("jobDescription")/*40.192*/.value)),format.raw/*40.198*/("""" rows="10" """),_display_(Seq[Any](/*40.211*/if((formType != FormType.New) && (formType != FormType.New))/*40.271*/ {_display_(Seq[Any](format.raw/*40.273*/("""readonly""")))})),format.raw/*40.282*/("""></textarea>
            	</p>
"""),_display_(Seq[Any](/*42.2*/if(formType == FormType.New)/*42.30*/ {_display_(Seq[Any](format.raw/*42.32*/("""
    </div>
  	<div class="modal-footer">
    	<button class="btn" data-dismiss="modal" aria-hidden="true">Fermer</button>
    	<button class="btn btn-primary" type="submit">Ajouter l'Offre</button>
  	</div>
""")))})),format.raw/*48.2*/("""
            
    """)))})),format.raw/*50.6*/("""
    

"""))}
    }
    
    def render(form:Form[JobOffer],formType:FormType) = apply(form,formType)
    
    def f:((Form[JobOffer],FormType) => play.api.templates.Html) = (form,formType) => apply(form,formType)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 17 23:43:53 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/offerForm.scala.html
                    HASH: 0c534832ad5a9542ae0617be4b0eeeb47ad76da1
                    MATRIX: 776->1|878->46|895->55|976->73|1013->76|1081->136|1120->138|1172->155|1197->159|1241->168|1266->172|1317->188|1342->192|1387->202|1405->212|1432->218|1454->224|1465->229|1503->230|1586->278|1604->288|1631->294|1672->305|1713->43|1741->307|1780->311|1817->339|1857->341|1933->386|1974->392|1989->398|2031->431|2071->433|2119->446|2152->470|2192->472|2260->505|2273->509|2315->529|2365->548|2414->562|2452->591|2492->593|2562->628|2576->633|2613->648|2672->675|2744->711|2786->731|2864->773|2905->792|2983->834|3029->858|3154->947|3223->1007|3263->1009|3288->1016|3302->1021|3342->1022|3381->1028|3478->1088|3510->1110|3539->1116|3589->1129|3659->1189|3700->1191|3742->1200|3809->1232|3846->1260|3886->1262|4127->1472|4177->1491
                    LINES: 27->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|38->1|40->9|42->11|42->11|42->11|45->14|46->15|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|52->21|54->23|54->23|54->23|56->25|56->25|56->25|58->27|61->30|61->30|64->33|64->33|67->36|67->36|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|73->42|73->42|73->42|79->48|81->50
                    -- GENERATED --
                */
            