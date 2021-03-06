(defproject bench "0.1.0"
  :description "Compare diffing alternatives"
  :url "https://github.com/juji-io/editscript"
  :lein-release {:deploy-via :clojars}
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/math.combinatorics "0.1.6"]
                 [org.clojure/test.check "0.10.0"]
                 [criterium "0.4.6"]
                 [com.taoensso/nippy "2.14.0"]
                 [differ "0.3.3"]
                 [lambdaisland/deep-diff2 "2.0.0-93"]
                 [juji/editscript "0.4.3"]])
