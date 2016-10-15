package xyz.mattclifton.swagger.codegen.tests

import io.swagger.models.properties.{StringProperty, Property}
import io.swagger.models.{ModelImpl, Model}
import org.specs2.mutable._
import xyz.mattclifton.swagger.codegen.{SwaggerProperty, ClassReader}
import scala.collection.convert.decorateAll._

class ClassReaderSpec extends Specification {
  "ClassReader" should {
    "return expected properties" in {
      val model = new ModelImpl()
      model.setProperties(Map(("name", new StringProperty().asInstanceOf[Property])).asJava)
      val reader = new ClassReader(model)
      reader.properties must containTheSameElementsAs(Seq(SwaggerProperty("name", "string")))
    }
  }

}
