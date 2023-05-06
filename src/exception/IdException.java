/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author julia
 */
public class IdException extends Exception {
    public String message(){
        return "FIELD ID HARUS DIISI 5-8 DIGIT";
    }
}
