import cats.effect.unsafe.implicits.global
import doodle.core._
import doodle.image._
import doodle.syntax.all._
import doodle.image.syntax.all._
import doodle.java2d._

//Image.circle(10)

//Image.circle(100)
//  .fillColor(Color.red)
//  .beside(Image.circle(100).fillColor(Color.red.spin(15.degrees)))
//  .beside(Image.circle(100).fillColor(Color.red.spin(30.degrees)))
//  .strokeWidth(5.0)
//  .draw()

//Image.circle(40)
//  .fillColor(Color.red.darken(0.2.normalized))
//  .beside(Image.circle(40).fillColor(Color.red))
//  .beside(Image.circle(40).fillColor((Color.red.lighten(0.2.normalized))))
//  .above(Image.rectangle(40, 40).fillColor(Color.red.desaturate(0.6.normalized))
//    .beside(Image.rectangle(40,40).fillColor(Color.red.desaturate(0.3.normalized)))
//    .beside(Image.rectangle(40,40).fillColor(Color.red)))
//  .draw()

//Image.circle(40)
//  .fillColor(Color.red.alpha(0.5.normalized))
//  .beside(Image.circle(40).fillColor(Color.blue.alpha(0.5.normalized)))
//  .on(Image.circle(40).fillColor(Color.green.alpha(0.5.normalized)))
//  .draw()

Image.triangle(50, 50)
  .fillColor(Color.burlyWood.saturate(1.normalized))
  .above(Image.triangle(50, 50).fillColor(Color.burlyWood.spin(15.degrees))
    .beside(Image.triangle(50, 50).fillColor(Color.burlyWood.spin(345.degrees))))
  .draw()
