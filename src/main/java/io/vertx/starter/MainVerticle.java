package io.vertx.starter;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer()
        .requestHandler(req -> {
          req.response()
              .putHeader("content-type", "text/html")
              .end("<h2>Hello Vert.x and Eclipse Che !</h2>");
        })
        .listen(8080);
  }

}
