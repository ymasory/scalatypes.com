import com.scalatypes.site

import java.net.URI
import org.joda.time.DateTime

case class Episode(
  title: String,
  pubDate: DateTime,
  page: URI,
  thumbnail: URI,
  rating: ItunesRating,
  keywords: List[String],
  subtitle: String
)

abstract class ItunesRating(val name: String) {
  override def toString = name
}
case object ItunesExplicit extends ItunesRating("explicit")
case object ItunesClean extends ItunesRating("clean")

