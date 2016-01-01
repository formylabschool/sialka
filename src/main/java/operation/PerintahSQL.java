/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class PerintahSQL {
    final static public String database = "SIA_LPKKANIRA";
	//final static public String schema = "UNIX";
	//final static public String tabelAnggota = "ANGGOTA";
	final static public String tabelLogin = "login";
       // final static public String tabelNasabah = "nasabah";
	//final static public String tabelTransaksi = "TRANSAKSI";
		
		
	
	final static public String[] kolomLogin = {"PEMAKAI", "PSWD", "HAKAAKSES"};
      //  final static public String[] kolomNasabah = {"no_pensiun","nama_nasabah","jenis_kelamin","tglLahir","usia","p_tambahan","pl_tambahan","jml_pin_ajukan","alamat","status","kode_pos","tempat_lahir","pensiun_detail_id"};
	//final static public String[] kolomPetugas = {"KDPETUGAS", "NAMA", "ALAMAT","T4LAHIR","TGLLAHIR","KELAMIN"};
	//final static public String[] kolomRak = {"KDRAK", "NAMA", "KATEGORI1","KATEGORI2","KATEGORI3"};
	//final static public String[] kolomTransaksi = {"NOPINJAM", "TGLPINJAM", "TGLKEMBALI","DENDA","KDANGGOTA","ID","KDPETUGAS","KEMBALI"};
	
	
	public static String getPerintahInsert(String table, int jumlahKolom) {
		String nilai = "?";
		for (int n = 1; n <= jumlahKolom; n++) {
			nilai = nilai.concat(",?");
		}
		return "INSERT INTO " + table + " values(" + nilai + ")";
	}
	
	
	public static String
		getPerintahHapus(String tabel, String kolomKey, String param) {
		return "DELETE FROM " + tabel + " WHERE " + kolomKey + " = '" + param + "'";
	}

		
	public static String getPerintahSelect(String tabel) {
		return "SELECT * FROM " + tabel;
	}

	
	
	public static String getPerintahSelect(String tabel, String kolomKey, String param) {
		return "SELECT * FROM " + tabel + " where " + kolomKey + " LIKE '" + param + "'";
	}

		
	public static String
		getPerintahSelect(String tabel, String[] kolom, String[] param, int[] paramInt) {
		String klausa = kolom[0] + "='" + param[0] + "'";
		int b = 1;
		for (int a = 1; a < kolom.length; a++) {
			if (kolom.length >= 3) {
				if (b < param.length) {
					klausa = klausa.concat(" and " + kolom[a] + " = '" + param[b] + "'");
					b++;
				} else {
					b = 0;
					klausa = klausa.concat(" and " + kolom[a] + " = " + param[b]);
				}
			} else {
				klausa = klausa.concat(" and " + kolom[1] + " = " + param[1]);
				klausa = klausa.concat(" and " + kolom[2] + " = " + paramInt[0]);
			}
		}
		String statement = getPerintahSelect(tabel) + " where ".concat(klausa);
		return statement;
	}

		
	public static String getPerintahSelect(String tabel, String[] kolom, int idxKolomKey, String param) {
		String col = kolom[0];
		for (int b = 1; b < kolom.length; b++) {
			col = col.concat("," + kolom[b]);
		}
		return "SELECT " + col + " from " + tabel + " where " + kolom[idxKolomKey] + " = '" + param + "'";
	}
	
	/**method ini akan menghasilkan perintah select dengan parameter integer
	 * 
	 * @param tabel product
	 * @param kolomKey harga
	 * @param paramKecil 1000000
	 * @param paramBesar 9000000
	 * @return select * from product where harga >= 100000 and harga <= 9000000
	 */
	public static String getPerintahSelect(String tabel, String kolomKey, int paramKecil, int paramBesar) {
		return "SELECT * FROM " + tabel + " where " + kolomKey + " >= " + paramKecil + " and " + kolomKey + " <= " + paramBesar;
	}

	
	public static String getPerintahUpdate(String tabel, String[] kolom, String nilaiKunci) {
		String input = kolom[1];
		for (int a = 2; a < kolom.length; a++) {
			input = input.concat("=?," + kolom[a]);
		}
		String sqlUbah = "update " + tabel + " set " + input.concat("=?") + " where " + kolom[0] + " = '" + nilaiKunci + "'";
		return sqlUbah;
	}

    
}
