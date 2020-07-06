//package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;





/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。
    	List<String> shohinList = new ArrayList<>();
    	shohinList.add(SHOP_SHOHIN_00);
    	shohinList.add(SHOP_SHOHIN_01);
    	shohinList.add(SHOP_SHOHIN_02);
    	shohinList.add(SHOP_SHOHIN_03);


        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * [生成したStudyクラスのインスタンスをHashMapインタフェース型の変数shopMapに保持している。
         * putメソッドを使って要素の追加を行う。shopListの１番目の要素"牛乳"を取り出す時、同時に180という数字も取り出す。]
         *
         */
        HashMap<String, Integer> shopMap = new HashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        
        Map<String, Integer> shopMaps = new LinkedHashMap<String, Integer>();
        shopMaps.put(shohinList.get(0), 125);
        shopMaps.put(shohinList.get(1), 180);
        shopMaps.put(shohinList.get(2), 350);
        shopMaps.put(shohinList.get(3), 100);
  
        for(HashMap.Entry<String, Integer> entry : shopMaps.entrySet()) {
        	System.out.println(entry.getKey() + "=" + entry.getValue() + "円になります！");
        }




    }
}