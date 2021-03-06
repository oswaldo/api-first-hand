package security.api


    import de.zalando.play.controllers.ArrayWrapper

    import de.zalando.play.controllers.PlayPathBindables


//noinspection ScalaStyle
package object yaml {

    type PetsIdGetId = ArrayWrapper[String]
    type PetsIdGetResponses200 = Seq[Pet]
    type PetTag = Option[String]


import play.api.mvc.{QueryStringBindable, PathBindable}

    implicit val bindable_ArrayWrapperStringPath: PathBindable[ArrayWrapper[String]] = PlayPathBindables.createArrayWrapperPathBindable[String]("csv")

}
//noinspection ScalaStyle
package yaml {


    case class ErrorModel(code: Int, message: String) 
    case class Pet(name: String, tag: PetTag) 


}
