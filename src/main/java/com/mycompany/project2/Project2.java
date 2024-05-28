/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import ar.edu.unju.fi.proyecto2.model.Medico;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 54381
 */
public class Project2 {

    public static void main(String[] args) {
        
        List<Medico> listaMedicos= new ArrayList<>();
        cargar(listaMedicos);
        System.out.println("Cantidad de Medicos: "+ listaMedicos.size());
        mostrar(listaMedicos);
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese numero de documento a buscar");
        int dni=teclado.nextInt();
        Medico medicoEncotrado= buscar(dni,listaMedicos);      
        if(medicoEncotrado != null){
            System.out.println("Encontrado ---> "+ medicoEncotrado);
        }else{
            System.out.println("No existe el medico con documento "+ dni);
        }
    }

    private static void mostrar(List<Medico> listaMedicos) {
        for (Medico medico : listaMedicos){
            System.out.println(medico);
        }
    }

    private static Medico buscar(int dni, List<Medico> listaMedicos) {
         for (Medico medico : listaMedicos){
            if(medico.getDni()==dni){
                //System.out.println("Encontrado: "+ medico);
                return medico;
            }
        }
         return null;
    }

    private static void cargar(List<Medico> listaMedicos) {
       Medico medico1= new Medico();
        medico1.setDni(1000);
        medico1.setNombre("juan perez");
        medico1.setMatricula(12);
        medico1.setEspecialidad("clinico");
        medico1.setFechaIngreso(LocalDate.now());
        
        Medico medico2= new Medico();
        medico2.setDni(1001);
        medico2.setNombre("Marian lopez");
        medico2.setMatricula(15);
        medico2.setEspecialidad("cirujano");
        medico2.setFechaIngreso(LocalDate.now());
        
        Medico medico3=new Medico(1103,"Daniel segundo",14,LocalDate.now(),"traumatologo");
        Medico medico4=new Medico(1110,"Carlos segundo",20,LocalDate.now(),"pediatra");
        
        listaMedicos.add(medico1);
        listaMedicos.add(medico2);
        listaMedicos.add(medico3);
        listaMedicos.add(medico4);
        
        System.out.println("hola generando cambios patra el commmit");
    }
}
