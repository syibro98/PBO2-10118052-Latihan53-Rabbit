/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan53.rabbit;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program berbasis objek untuk mendapatkan informasi
 * hewan seperti kelinci
 */
public class Rabbit extends Animal{
    private String color, name;

    public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.color = color;
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
}
