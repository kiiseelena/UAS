/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author kieee
 */
public interface InterfaceAC {
    public static final int KEADAAN_HIDUP=1;
    public static final int KEADAAN_MATI=0;

    public abstract void hidupkanAC();
    public abstract void matikanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
} 