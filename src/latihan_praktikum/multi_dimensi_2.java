/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_praktikum;

/**
 *
 * @author Bethaa
 */
public class multi_dimensi_2 {
    
  
int nis [][] = {{210651},{210651},{210652}};
    String nama [][] = {{"rizwan Dimas"},{"Nur Azmi"},{"Devita Fahma"}};

    public void tampil(){
   System.out.println("Identitas Siswa Angkatan 24");
}
    public void namanis (int n){
    for (int i = 0; i< 3; i++){
    for (int j = 0; j < 1; j++){
    System.out.println(nama[i][j]+":"+nis[i][j]);
}
}
}
public static void main (String[]args){
multi_dimensi_2 siswa = new multi_dimensi_2();
siswa.tampil();
siswa.namanis(0);
}
}


