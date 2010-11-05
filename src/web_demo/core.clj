(ns web-demo.core
  (:use compojure.core, ring.adapter.jetty, slim.core)
  (:require [compojure.route :as route]))

(defroutes router
  (GET "/" [] (slim.core/render-template "views/index.html.slim" {:body "This is the body"}))
  (GET "/hello/:name" [name] (slim.core/render-template "views/hello.html.slim" {:name name})))
(run-jetty router {:port 8080})
