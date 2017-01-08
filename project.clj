(defproject com.cemerick/url "0.1.2-SNAPSHOT"
  :description "Makes working with URLs in Clojure a little more pleasant."
  :url "http://github.com/cemerick/url"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [pathetic "0.5.1"]
                 [lein-doo "0.1.7"]
                 [org.clojure/clojurescript "1.9.293" :optional true]]
  :source-paths ["src"]
  :test-paths ["test"]
  :aliases {"test-cljs" ["doo" "phantom" "test" "once"]
            "cleantest" ["do" "clean," "test," "cljsbuild" "once," "doo" "phantom" "test" "once"]}
  :profiles {:dev {:dependencies []
                   :plugins      [[lein-cljsbuild "1.1.4"]
                                  [lein-doo "0.1.7"]]}}
  :cljsbuild {:builds        [{:id "test"
                               :source-paths  ["src" "test"]
                               :compiler      {:output-dir "out"
                                               :output-to  "out/testable.js"
                                               :optimizations :advanced}
                               :main cemerick.run-tests}]})
