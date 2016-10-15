package xyz.mattclifton.swagger.codegen

import io.swagger.parser.SwaggerParser

class ClassGenerator {
  def generate(): Unit = {
    val parser = new SwaggerParser().read("")
    parser.getDefinitions.get().getProperties().entrySet()
  }
}
