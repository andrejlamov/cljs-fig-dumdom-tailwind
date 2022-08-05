(ns hello.core
  (:require [dumdom.core :as dumdom :refer [defcomponent]]))

(defcomponent heading
  :on-render (fn [dom-node val old-val])
  [data]
  [:h2.bg-red-400 (:text data)])

(defcomponent page [data]
  [:div
    [heading (:heading data)]
    [:div.text-xs (:body data)]])

(defn re-render []
  (dumdom/render
   [page {:heading {:text "Hello "}
          :body "This is a web page"}]
   (js/document.getElementById "app")))

(re-render)

