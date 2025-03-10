/**
 * File :ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Nama      : Lulu Nikita Sitanggang
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}