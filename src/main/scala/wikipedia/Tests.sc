val a = List(("Scala",999999), ("LOLCODE",982), ("JavaScript",1278),("Java",42))


a.toIterable.count(i => true)
a.sortBy(i => i._2)(Ordering[Int].reverse)