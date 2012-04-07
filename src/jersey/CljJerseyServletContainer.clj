(ns jersey.CljJerseyServletContainer
  (:import (com.sun.jersey.spi.container.servlet ServletContainer)
           (javax.ws.rs.core Application)
           (com.sun.jersey.api.core PackagesResourceConfig)
           (java.util HashMap))
  (:gen-class :extends com.sun.jersey.spi.container.servlet.ServletContainer
              :constructors {[String] [javax.ws.rs.core.Application]}
              :state state
              :init init-state)
  )

(defn -init-state
  [packages]
  (let [hm (HashMap.)]
    (. hm put "com.sun.jersey.config.property.packages" packages)
    [[ (PackagesResourceConfig. hm)]
     (ref {})]))
