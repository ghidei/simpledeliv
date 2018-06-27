package simpledeliv

object Main extends App {

  val simpleDeliv = new SimpleDeliv
  simpleDeliv.run()

  def verifyCorrectness(): Boolean = {
    simpleDeliv.verifyPostWithoutAssert()
  }

}
