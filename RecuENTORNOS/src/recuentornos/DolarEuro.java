/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuentornos;

/**
 *
 * @author carlo
 */
public class DolarEuro {
    /**
     * MÃ©todo para convertir los dolares a euros.
     * @param dollar Variable de tipo double.
     * @return Devuelve la variable dollar convertidos a euros.
     */
    public double dollar2euro(double dollar) {
        return (dollar * 0.88);
    }

    /**
     * MÃ©todo para convertir los euros a dolares.
     * @param euro Variable de tipo double.
     * @return Devuelve la variable dollar convertidos a dolares.
     */
    public double euro2dollar(double euro) {
        return (euro * 1.13);
    }
}
