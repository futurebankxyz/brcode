(defproject clj-brcode "0.1.0-SNAPSHOT"
  :description "Clojure wrapper of Rust's `brcode` parser and emitter"
  :url "http:https://github.com/naomijub/brcode"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.github.jnr/jnr-ffi "2.1.16"]]
  :main ^:skip-aot clj-brcode.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
