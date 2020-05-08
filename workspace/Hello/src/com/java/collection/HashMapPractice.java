package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.*;
import java.util.Scanner;
import java.util.Set;

class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
	}
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

}

public class HashMapPractice {
	
	public static void getScores(HashMap<Integer, Score> hm) {
		//1.
		System.out.println("(1) k, v ����ϱ�( keySet()-for() )");
		Set<Integer> set2 = hm.keySet();
		for(int i : set2) {
			System.out.println(i + "\t" + hm.get(i).getName()
					+ "\t" + hm.get(i).getKor()
					+ "\t" + hm.get(i).getEng()
					+ "\t" + hm.get(i).getMath());
		}
		//2.
		Set<Entry<Integer, Score>> set = hm.entrySet();
		for(Entry<Integer, Score> e : set) {
			System.out.println(e.getKey() + "\t" + e.getValue().getName()
					+ "\t" + e.getValue().getKor()
					+ "\t" + e.getValue().getEng()
					+ "\t" + e.getValue().getMath());
		}
		//3. �������� ���
		Set<Integer> set3 = hm.keySet();
		Iterator<Integer> itr = set3.iterator();
		while(itr.hasNext()) {
			Integer j = itr.next();
			System.out.println(j + "\t" + hm.get(j).getName()
					+ "\t" + hm.get(j).getKor()
					+ "\t" + hm.get(j).getEng()
					+ "\t" + hm.get(j).getMath());
		}
	}
	
	public static void main(String[] args) {
		/* Q) Generics�� ����� HashMap Ŭ������ �л��̸�, ����, ����, ���� ������ ���� ��ü�� �ʱ�ġ�� ���� ��
		 * �޼ҵ� ���ǹ��� ���ڷ� �տ��� ���� HashMap�� �����Ͽ� �޼ҵ� ���ǹ����� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 * (��, �ؽ��� key�� ������ Integer�� ����Ͻÿ� ���� ������ �� getter & setter�� �ۼ��Ͻÿ�)
		 * - ��� ����
		 * ������	100	100	100
		 * ����	90	90	100
		 * ����	100	95	100
		 */
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Score> scores = new HashMap<Integer, Score>();
		int i = 1;
		while(scores.size()<3) {
			System.out.println(i + "��° �л�");
			System.out.print("�̸� �Է� : ");
			String name = sc.next();
			System.out.print("���� ���� �Է� : ");
			int kor = Integer.parseInt(sc.next());
			System.out.print("���� ���� �Է� : ");
			int eng = Integer.parseInt(sc.next());
			System.out.print("���� ���� �Է� : ");
			int math = Integer.parseInt(sc.next());
			System.out.println();
			
			Score s = new Score(name, kor, eng, math);
			scores.put(i, s);
			i++;
		} sc.close();
	
		getScores(scores);
		
	}

}
