package xyz.mattclifton.swagger.codegen

import io.swagger.models.Model
import io.swagger.models.properties.Property
import scala.collection.convert.wrapAsScala._

class ClassReader(model: Model) {
  def properties: Seq[SwaggerProperty] = {
    model.getProperties.entrySet().map(p => SwaggerProperty(p.getKey, p.getValue.getType)).toSeq
  }

  def name: String = model.getTitle
}

case class SwaggerProperty(name: String, scalaType: String)