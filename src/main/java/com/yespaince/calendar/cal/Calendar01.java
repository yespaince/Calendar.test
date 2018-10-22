package com.yespaince.calendar.cal;

import java.util.ArrayList;
import java.util.Calendar;

public class Calendar01 {

	public ArrayList<Integer> getCal(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		int start = cal.get(Calendar.DAY_OF_WEEK) - 1; // ���� ���� (�Ͽ����� 1, ������� 7)
		int end = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // ���� ���� ��¥ (DATE�� ����)
		// getActualMaximum ���� ��ü�� Ư�� �ʵ��� �ִ� ���� ��ȯ�Ѵ�.

		if ((year % 4 == 0 || year % 400 == 0) && (year % 100 == 0)) {
			end += 1; // ���� 2�� 29��
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= start; i++) {
			arr.add(0);// ����
		}
		for (int i = 1; i <= end; i++) {
			arr.add(i);// �ش� ���� ��¥ �ֱ�
		}
		return arr;
	}
}
