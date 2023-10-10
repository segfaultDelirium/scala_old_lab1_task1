def isLetter(s: Char) = {
  ('a' to 'z').contains(s)
}

def main(args: Array[String]): Unit = {
  if (args.length != 2) {
    println("Please provide two arguments: start of range and end of range");
    return;
  }
  println(s"provided args: '${args(0)}', '${args(1)}'");
  val letters = args.map(arg => arg(0).toLower)
    .filter(arg => isLetter(arg))
  if (letters.length != 2) {
    println("Please provide only letters");
    println(s"provided args: ${letters.mkString}")

    // println(s"letters length = ${letters.length}")
    return;
  }
  val letter0 = letters(0);
  val letter1 = letters(1);

  val start = if letter0.toInt < letter1.toInt then letter0 else letter1
  val end = if letter0 == start then letter1 else letter0

  val letterRange = (start to end);
  letterRange.foreach(letter => println(s"${letter}"))

}
