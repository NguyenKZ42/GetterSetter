package advance.dev;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		input(students);
		print(students);
		sortStudentsByAverageScore(students);
		System.out.println("----------------");
		System.out.println("Hoc sinh sau khi xep:");
		System.out.println("----------------");
		print(students);
		
	}
	public static void print(Student[] students) {
        System.out.println("Danh sach hoc sinh:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Hoc sinh " + (i + 1) + ":");
            System.out.println("Ten: " + students[i].getTen());
            System.out.println("Tuoi: " + students[i].getTuoi());
            System.out.println("Dia chi: " + students[i].getDiaChi());
            System.out.println("So:" + students[i].getSoDienThoai());
            System.out.println("Diem trung binh: " + students[i].getDiemTrungBinh());
           
        }
	}
    public static void input(Student[] students) {
    	Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < students.length; i++) {
    		System.out.format("Hoc sinh [%d]", i + 1);
    		System.out.println();
    		System.out.println("Nhap ten");
    		String ten = sc.next();
    		System.out.println("Nhap tuoi");
    		int tuoi = sc.nextInt();
    		System.out.println("Nhap dia chi");
    		String diaChi = sc.next();
    		System.out.println("Nhap so dien thoai");
    		String soDienThoai = sc.next();
    		System.out.println("Nhap diem trung binh");
    		double diemTrungBinh = sc.nextDouble();
    		students[i] = new Student(ten, tuoi, diaChi, soDienThoai, diemTrungBinh);}
			
		}
    
    public static void sortStudentsByAverageScore(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Double.compare(s1.getDiemTrungBinh(), s2.getDiemTrungBinh()));
    }
    
	}


