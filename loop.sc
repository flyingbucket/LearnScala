// while loop
var a = 100
var result = ""
while (a > 0) {
  result = result + a
  if (a > 1) result = result + ","
  a -= 1
}
println(result)

// functional loop
val resultFunc = (1 to 100).reverse.mkString(",")
println(resultFunc)
