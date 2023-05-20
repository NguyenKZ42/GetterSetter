package advance.dev;

public class Student {
	private int tuoi;
	private String diaChi;
	private String soDienThoai;
	private double diemTrungBinh;
	
	public Student(String ten, int tuoi, String diaChi, String soDienThoai, double diemTrungBinh) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.diemTrungBinh = diemTrungBinh;
		this.soDienThoai = soDienThoai;
		this.tuoi = tuoi;
	}

		private String ten;
		public String getTen() {
			return ten;
		}
		public void setTen(String ten) {
			this.ten = ten;
		}
		public int getTuoi() {
			return tuoi;
		}
	    public void setTuoi(int tuoi) {
	        if (tuoi > 0) {
	            this.tuoi = tuoi;
	        } else {
	            System.out.println("!!Tuoi phai lon hon 0!!");
	        }
	    }
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getSoDienThoai() {
			return soDienThoai;
		}
		public void setSoDienThoai(String soDienThoai) {
			this.soDienThoai = soDienThoai;
		}
		public double getDiemTrungBinh() {
			return diemTrungBinh;
		}
		public void setDiemTrungBinh(double diemTrungBinh) {
			if (diemTrungBinh >= 0) {
	            this.diemTrungBinh = diemTrungBinh;
	        } else {
	            System.out.println("!!Diem phai lon hon hoac bang 0!!");
	        }
	    }
		
		@Override
		public String toString() {
			return "Person [tuoi=" + tuoi + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", diemTrungBinh="
					+ diemTrungBinh + ", ten=" + ten + "]";
		}
		
			
		}

		
	


