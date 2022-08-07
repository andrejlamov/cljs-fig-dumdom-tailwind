(ns hello.core
  (:require [dumdom.core :as dumdom :refer [defcomponent]]
            [hello.tw-utils :refer [tw]]))

(defcomponent main1 []
  [:div (tw '[h-48 flex items-center justify-center m-8 border-8 border-purple-800 rounded-xl shadow-lg shadow-purple-400])
   [:div (tw '[text-lg font-bold]) "Hello"]])

(defcomponent main2 []
  [:div.h-48.flex.items-center.justify-center.m-8.border-8.border-red-500.rounded-xl.shadow-lg.shadow-purple-400
   [:div.text-lg.font-bold "Hello2"]])

(defcomponent root [data]
  [:div
   [main1]
   [main2]
   ]
  )

(defn re-render []
  (dumdom/render
   [:div [root {}]]
   (js/document.getElementById "app")))

(re-render)

