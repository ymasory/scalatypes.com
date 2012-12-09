package com.scalatypes.site

import org.scalatra._
import scalate.ScalateSupport

class RootServlet extends ScalatraServlet with ScalateSupport {

  before() {
    contentType = "text/html"
  }

  get("/") {
    jade("index")
  }

  // get("/episodes") {
  //   jade("episodes")
  // }

  // get("/episodes/:id") {
  //   jade("episode", "id" -> params("id").toLong)
  // }

  // get("/community") {
  //   jade("community")
  // }

  get("/rss") {
    contentType = "application/rss+xml"
    jade("atom", "layout" -> "")
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
