package com.ivs;

public class NhanVien {
	private String MaNV;	// Mã nhân viên
	private String HoTen;
	private boolean GioiTinh;
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String maNV, String hoTen, boolean gioiTinh) {
		super();
		MaNV = maNV;
		HoTen = hoTen;
		GioiTinh = gioiTinh;
	}

	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public boolean isGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	
	
	
}
