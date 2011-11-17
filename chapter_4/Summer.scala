import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[string]) {
    for (arg <- args)
      println(arg +": "+ calculate(arg))
  }
}
