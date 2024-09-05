{ ;; Build parameters shared across all branches
  :name "Clojure"
  :page-title "Clojure Core API Reference"
  :copyright "Copyright 2007-2024 by Rich Hickey"
  :source-path ["src/clj"]
  :param-dir "../.."
  :template-dir "templates"
  :web-home "https://clojure.github.io/clojure/"
  :web-src-dir "https://github.com/clojure/clojure/blob/"
  :external-doc-tmpdir "tmp"
  :file-prefix ""
  :build-json-index false
  :build-raw-index false
  :scm-tool "git"
  :branches [{:name "clojure-1.12.0" :version "v1.12" :status "stable"}
             {:name "master" :version "v1.13" :status "in development"}
             {:name "clojure-1.11.4" :version "v1.11.4" :status "legacy"}
             {:name "clojure-1.10.3" :version "v1.10.3" :status "legacy"}
             {:name "clojure-1.9.0" :version "v1.9" :status "legacy"}
             {:name "clojure-1.8.0" :version "v1.8" :status "legacy"}
             {:name "clojure-1.7.0" :version "v1.7" :status "legacy"}
             {:name "clojure-1.6.0" :version "v1.6" :status "legacy"}
             {:name "clojure-1.5.0" :version "v1.5" :status "legacy"}
             {:name "clojure-1.4.0" :version "v1.4" :status "legacy"}
             {:name "1.3.x" :version "v1.3" :status "legacy"}
             {:name "1.2.x" :version "v1.2" :status "legacy"}
             {:name "1.1.x" :version "v1.1" :status "legacy"}]
}
