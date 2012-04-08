(defproject jersey-clj "1.0.1"
  :description "Simple way to implement jersey restful services with clojure"
  :aot [jersey.CljJerseyServletContainer jersey.Hello]
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [com.sun.jersey/jersey-servlet "1.12"]]
  :dev-dependencies [[org.eclipse.jetty/jetty-servlet "8.1.2.v20120308"]]
  :java-source-path "test/java"
  :javac-options {:debug "true" :destdir "classes/"})
