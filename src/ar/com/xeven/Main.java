package ar.com.xeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>(Arrays.asList(
                new Empleado("john"),
                new Empleado("ana"),
                new Empleado("jim"),
                new Empleado("karen")
        ));

        for(Empleado e: empleados)
            System.out.println(e.nombre);

        List<Tarea> tareasPendientes = new ArrayList<>(Arrays.asList(
                new Tarea(1),
                new Tarea(2),
                new Tarea(3),
                new Tarea(4)
        ));

        List<Tarea> tareasAsignadas = new ArrayList<>();
        tareasAsignadas.add(tareasPendientes.get(0));
        tareasPendientes.remove(0);

        Tarea t = tareasPendientes.get(1);
        tareasAsignadas.add(t);
        tareasPendientes.remove(t);


	/*
	Una empresa tiene empleados gerentes y otros que no son gerentes.
	De cada empleado se sabe el nombre, dni y domicilio.

	Los gerentes tienen una lista de tareas que pueden asignar a sus empleados.
	Los empleados tienen una lista de tareas a ejecutar y pueden ejecutarlas.

	Cuando un empleado ejecuta una tarea, se agrega a una lista de tareas ejecutadas
     (y se quita de la lista de tareas pendientes).
	Cuando un gerente asigna una tarea, se agrega a una lista de tareas asignadas
	 (y se quita de la lista de tareas pendientes).
	Cada empleado puede calcular su salario.
	El salario de un gerente se calcula como la cantidad de tareas asignadas multiplicadas por 75.
	El salario de los demás empleados se calcula como la cantidad de tareas ejecutadas por 150.
	 */
    }
}
