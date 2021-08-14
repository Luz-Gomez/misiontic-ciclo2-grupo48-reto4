package co.edu.utp.misiontic2022.c2;
import co.edu.utp.misiontic2022.c2.view.ReportesView;

public class App 
{
    public static void main( String[] args )
    {
        var vista = new ReportesView();
        vista.proyectosFinanciadosPorBanco("Davivienda");
        vista.totalPagadoPorProyectosSuperioresALimite(50_000d);
        vista.lideresQueMenosGastan();
    }
}