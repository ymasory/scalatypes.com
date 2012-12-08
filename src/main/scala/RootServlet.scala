package com.scalatypes.site

import org.scalatra._
import scalate.ScalateSupport

class RootServlet extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"
    jade("index")
  }

  get("/episodes") {
    contentType = "text/html"
    jade("episodes")
  }

  get("/episodes/:id") {
    contentType = "text/html"
    jade("episode", "id" -> params("id").toLong)
  }

  get("/community") {
    contentType = "text/html"
    jade("community")
  }

  get("/rss") {
    contentType = "application/rss+xml"
    jade("rss")
  }

  notFound {
    // remove content type in case it was set through an action
    contentType = null
    // Try to render a ScalateTemplate if no route matched
    findTemplate(requestPath) map { path =>
      contentType = "text/html"
      layoutTemplate(path)
    } orElse serveStaticResource() getOrElse resourceNotFound()
  }
}
