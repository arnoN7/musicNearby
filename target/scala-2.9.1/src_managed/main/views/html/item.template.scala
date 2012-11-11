
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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[SoundProject,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(project: SoundProject):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.25*/("""

<li data-project=""""),_display_(Seq[Any](/*3.20*/project/*3.27*/.id)),format.raw/*3.30*/("""">
    <a class="name">"""),_display_(Seq[Any](/*4.22*/project/*4.29*/.name)),format.raw/*4.34*/("""</a>
    <button class="delete" href=""""),_display_(Seq[Any](/*5.35*/routes/*5.41*/.SoundProjects.delete(project.id))),format.raw/*5.74*/("""">Delete</button>
    <span class="loader">Loading</span>
</li>
"""))}
    }
    
    def render(project:SoundProject) = apply(project)
    
    def f:((SoundProject) => play.api.templates.Html) = (project) => apply(project)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 07 23:27:19 CET 2012
                    SOURCE: C:/play-2.0.3/musicNearby/app/views/item.scala.html
                    HASH: 6546bec0d53ee68fa03d79a7c3f6c7ecba845d78
                    MATRIX: 760->1|860->24|916->45|931->52|955->55|1014->79|1029->86|1055->91|1129->130|1143->136|1197->169
                    LINES: 27->1|30->1|32->3|32->3|32->3|33->4|33->4|33->4|34->5|34->5|34->5
                    -- GENERATED --
                */
            