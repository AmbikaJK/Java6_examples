package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import obj.EventSet;


public class DateBucketingLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		/*List<EventSet> eventSetLst = new ArrayList<EventSet>(); 
		Map<String, List<EventSet>> eventBucketMap = new HashMap<String, List<EventSet>>();
		populateEventList(eventSetLst);
		
		for (EventSet eventSet : eventSetLst) {
			System.out.println(eventSet.getEvent() + "-----" + eventSet.getDate());
			SimpleDateFormat ddMMMyyyy = new SimpleDateFormat("M/d");
			Date date = eventSet.getDate();
			String lbl = ddMMMyyyy.format(date);
			List<EventSet> eventSetLst1 = eventBucketMap.get(lbl);
			if (eventSetLst1 == null) {
				eventSetLst1 = new ArrayList<EventSet>();
				eventBucketMap.put(lbl, eventSetLst1);
			}
			eventSetLst1.add(eventSet);		
		}
		
		for (Entry<String, List<EventSet>> eventSetLst2 : eventBucketMap.entrySet()) {
			System.out.println("$$$$$key---" + eventSetLst2.getKey());
			for (EventSet eventSet : eventSetLst2.getValue()) {
				System.out.println("\t\t---" + eventSet.getEvent());
			}
		}*/
		
		
		//2.
		List<EventSet> eventSetLst = new ArrayList<EventSet>();
		Map<String,Map<String, List<EventSet>>> map = new HashMap<String,Map<String, List<EventSet>>>();
		
		Map<String, List<EventSet>> eventBucketMap = new HashMap<String, List<EventSet>>();
		populateEventList(eventSetLst);
		
		for (EventSet eventSet : eventSetLst) {
			System.out.println(eventSet.getEvent() + "-----" + eventSet.getDate());
			SimpleDateFormat ddMMMyyyy1 = new SimpleDateFormat("MMM dd");
			
			SimpleDateFormat ddMMMyyyy = new SimpleDateFormat("M/d");
			Date date = eventSet.getDate();
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			Date date1 = cal.getTime();
			String lbl1 = "Week of " + ddMMMyyyy.format(date1);
			System.out.println("week $$$" + lbl1);
			String lbl = ddMMMyyyy.format(date);
			List<EventSet> eventSetLst1 = eventBucketMap.get(lbl);
			if (eventSetLst1 == null) {
				eventSetLst1 = new ArrayList<EventSet>();
				eventBucketMap.put(lbl, eventSetLst1);
			}
			eventSetLst1.add(eventSet);		
		}
		
		/*for (Entry<String, List<EventSet>> eventSetLst2 : eventBucketMap.entrySet()) {
			System.out.println("$$$$$key---" + eventSetLst2.getKey());
			for (EventSet eventSet : eventSetLst2.getValue()) {
				System.out.println("\t\t---" + eventSet.getEvent());
			}
		}*/
		
		
		
		

	}

	private static void populateEventList(List<EventSet> eventSetLst) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 15 ; i++) {
			EventSet eSet = new EventSet();
			Calendar cal = Calendar.getInstance();
			if (i%2 == 0) {
				cal.set(Calendar.DAY_OF_YEAR,-i);
			}
			eSet.setDate(cal.getTime());
			eSet.setEvent("today" + i);
			eventSetLst.add(eSet);
		}
		/*EventSet eSet = new EventSet();
		eSet.setDate(new Date());
		eSet.setEvent("today");*/
		
	}

}
