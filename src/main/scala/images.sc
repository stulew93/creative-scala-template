import cats.effect.unsafe.implicits.global
import doodle.core._
import doodle.image._
import doodle.syntax.all._
import doodle.image.syntax.all._
import doodle.java2d._
import math._

//Image.circle(10)
//Image.circle(10).draw()
//
//Image.rectangle(100, 50).draw()
//Image.triangle(60, 40).draw()
//
//Image.circle(1).draw()
//Image.circle(10).draw()
//Image.circle(100).draw()
//
//Image.circle(10).beside(Image.rectangle(10, 20)).draw()

//Image
//  .circle(20).fillColor(Color.red)
//  .beside(Image.circle(20).fillColor(Color.grey))
//  .beside(Image.circle(20).fillColor(Color.yellow))
//  .on(Image.circle(60).strokeColor(Color.blue))
//  .draw()

//Image
//  .circle(24).fillColor(Color.white).strokeWidth(2)
//  .on(Image.circle(40).fillColor(Color.white).strokeWidth(2))
//  .on(Image.circle(120))
//  .on(Image.line(120, 0).strokeWidth(2))
//  .on(ClosedPath.empty.curveTo(0,0, 60, 60, 120, 0)
//  .draw()

//val semi = ClosedPath.empty.curveTo(120, 0, 60, 45)

//val points = for (x <- 0 to 120) yield Point(x, sqrt(120 * x - pow(x, 2)))
////val pointsList: List[Point] = List(Point(0, 0), Point(60, 60), Point(120,0))
//
//Picture.interpolatingSpline(points.toList)
//  .fill
//  .draw()

Image
  .circle(20).fillColor(Color.red)
  .on(Image.circle(40).fillColor(Color.white))
  .on(Image.circle(60).fillColor(Color.red))
  .above(Image.rectangle(6, 20).fillColor(Color.brown))
  .above(Image.rectangle(20, 6).fillColor(Color.brown))
  .above(Image.rectangle(70, 5).fillColor(Color.green))
  .draw()
