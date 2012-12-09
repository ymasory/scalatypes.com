import com.scalatypes.site

case class Episode(
  title: String,
  pubDate: DateTime,
  page: URI,
  thumbnail: URI,
  audio: Audio,
  rating: ItunesRating,
  keywords: List[String],
  subtitle: String
)

abstract class ItunesRating(val name: String) {
  override def toString = name
}
case object ItunesExplicit extends ItunesRating("explicit")
case object ItunesClean extends ItunesRating("clean")

