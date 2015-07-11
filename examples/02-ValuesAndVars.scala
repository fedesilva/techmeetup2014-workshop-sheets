
//
// WARNING IMPORTANT NOTE
//
// The code here works in scripting mode. In a real compiled program,
// the only top level constructs allowed are classes and objects.
// This limitation is imposed on us because of Java inter-operability.
//


//
//  Value bindings: they don't change (the reference)
//

val uno: Int = 1

// uno = 2 // ERROR

var x: Int = 1
x = 2
x = 3

// Type inference!
var ti = 1
// ti = "dos" //ERROR
ti = 2

val a = 1 + 2.0
val b = 1 + 2





