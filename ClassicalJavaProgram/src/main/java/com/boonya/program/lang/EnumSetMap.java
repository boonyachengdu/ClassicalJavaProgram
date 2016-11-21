package com.boonya.program.lang;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class EnumSetMap {
	
	public static void example(){
		 // EnumSet的使用
	    EnumSet<EnumDay> weekSet = EnumSet.allOf(EnumDay.class);
	    for (EnumDay day : weekSet) {
	        System.out.println(day);
	    }

	    // EnumMap的使用
	    EnumMap<EnumDay, String> weekMap = new EnumMap<EnumDay, String>(EnumDay.class);
	    weekMap.put(EnumDay.MON, "星期一");
	    weekMap.put(EnumDay.TUE, "星期二");
	    weekMap.put(EnumDay.WED, "星期三");
	    weekMap.put(EnumDay.THU, "星期四");
	    weekMap.put(EnumDay.FRI, "星期五");
	    // 遍历 EnumMap
	    for (Iterator<Entry<EnumDay, String>> iterator = weekMap.entrySet().iterator(); iterator.hasNext();) {
	        Entry<EnumDay, String> entry = iterator.next();
	        System.out.println(entry.getKey().name() + ":" + entry.getValue());
	    }
	}

}
